package creationalpatterns.factorymethod;

public class AnimalFactory {
    public static IAnimal createAnimal(AnimalType type)
    {
        IAnimal animal = null;
        switch (type)
        {
            case CAT:
                animal = new Cat();
                break;
            case DOG:
                animal = new Dog();
                break;
            case DUCK:
                animal = new Duck();
                break;
        }
        return animal;
    }
}
