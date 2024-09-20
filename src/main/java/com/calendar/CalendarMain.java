package com.calendar;

public class CalendarMain {

    public static void main(String[] args) {
        Month month = new Month();
        //Scanner scanner = new Scanner(System.in);
        
        new GUIStart(month).setVisible(true);
    }       
}
