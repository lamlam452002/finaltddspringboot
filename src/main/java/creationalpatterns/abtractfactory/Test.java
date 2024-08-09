package creationalpatterns.abtractfactory;

public class Test {
    public static void main(String[] args) {
        Animal myAnimal = AnimalFactory.getAnimal(new PigAbtractFactory());

        myAnimal.Say();
    }
}
