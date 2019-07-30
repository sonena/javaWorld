package com.sonena.practice;

public class SwitchStExample {

    public String dayOfTheWeek(int dayNumber) {
        String day;
        switch (dayNumber) {
            case 1:
                day = "Monday";
                break;
            case 2:
                day = "Tuesday";
                break;
            case 3:
                day = "Wednesday";
                break;
            case 4:
                day = "Thursday";
                break;
            case 5:
                day = "Friday";
                break;
            case 6:
                day = "Saturday";
                break;
            case 7:
                day = "Sunday";
                break;
            default:
                day = "Invalid Day";

        }
        System.out.println("Day of the week is  " + day);
        return day;
    }
}
