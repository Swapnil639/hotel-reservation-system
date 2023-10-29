package com.bridgelabz;

public class Hotel {
    String hotelName;
    int weekdayRegularCustomer;

    public Hotel(String hotelName, int regularCustomer) {
        this.hotelName = hotelName;
        this.weekdayRegularCustomer = regularCustomer;
    }
    Hotel(){

    }

    public String getHotelName() {
        return hotelName;
    }

    public int getWeekdayRegularCustomer() {
        return weekdayRegularCustomer;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "hotelName='" + hotelName + '\'' +
                ", regularCustomer=" + weekdayRegularCustomer +
                '}';
    }

    public int rateCalculation(String day) {
        if (day.equals("MONDAY")||day.equals("TUESDAY")||day.equals("WEDNESDAY")||day.equals("THURSDAY")||day.equals("FRIDAY")){
            return getWeekdayRegularCustomer();
        }
        return 0;
    }
}
