package creationalpatterns.factorymethod;

public class Duck implements IAnimal{
    @Override
    public void Say() {
        System.out.println("Duck");
    }
}
