package org.example.designpatterns.structural.decorator_design_pattern;

public class PizzaShop {
    public static void main(String[] args) {
        Pizza pizza = new MargheritaPizza();
        System.out.println(pizza.getDescription() + " => ₹" + pizza.getCost());

        pizza = new CheeseTopping(pizza);
        pizza = new OliveTopping(pizza);

        System.out.println(pizza.getDescription() + " => ₹" + pizza.getCost());
    }
}
