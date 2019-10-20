package com.Brandon.Rentals.Domain;

import javax.persistence.*;
import java.util.Set;

public class Manufacturer {

    String vehicleId;
    String brand;

    private Set<Manufacturer> manufacturerSet;

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public Manufacturer(String vehicleId, String brand) {
        this.vehicleId = vehicleId;
        this.brand = brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    private Manufacturer(Builder builder) {
        this.vehicleId = builder.vehicleId;
        this.brand = builder.brand;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public String getBrand() {
        return brand;
    }

    public static class Builder {

        String vehicleId;
        String brand;

        private Set<Manufacturer> manufacturerSet;

        public Builder vehicleId(String vehicleId) {
            this.vehicleId = vehicleId;
            return this;
        }

        public Builder brand(String brand) {
            this.brand = brand;
            return this;
        }

        public Manufacturer build() {
            return new Manufacturer(this);
        }

        @Override
        public String toString() {
            return "";
        }
    }
}