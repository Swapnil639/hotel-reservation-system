package com.bridgelabz;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

/*
Lakewood with a rating of 3 has weekday rates as 110$ for regular customer and 80$ for rewards
customer. The weekend rates are 90 for regular customer and 80 for a rewards customer.
Bridgewood with a rating of 4 has weekday rates as 160$ for regular customer and 110$ for
rewards customer. The weekend rates are 60 for regular customer and 50 for a rewards customer.
Ridgewood with a rating of 5 has weekday rates as 220$ for regular customer and 100$ for rewards
customer. The weekend rates are 150 for regular customer and 40 for a rewards customer.
 */

public class HotelReservation {
    static ArrayList<Hotel> hotelList=new ArrayList<>();
    public static void main(String[] args) {
        Hotel lakewood = new Hotel( "Lakewood", 110,90);
        Hotel bridgewood = new Hotel( "Bridgewood", 160,60);
        Hotel ridgewood = new Hotel("Ridgewood", 220,150);
        hotelList.add(lakewood);
        hotelList.add(bridgewood);
        hotelList.add(ridgewood);
        System.out.println(hotelList);
        findCheapestHotel();
    }

    public static void findCheapestHotel(){
        LocalDate date = LocalDate.of(2020, Month.SEPTEMBER, 10);
        LocalDate date1 = LocalDate.of(2020, Month.SEPTEMBER, 11);
        DayOfWeek localDate1 = date.getDayOfWeek();
        DayOfWeek localDate2 = date1.getDayOfWeek();
        String day1 = String.valueOf(localDate1);
        String day2 = String.valueOf(localDate2);
        int sum1 = hotelList.get(0).rateCalculation(day1) + hotelList.get(0).rateCalculation(day2);
        int sum2 = hotelList.get(1).rateCalculation(day1) + hotelList.get(1).rateCalculation(day2);
        int sum3 = hotelList.get(2).rateCalculation(day1) + hotelList.get(2).rateCalculation(day2);

        if (sum1<sum2 && sum1<sum3){
            System.out.println("Hotel Name:Lakewood"+" "+"Rate:"+sum1+"$");
        }else if (sum2<sum1 && sum2<sum3){
            System.out.println("Hotel Name:Bridgewood"+" "+"Rate:"+sum2+"$");
        }else {
            System.out.println("Hotel Name:Ridgewood"+" "+"Rate:"+sum3+"$");
        }
    }
}