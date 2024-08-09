package creationalpatterns.factorymethod;

public class Test {
    public static void main(String[] args) {
        IAnimal myAnimal = AnimalFactory.createAnimal(AnimalType.DUCK);
        myAnimal.Say();
    }
}
