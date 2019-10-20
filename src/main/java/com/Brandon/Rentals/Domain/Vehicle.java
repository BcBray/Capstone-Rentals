package com.Brandon.Rentals.Domain;

import java.util.Set;



public class Vehicle {



    private String regNo;

    private int type;

    private Set<Vehicle> vehicleSet;



    private Vehicle(Builder builder)

    {

        this.regNo = builder.regNo;

        this.type = builder.type;



    }



    public String getRegNo() {

        return regNo;

    }



    public int getType() {

        return type;

    }



    public static class Builder{



        private String regNo;

        private int type;

        private Set<Vehicle>vehicleSet;



        public Builder regNo(String regNo)

        {

            this.regNo = regNo;

            return this;

        }



        public Builder type(int type)

        {

            this.type = type;

            return this;

        }



        public Vehicle build()

        {

            return new Vehicle(this);

        }



        @Override

        public String toString()

        {

            return " "+ regNo +"\n"+type;



        }

    }

}