package behavioralpattern.chainofresponsibility;

public abstract class IHandler {
    public IHandler Successor;

    public abstract void RequestOrder(int amount);
}
