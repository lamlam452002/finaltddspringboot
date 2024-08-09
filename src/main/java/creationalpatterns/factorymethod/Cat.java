package creationalpatterns.factorymethod;

public class Cat implements IAnimal{
    @Override
    public void Say() {
        System.out.println("Meo meo");
    }
}
