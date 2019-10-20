package com.Brandon.Rentals.Domain;

import java.util.Set;



public class Location {



    private String area;

    private String areaCode;



    private Set<Location> locationSet;



    public Location(String area, String areaCode) {

        this.area = area;

        this.areaCode = areaCode;

    }



    public void setArea(String area) {

        this.area = area;

    }



    public void setAreaCode(String areaCode) {

        this.areaCode = areaCode;

    }



    private Location(Builder builder) {

        this.area = builder.area;

        this.areaCode = builder.areaCode;

    }



    public String getArea() {

        return area;

    }



    public String getAreaCode() {

        return areaCode;

    }



    public static class Builder {



        private String area;

        private String areaCode;



        private Set<Location> locationSet;



        public Builder area(String area) {

            this.area = area;

            return this;

        }



        public Builder areaCode(String areaCode) {

            this.areaCode = areaCode;

            return this;

        }





        public Location build() {

            return new Location(this);

        }



        @Override

        public String toString() {

            return "";

        }


    }

}