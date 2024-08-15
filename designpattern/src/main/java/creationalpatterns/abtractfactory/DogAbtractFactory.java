package creationalpatterns.abtractfactory;

public class DogAbtractFactory implements AnimalAbtractFactory{
    @Override
    public Animal createAnimal() {
        return new Dog();
    }
}
