package com.Brandon.Rentals.Domain;

import java.util.Set;



public class Payment {



    private int customerId;

    private int paymentId;

    private String invoiceId;



    public void setCustomerId(int customerId) {

        this.customerId = customerId;

    }



    public void setPaymentId(int paymentId) {

        this.paymentId = paymentId;

    }



    public Payment(int customerId, int paymentId, String invoiceId) {

        this.customerId = customerId;

        this.paymentId = paymentId;

        this.invoiceId = invoiceId;

    }



    public void setInvoiceId(String invoiceId) {

        this.invoiceId = invoiceId;

    }



    private Set<Payment> paymentSet;



    private Payment(Builder builder) {

        this.customerId = builder.customerId;

        this.paymentId = builder.paymentId;

        this.invoiceId = builder.invoiceId;

    }



    public int getCustomerId() {

        return customerId;

    }



    public int getPaymentId() {

        return paymentId;

    }



    public String getInvoiceId() {

        return invoiceId;

    }





    public static class Builder {



        private int customerId;

        private int paymentId;

        private String invoiceId;

        private Set<Payment> paymentSet;



        public Builder customerId(int customerId) {

            this.customerId = customerId;

            return this;

        }



        public Builder paymentId(int paymentId) {

            this.paymentId = paymentId;

            return this;

        }



        public Builder invoiceId(String invoiceId) {

            this.invoiceId = invoiceId;

            return this;

        }



        public Payment build() {

            return new Payment(this);

        }



        @Override

        public String toString() {

            return "Customer ID: " + customerId

                    + "\n  Payment Code:"

                    + paymentId + "\n"

                    + "Invoice ID: " + invoiceId;

        }



    }

}