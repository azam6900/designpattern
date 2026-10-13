package com.webworks.design.pattern.chainofresponsibility;

public interface CustomerSupportHandler {
    void handleRequest(Issue issue);
}