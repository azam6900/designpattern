package com.webworks.design.pattern.chainofresponsibility;

public class TechTeam implements CustomerSupportHandler {

    @Override
    public void handleRequest(Issue issue) {
        if(issue.getPriority().equals("LEVEL3")) {
            //Tech team logic
            System.out.println("Tech team resolved the issue");
            issue.setStatus("Resolved");
        } else {
            System.out.println("Issue can not be resolved");
            issue.setStatus("Failed");
        }
    }
}