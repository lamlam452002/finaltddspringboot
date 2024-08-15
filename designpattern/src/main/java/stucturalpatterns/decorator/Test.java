package stucturalpatterns.decorator;

public class Test {
    public static void main(String[] args) {
        IPizza chicken = new ChickenPizza();

        CheeseDecorator cheeseDecorator = new CheeseDecorator(chicken);
        System.out.println(cheeseDecorator.doPizza());
    }
}
