package stucturalpatterns.decorator;

public class CheeseDecorator extends PizzaDecorator{
    public CheeseDecorator(IPizza pizza)
    {
        super(pizza);
    }
    @Override
    public String doPizza() {
        String type = this.pizza.doPizza();
        return type + addCheese(); //addCheese - decorate
    }

    private String addCheese(){
        return "+ Cheese";
    }
}
