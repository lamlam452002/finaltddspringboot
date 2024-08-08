package creationalpatterns;

public class Prototype implements Cloneable {
    public String Name;

    public Prototype(String Name)
    {
        this.Name = Name;
    }

    public void SayHello()
    {
        System.out.println("Hello Java, I am "+ Name);
        System.out.println("My ID: "+ this.toString());
    }

    @Override
    protected Prototype clone() throws CloneNotSupportedException {
        return (Prototype)super.clone();
    }
}
