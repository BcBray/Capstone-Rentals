package com.Brandon.Rentals.Domain;

import java.util.Set;



public class Rent {

    private String bookingId;

    private int customerId;

    private Set<Rent> rentSet;



    public void setBookingId(String bookingId) {

        this.bookingId = bookingId;

    }



    public void setCustomerId(int customerId) {

        this.customerId = customerId;

    }



    public Rent(String bookingId, int customerId) {

        this.bookingId = bookingId;

        this.customerId = customerId;

    }



    private Rent(Builder builder)

    {

        this.bookingId = builder.bookingId;

        this.customerId = builder.customerId;

    }



    public String getBookingId() {

        return bookingId;

    }



    public int getCustomerId() {

        return customerId;

    }



    public static class Builder{



        private String bookingId;

        private int customerId;

        private Set<Rent>rentSet;



        public Builder name(String bookingId){

            this.bookingId = bookingId;

            return this;

        }



        public Builder lastName(int customerId){

            this.customerId = customerId;

            return this;

        }

        public Rent build(){

            return new Rent(this);

        }



    }

    @Override

    public String toString(){

        return "Rent{" +" Booking ID: " + bookingId

                +"\n  Customer ID: "

                + customerId;



    }

}