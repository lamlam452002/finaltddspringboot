package stucturalpatterns.decorator;

public abstract class PizzaDecorator implements IPizza{
    public IPizza pizza;

    public PizzaDecorator(IPizza pizza)
    {
        this.pizza =pizza;
    }

    public IPizza getPizza()
    {
        return pizza;
    }
}
