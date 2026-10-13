package com.webworks.design.pattern.decorator.solution;

import com.webworks.design.pattern.decorator.problem.Pizza;

public class OlivesDecorator extends PizzaDecorator {

    public OlivesDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " Olives";
    }

    @Override
    public int getCost() {
        return pizza.getCost() + 80;
    }
}