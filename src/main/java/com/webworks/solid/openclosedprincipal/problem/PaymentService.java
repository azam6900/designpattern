package com.webworks.solid.openclosedprincipal.problem;

/**
 * Problem here is any change in the logic for one payment method will force this class
 * to be changed. Also in case a new payment type is introduced then this class will change
 * again. This introduces the risk of breaking existing and tested code.
 */
public class PaymentService {

    public void processPayment (String type) {
        if(type.equals("UPI")) {
            System.out.println("Processing UPI Payment");
        } else if(type.equals("CreditCard")) {
            System.out.println("Processing Credit Card Payment");
        } else if(type.equals("NetBanking")) {
            System.out.println("Processing Net Banking Payment");
        }
    }
}