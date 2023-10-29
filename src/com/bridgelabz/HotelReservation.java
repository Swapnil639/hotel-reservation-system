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
        HotelReservation hotelReservation=new HotelReservation();
        Hotel hotel1 = new Hotel( "Lakewood", 110,80,90,80,3);
        Hotel hotel2 = new Hotel( "Bridgewood", 160,110,60,50,4);
        Hotel hotel3 = new Hotel("Ridgewood", 220,100,150,40,5);
        hotelList.add(hotel1);
        hotelList.add(hotel2);
        hotelList.add(hotel3);
        System.out.println(hotelList);
        hotelReservation.findCheapestHotel();
        hotelReservation.cheapestBestRating();

    }

    public void findCheapestHotel(){
        LocalDate date = LocalDate.of(2020, Month.SEPTEMBER, 11);
        LocalDate date1 = LocalDate.of(2020, Month.SEPTEMBER, 12);
        DayOfWeek localDate1 = date.getDayOfWeek();
        DayOfWeek localDate2 = date1.getDayOfWeek();
        String day1 = String.valueOf(localDate1);
        String day2 = String.valueOf(localDate2);
        int sum1 = hotelList.get(0).rateCalculation(day1) + hotelList.get(0).rateCalculation(day2);
        int sum2 = hotelList.get(1).rateCalculation(day1) + hotelList.get(1).rateCalculation(day2);
        int sum3 = hotelList.get(2).rateCalculation(day1) + hotelList.get(2).rateCalculation(day2);

        if (sum1>sum2 && sum1>sum3){
            System.out.println("Hotel Name:Lakewood"+" "+"Rate:"+sum1+"$");
        }else if (sum2>sum1 && sum2>sum3){
            System.out.println("Hotel Name:Bridgewood"+" "+"Rate:"+sum2+"$");
        }else {
            System.out.println("Hotel Name:Ridgewood"+" "+"Rate:"+sum3+"$");
        }
    }
    public void cheapestBestRating(){
        int rating1=hotelList.get(0).getRating();
        int rating2=hotelList.get(1).getRating();
        int rating3=hotelList.get(2).getRating();

        if (rating1>rating2 && rating1>rating3){
            System.out.println("Best Rated Hotel:"+rating1);
        }else  if (rating2>rating1 && rating2>rating3){
            System.out.println("Best Rated Hotel:"+rating2);
        }else {
            System.out.println("Best Rated Hotel:"+rating3);
        }
    }
}