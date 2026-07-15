package org.example.designpatterns.structural.decorator_design_pattern;

public class CheeseTopping extends PizzaDecorator{

    public CheeseTopping(Pizza pizza){
        super(pizza);
    }

    public String getDescription() {
        return pizza.getDescription() + ", Extra Cheese";
    }

    public double getCost(){
        return pizza.getCost() + 50.0;
    }
}
