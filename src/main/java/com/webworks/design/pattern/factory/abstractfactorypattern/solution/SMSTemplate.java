package com.webworks.design.pattern.factory.abstractfactorypattern.solution;

public class SMSTemplate implements Template {
    @Override
    public void format() {
        System.out.println("Formatting SMS");
    }
}