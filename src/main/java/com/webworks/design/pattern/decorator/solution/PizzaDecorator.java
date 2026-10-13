package com.webworks.design.pattern.decorator.solution;

import com.webworks.design.pattern.decorator.problem.Pizza;

public abstract class PizzaDecorator implements Pizza { //is a relationship
    //has a relationship
    Pizza pizza;

    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }
}