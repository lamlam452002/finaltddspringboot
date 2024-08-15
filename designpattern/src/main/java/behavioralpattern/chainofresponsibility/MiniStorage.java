package behavioralpattern.chainofresponsibility;

public class MiniStorage extends IHandler{
    @Override
    public void RequestOrder(int amount) {
        if(amount<10)
        {
            System.out.println("Mini storage: I can handle less than 10 items.");
        }
        else
        {
            System.out.println("Mini storage: I received the request but I can't handle more than 10 items.");
            this.Successor.RequestOrder(amount);
        }
    }
}
