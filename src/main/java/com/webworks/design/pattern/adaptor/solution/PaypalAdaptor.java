package com.webworks.design.pattern.adaptor.solution;

public class PaypalAdaptor implements PaymentService {

    PaypalGateway paypalGateway;

    public PaypalAdaptor(PaypalGateway paypalGateway) {
        this.paypalGateway = paypalGateway;
    }

    @Override
    public String pay(int amount, int customerId) {
        int result = paypalGateway.doTransaction(amount, customerId);
        if(result == 1) {
            return "SUCCESS";
        }
        return "FAILED";
    }
}