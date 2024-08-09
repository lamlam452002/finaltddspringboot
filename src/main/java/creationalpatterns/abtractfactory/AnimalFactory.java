package creationalpatterns.abtractfactory;

public class AnimalFactory {
    public static Animal getAnimal(AnimalAbtractFactory factory)
    {
        return factory.createAnimal();
    }

}
