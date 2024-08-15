package behavioralpattern.chainofresponsibility;

public class ChainHandlers {
    IHandler mini = new MiniStorage();
    IHandler medium = new MediumStorage();
    IHandler large = new LargeStorage();
    IHandler shopfactory = new FactoryHandler();

    public ChainHandlers()
    {
        mini.Successor = medium;
        medium.Successor = large;
        large.Successor =shopfactory;
    }

    public void Handle(int amount)
    {
        mini.RequestOrder(amount);
    }
}
