package com.calendar;

//import java.util.ArrayList;
//import java.util.List;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Month{
    private Map<String, Days> days;
    private int monthSize;
    //private List<Days> days;

    public Month() {
        this.monthSize = 31;
        this.days = new HashMap<>();
        for (int i = 1; i <= 31; i++) {
            String dayName = "2024-07-" + String.format("%02d", i);
            days.put(dayName, new Days());
        }
    }
    public Days getDay(String date){
        return days.get(date);
    }
    public boolean bookRecurringEvent(String date, Events event, String recurrencePattern){
        boolean success = true;
        //converts date into YYYY-MM-DD format
        LocalDate cDate = LocalDate.parse(date, DateTimeFormatter.ISO_LOCAL_DATE);
        int dayNumber = cDate.getDayOfMonth();
        switch(recurrencePattern.toUpperCase()) {
            case "SINGLE":
                Days day1 = days.get(date);
                if(day1 == null){
                    System.out.println("YES");
                }else{
                    System.out.println("No");
                }
                if (day1 != null && day1.isSlotAvailable(event)) {
                    event.setIsBooked(true);
                    event.setIsRecurring(false);
                    day1.bookEvent(event);
                } else {
                    success = false;
                }
                break;
                // Book meeting daily
            case "DAILY":
                
                for (int i = dayNumber; i <= 31; i++) {
                    String dayKey = "2024-07-" + (i < 10 ? "0" + i : i);
                    Days day2 = days.get(dayKey);
                    if (day2 != null && !day2.isSlotAvailable(event)) {
                        success = false;
                        break;
                    }
                }
                if (success) {
                    for (int i = dayNumber; i <= 31; i++) {
                        String dayKey = "2024-07-" + (i < 10 ? "0" + i : i);
                        Days day = days.get(dayKey);
                        if (day != null) {
                            event.setIsBooked(true);
                            event.setIsRecurring(true);
                            day.bookEvent(event);
                        }
                    }
                }
                break;
                // Book meeting weekly
            case "WEEKLY":
                for (int i = dayNumber; i <= 31; i += 7) {
                    String dayKey = "2024-07-" + (i < 10 ? "0" + i : i);
                    Days day = days.get(dayKey);
                    if (day != null && !day.isSlotAvailable(event)) {
                        success = false;
                        break;
                    }
                }
                if (success) {
                    for (int i = dayNumber; i <= 31; i += 7) {
                        String dayKey = "2024-07-" + (i < 10 ? "0" + i : i);
                        Days day = days.get(dayKey);
                        if (day != null) {
                            event.setIsBooked(true);
                            event.setIsRecurring(true);
                            day.bookEvent(event);
                        }
                    }
                }
                break;
            default:
                success = false;
        }
        return success;
    }
    public boolean recurranceCheck(String title){
    int count = 0;
    for (Days day : days.values()) {
        for (Events event : day.getEvents()) {
            if (event.getEventTitle().equals(title)){
                count++;
            }
            if (count > 1) {
                return true;
            }
        }
    }
    return false;
}
    public void deleteRecurringEvent(String title) {
        for(Days day : days.values()){
            day.deleteEventByName(title);
        }
    }
    
    //Checks whether the dayOfWeek is saturday or sunday
    public boolean isWeekend(String date) {
        LocalDate ldate = LocalDate.parse(date, DateTimeFormatter.ISO_LOCAL_DATE);
        int dayOfWeek = ldate.getDayOfWeek().getValue();
        return (dayOfWeek == 6 || dayOfWeek == 7);
    }
    
    public boolean assignDayOff(String date) {
        Days day = days.get(date);
        //Checks if day is invalid or already a day off
        if (day == null || day.getDayOff()) {
            return false; 
        }
        //Checks the day if already asssigned with events
        if (!day.getEvents().isEmpty()) {
            return false;
        }
        day.assignDayOff(date);
        return true;
    }
     // Method to shift event to a new day
    public boolean shiftEventNewDay(String oldDate, String title, String newDate, int newStartHour, int newStartMinute, int newEndHour, int newEndMinute) {
        Days oldDay = getDay(oldDate);
        Days newDay = getDay(newDate);
        if(oldDay != null && newDay != null){
            // Remove the event from the old date
            Events newEvent = new Events(title, newStartHour, newStartMinute, newEndHour, newEndMinute);
            if(newDay.isSlotAvailable(newEvent)){
                if(oldDay.deleteEventByName(title)){
                    newDay.bookEvent(newEvent);
                    return true;
                }
            }else{
                //System.out.println("Failed to shift.  Given slot isn't available");
                return false;
            }
        }
        return false;
    }
}
