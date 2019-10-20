package com.Brandon.Rentals.Domain;

import java.util.Set;



public class Models {



    private String suvId;

    private String carId;



    private Set<Models> modelsSet;



    public Models(String suvId, String carId) {

        this.suvId = suvId;

        this.carId = carId;

    }



    public void setSuvId(String suvId) {

        this.suvId = suvId;

    }



    public void setCarId(String carId) {

        this.carId = carId;

    }



    private Models(Builder builder) {

        this.suvId = builder.suvId;

        this.carId = builder.carId;

    }



    public String getSuvId() {

        return suvId;

    }



    public String getCarId() {

        return carId;

    }



    public static class Builder {



        private String suvId;

        private String carId;

        private Set<Models> modelsSet;



        public Builder suvId(String suvId) {

            this.suvId = suvId;

            return this;

        }



        public Builder carId(String carId) {

            this.carId = carId;

            return this;

        }





        public Models build() {

            return new Models(this);

        }



        @Override

        public String toString() {

            return "";

        }





    }





}