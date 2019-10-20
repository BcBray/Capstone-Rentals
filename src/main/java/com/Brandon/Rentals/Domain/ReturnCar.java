package com.Brandon.Rentals.Domain;

import java.util.Set;



public class ReturnCar {



    private String regNo;

    private int customerId;

    private double pay;

    private Set<ReturnCar> returnCarSet;



    private ReturnCar(Builder builder) {



        this.regNo = builder.regNo;

        this.customerId = builder.customerId;

        this.pay = builder.pay;

    }



    public String getRegNo() {

        return regNo;

    }



    public int getCustomerId() {

        return customerId;

    }



    public double getPay() {

        return pay;

    }



    public static class Builder {



        private String regNo;

        private int customerId;

        private double pay;

        private Set<ReturnCar> returnCarSet;



        public Builder regNo(String regno) {

            this.regNo = regNo;

            return this;

        }



        public Builder customerId(int customerId) {

            this.customerId = customerId;

            return this;

        }



        public Builder pay(double pay) {

            this.pay = pay;

            return this;

        }



        public ReturnCar build() {

            return new ReturnCar(this);

        }



    }



    @Override

    public String toString() {

        return "Returning Car{" + " Reg no.: " + regNo

                + "\n  Customer ID: "

                + customerId + "\n"

                + "Pay: " + pay;



    }

}