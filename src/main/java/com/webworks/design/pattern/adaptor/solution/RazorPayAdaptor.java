package com.webworks.design.pattern.adaptor.solution;

public class RazorPayAdaptor  implements  PaymentService {

    RazorPayGateway razorPayGateway;

    public RazorPayAdaptor(RazorPayGateway razorPayGateway) {
        this.razorPayGateway = razorPayGateway;
    }

    @Override
    public String pay(int amount, int customerId) {
        boolean result = razorPayGateway.performTransaction(amount, customerId);
        if(result) {
            return "SUCCESS";
        }
        return "FAILED";
    }
}