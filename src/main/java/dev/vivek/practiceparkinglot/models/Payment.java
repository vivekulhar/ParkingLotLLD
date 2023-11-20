package dev.vivek.practiceparkinglot.models;

import java.util.Date;

public class Payment {
    private String referenceNumber;
    private Double amount;
    private Date timeOfPayment;
    private Invoice invoice;
    private PaymentStatus  paymentStatus;
    private PaymentMode paymentMode;
}
