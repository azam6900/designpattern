package com.webworks.design.pattern.chainofresponsibility;

public class Main {
    public static void main(String[] args) {
        Client client = new Client(new Chatbot(new CustomerExecutive(new TechTeam())));
        //Level1
        client.raiseIssue(new Issue("LEVEL1", "Initiated"));
        //Level2
        client.raiseIssue(new Issue("LEVEL2", "Initiated"));
        //Level3
        client.raiseIssue(new Issue("LEVEL3", "Initiated"));
        //Level4
        client.raiseIssue(new Issue("LEVEL4", "Initiated"));
    }
}