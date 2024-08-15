package behavioralpattern.observer;

public class Observer {
    private String name;
    public Observer(String name)
    {
        this.name = name;
    }
    public void Update(String message)
    {
        System.out.println(this.name + ": "+ message);
    }
}
