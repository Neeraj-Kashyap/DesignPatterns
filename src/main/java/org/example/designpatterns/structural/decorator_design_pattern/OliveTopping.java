package org.example.designpatterns.structural.decorator_design_pattern;

public class OliveTopping extends PizzaDecorator {

    public OliveTopping(Pizza pizza){
        super(pizza);
    }

    public String getDescription(){
        return pizza.getDescription() +", Olives";
    }

    public double getCost(){
        return pizza.getCost() + 30.0;
    }
}
