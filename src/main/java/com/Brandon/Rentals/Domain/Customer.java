package com.Brandon.Rentals.Domain;

import java.util.Set;
public class Customer {

    private String name;



    public Customer(String name, String lastName, int age, String id) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.id = id;
    }

    private String lastName;
    private int age;
    private String id;
    private Set<Customer> customerSet;

    private Customer(){}

    public void setName(String name) {
        this.name = name;
    }



    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setId(String id) {
        this.id = id;
    }

    private Customer(Builder builder)
    {
        this.name = builder.name;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.id = builder.id;
    }



    public String getName() {

        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getId() {

        return id;

    }

    public static class Builder{

        private String name;
        private String lastName;
        private int age;
        private String id;

        private Set<Customer> customerSet;

        public Builder name(String name){
            this.name = name;
            return this;
        }

        public Builder lastName(String lastName){
            this.lastName = lastName;
            return this;
        }

        public Builder age(int age){
            this.name = name;
            return this;
        }

        public Builder id(String id){
            this.id = id;
            return this;
        }

        public Customer build(){
            return new Customer(this);
        }

    }

    @Override
    public String toString(){
        return "Customer{" +" Name: " + name
                +"\n  Last Name:"
                + lastName +"\n"
                + "Age: "+age
                +"\n"+" ID: "+id+" }\n";
    }
}