package com.webworks.design.pattern.chainofresponsibility;

public class CustomerExecutive implements CustomerSupportHandler {

    private CustomerSupportHandler handler;

    public CustomerExecutive(CustomerSupportHandler handler) {
        this.handler = handler;

    }
    @Override
    public void handleRequest(Issue issue) {
        if(issue.getPriority().equals("LEVEL2")) {
            //Customer executive logic
            System.out.println("Customer executive resolved the issue");
            issue.setStatus("Resolved");
        } else {
            System.out.println("Customer executive could not resolved the issue, moving to the next handler");
            issue.setStatus("Pending");
            handler.handleRequest(issue);
        }
    }
}