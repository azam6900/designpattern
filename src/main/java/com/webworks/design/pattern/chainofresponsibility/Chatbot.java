package com.webworks.design.pattern.chainofresponsibility;

public class Chatbot implements CustomerSupportHandler {

    private CustomerSupportHandler handler;

    public Chatbot(CustomerSupportHandler handler) {
        this.handler = handler;
    }

    @Override
    public void handleRequest(Issue issue) {
        if(issue.getPriority().equals("LEVEL1")) {
            //Some chatbot logic
            System.out.println("Chatbot resolved the issue");
            issue.setStatus("Resolved");
        } else {
            System.out.println("Chatbot could not resolved the issue, moving to the next handler");
            issue.setStatus("Pending");
            handler.handleRequest(issue);
        }
    }
}