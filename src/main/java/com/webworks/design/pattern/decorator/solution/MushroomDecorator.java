package com.webworks.design.pattern.decorator.solution;

import com.webworks.design.pattern.decorator.problem.Pizza;

public class MushroomDecorator extends PizzaDecorator {

    public MushroomDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " Mushroom";
    }

    @Override
    public int getCost() {
        return pizza.getCost() + 25;
    }
}