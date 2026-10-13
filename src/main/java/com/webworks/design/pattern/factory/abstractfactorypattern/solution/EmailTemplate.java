package com.webworks.design.pattern.factory.abstractfactorypattern.solution;

public class EmailTemplate implements Template {
    @Override
    public void format() {
        System.out.println("Formatting email");
    }
}