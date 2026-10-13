package com.webworks.design.pattern.decorator.solution;

import com.webworks.design.pattern.decorator.problem.MargheritaPizza;
import com.webworks.design.pattern.decorator.problem.Pizza;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new MargheritaPizza();
        System.out.println("Description: " + pizza.getDescription() + " Cost: " + pizza.getCost());

        pizza = new CheezDecorator(pizza);
        System.out.println("Description: " + pizza.getDescription() + " Cost: " + pizza.getCost());

        pizza = new MushroomDecorator(pizza);
        System.out.println("Description: " + pizza.getDescription() + " Cost: " + pizza.getCost());

        pizza = new OlivesDecorator(pizza);
        System.out.println("Description: " + pizza.getDescription() + " Cost: " + pizza.getCost());
    }
}