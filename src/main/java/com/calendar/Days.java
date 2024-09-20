package com.calendar;
import java.util.ArrayList;
import java.util.List;

public class Days {
    private List<Events> events;
    private boolean dayOff;

    public Days() {
        events = new ArrayList<>();
        dayOff = false;
    }

    public List<Events> getEvents() {
        return events;
    }

    public boolean isSlotAvailable(Events newEvent) {
        if (dayOff) {
            //System.out.println("Events cannot be assigned on DAYOFF days");
            return false; 
        }
        if(events.isEmpty()){
            return true;
        }else{
            for (Events event : events) {
                if(event != null && event.isBooked()){
                    int newSH = newEvent.getStartHour();
                    int newEH = newEvent.getEndHour();
                    int oldEH = event.getEndHour();
                    int newSM = newEvent.getStartMinute();
                    int oldEM = event.getEndMinute();
                    int oldSH = event.getStartHour();
                    int newEM = newEvent.getEndMinute();
                    int oldSM = event.getStartMinute();
                    boolean condition = (newSH < oldEH || (newSH == oldEH && newSM < oldEM )) && (newEH > oldSH || (newEH == oldSH && newEM > oldSM));
                                                          
                    if(condition){
                        System.out.println("Event Overlaps");
                        return false;
}
                }
            }
        }
        return true;
    }

    public void bookEvent(Events event) {
        events.add(event);
    }

    public boolean deleteEventByName(String title) {
        for (int i = 0; i < events.size(); i++) {
            if (events.get(i).getEventTitle().equals(title)) {
                events.remove(i);
                return true;
            }
        }
        return false;
    }
    
    // Method to shift event time frame on the same day
    public boolean shiftEventSameDay(String title, int newStartHour, int newStartMinute, int newEndHour, int newEndMinute) {
        for (Events event : events) {
            if (event.getEventTitle().equals(title)) {
                Events newEvent = new Events(title, newStartHour, newStartMinute, newEndHour, newEndMinute);
                //Checks the new time frame whether that slot is available or not
                if (isSlotAvailable(newEvent)) {
                    // Remove the old event
                    deleteEventByName(title);
                    // Add the updated event
                    bookEvent(newEvent);
                    return true;
                }else{
                    //System.out.println("Failed to shfit ");
                    return false;
                }
                //return false;
            }
        }
        System.out.println("Failed to shfit. There is no event named as "+title );
        return false; // Event not found
    }

    public void assignDayOff(String date) {
        dayOff = true;
        Events newEvent = new Events("DAY-OFF", 0, 0, 24, 0);
        bookEvent(newEvent);
    }

    public void removeDayOff() {
        dayOff = false;
    }

    public boolean getDayOff() {
        return dayOff;
    }
}
