package com.campusdual.interfaces;

import java.util.Date;

public class BookingSystem {
    public static void main(String[] args) {
        FlightBooking fb = new FlightBooking("Iberia","IBE1234");
        fb.book(new Date(),"v72");
        fb.book(new Date());
        fb.getTickerDetail();
    }
}
