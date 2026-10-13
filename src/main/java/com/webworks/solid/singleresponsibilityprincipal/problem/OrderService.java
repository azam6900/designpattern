package com.webworks.solid.singleresponsibilityprincipal.problem;

/***
 * Here in this example, Order service is carrying more than one responsibility.
 * It is creating an order, processing payment, sending email notification,
 * and generating invoice. Cleaner code would be to generate a separate class
 * for each responsibility such as creating an order, or processing payment etc. Over
 * the period of time this class will become huge and hard to read and understand.
 * Also multiple developers will be changing this class for various reasons like one
 * might be changing logic for order creation and other for payment processing. This
 * makes class harder to read, maintain and prone to the errors.
 */
public class OrderService {

    public void createOrder () {
        System.out.println("Order Created");
    }

    public void processPayment () {
        System.out.println("Payment Processed");
    }

    public void sendEmail () {
        System.out.println("Email Sent");
    }

    public void generateInvoice () {
        System.out.println("invoice Generated");
    }
}