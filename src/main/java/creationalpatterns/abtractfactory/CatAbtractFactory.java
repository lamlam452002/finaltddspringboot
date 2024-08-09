package creationalpatterns.abtractfactory;

public class CatAbtractFactory implements AnimalAbtractFactory{
    @Override
    public Animal createAnimal() {
        return new Cat();
    }


}
