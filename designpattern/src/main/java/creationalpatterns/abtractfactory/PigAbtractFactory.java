package creationalpatterns.abtractfactory;

public class PigAbtractFactory implements AnimalAbtractFactory{
    @Override
    public Animal createAnimal() {
        return new Pig();
    }
}
