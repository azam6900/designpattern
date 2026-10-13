package com.webworks.design.pattern.decorator.solution;

import com.webworks.design.pattern.decorator.problem.Pizza;

public class CheezDecorator extends PizzaDecorator {

    public CheezDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " Cheez" ;
    }

    @Override
    public int getCost() {
        return pizza.getCost() + 50;
    }
}