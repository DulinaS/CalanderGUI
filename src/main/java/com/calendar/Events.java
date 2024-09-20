package com.calendar;

public class Events {
    private String eventTitle;
    private int startHour, startMinute, endHour, endMinute;
    //private int date, month, year;
    private boolean isBooked;
    private boolean isRecurring; 
    
    public Events(String title, int startHour, int startMinute, int endHour, int endMinute) {
        this.eventTitle = title;
        this.startHour = startHour;
        this.startMinute = startMinute;
        this.endHour = endHour;
        this.endMinute = endMinute;
        //this.date = 0;
        //this.month = 0;
        //this.year = 0;
        this.isBooked = false;
        this.isRecurring = false; //Reccuring = false for single meeting
    }

    /**
     * @return the eventTitle
     */
    public String getEventTitle() {
        return eventTitle;
    }

    /**
     * @param eventTitle the eventTitle to set
     */
    public void setEventTitle(String eventTitle) {
        this.eventTitle = eventTitle;
    }

    /**
     * @return the startHour
     */
    public int getStartHour() {
        return startHour;
    }

    /**
     * @param startHour the startHour to set
     */
    public void setStartHour(int startHour) {
        this.startHour = startHour;
    }

    /**
     * @return the startMinute
     */
    public int getStartMinute() {
        return startMinute;
    }

    /**
     * @param startMinute the startMinute to set
     */
    public void setStartMinute(int startMinute) {
        this.startMinute = startMinute;
    }

    /**
     * @return the endHour
     */
    public int getEndHour() {
        return endHour;
    }

    /**
     * @param endHour the endHour to set
     */
    public void setEndHour(int endHour) {
        this.endHour = endHour;
    }

    /**
     * @return the endMinute
     */
    public int getEndMinute() {
        return endMinute;
    }

    /**
     * @param endMinute the endMinute to set
     */
    public void setEndMinute(int endMinute) {
        this.endMinute = endMinute;
    }

    /**
     * @return the isBooked
     */
    public boolean isBooked() {
        return isBooked;
    }

    /**
     * @param isBooked the isBooked to set
     */
    public void setIsBooked(boolean isBooked) {
        this.isBooked = isBooked;
    }

    /**
     * @return the isRecurring
     */
    public boolean isIsRecurring() {
        return isRecurring;
    }

    /**
     * @param isRecurring the isRecurring to set
     */
    public void setIsRecurring(boolean isRecurring) {
        this.isRecurring = isRecurring;
    }
}
