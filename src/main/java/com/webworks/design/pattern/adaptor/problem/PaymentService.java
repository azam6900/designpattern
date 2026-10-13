package com.webworks.design.pattern.adaptor.problem;

/**
 * Client uses PaymentService which internally wants to use PaypalGateway but it is incompatible
 * with PaymentService. Here we need to use Adaptor pattern to plug-in the difference
 */
public class PaymentService {

    /**
     * First trying to solve this without Adaptor pattern by inject the PaypalGateway here directly
     */
    PaypalGateway paypalGateway = new PaypalGateway();

    public String pay(int amount, int customerId) {
        int result = paypalGateway.doTransaction(amount, customerId);
        if(result == 1) {
            return "SUCCESS";
        }
        return "FAILED";
    }

    /**
     * Now let's assume if we want to integrate with RazorPayGateway then we have to change the
     * above code to integrate with another payment gateway which may break the already existing
     * code. This is where adaptor pattern comes handy
     */
}