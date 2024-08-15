package creationalpatterns;

public class Singleton {
    private static Singleton instance;
    public String Name;

    private Singleton(){}
    private Singleton(String name) {
        this.Name = name;
    }

    public static Singleton getInstance()
    {
        if (instance == null)
            instance = new Singleton();
        return instance;
    }
    public static Singleton getInstance(String Name) {
        if (instance == null)
            instance = new Singleton(Name);
        return instance;
    }

    public void SayYourName() {
        System.out.println(this.Name);
    }
}
