package creationalpatterns.abtractfactory;

public class DuckAbtractFactory implements AnimalAbtractFactory{
    @Override
    public Animal createAnimal() {
        return new Duck();
    }
}
