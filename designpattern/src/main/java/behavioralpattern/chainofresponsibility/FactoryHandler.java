package behavioralpattern.chainofresponsibility;

public class FactoryHandler extends IHandler{
    @Override
    public void RequestOrder(int amount) {
        System.out.println("Factory: I received the request. But don't have any storage");
    }
}
