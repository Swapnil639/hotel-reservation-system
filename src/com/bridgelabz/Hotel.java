package com.bridgelabz;

public class Hotel {
    String hotelName;
    int weekdayRegularCustomer;
    int weekendRegularCustomer;
    int weekdayRewardCustomer;
    int weekendRewardCustomer;
    int rating;

    public Hotel(String hotelName, int weekdayRegularCustomer, int weekdayRewardCustomer,int weekendRegularCustomer,int weekendRewardCustomer, int rating) {
        this.hotelName = hotelName;
        this.weekdayRegularCustomer = weekdayRegularCustomer;
        this.weekendRegularCustomer = weekendRegularCustomer;
        this.weekdayRewardCustomer = weekdayRewardCustomer;
        this.weekendRewardCustomer = weekendRewardCustomer;
        this.rating = rating;
    }

    Hotel(){

    }

    public String getHotelName() {
        return hotelName;
    }

    public int getWeekdayRegularCustomer() {
        return weekdayRegularCustomer;
    }

    public int getWeekendRegularCustomer() {
        return weekendRegularCustomer;
    }

    public int getRating() {
        return rating;
    }

    public int getWeekdayRewardCustomer() {
        return weekdayRewardCustomer;
    }

    public int getWeekendRewardCustomer() {
        return weekendRewardCustomer;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "hotelName='" + hotelName + '\'' +
                ", weekdayRegularCustomer=" + weekdayRegularCustomer +
                ", weekendRegularCustomer=" + weekendRegularCustomer +
                ", weekdayRewardCustomer=" + weekdayRewardCustomer +
                ", weekendRewardCustomer=" + weekendRewardCustomer +
                ", rating=" + rating +
                '}';
    }

    public int rateCalculation(String day) {
        if (day.equals("MONDAY")||day.equals("TUESDAY")||day.equals("WEDNESDAY")||day.equals("THURSDAY")||day.equals("FRIDAY")){
            return getWeekdayRegularCustomer();
        }else {
            return getWeekendRegularCustomer();
        }
    }
}
