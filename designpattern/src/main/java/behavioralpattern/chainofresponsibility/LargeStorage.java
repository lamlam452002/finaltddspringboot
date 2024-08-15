package behavioralpattern.chainofresponsibility;

public class LargeStorage extends IHandler{
    @Override
    public void RequestOrder(int amount) {
        if(amount<100)
        {
            System.out.println("Large Storage: I can hanlde less than 100 items.");
        }
        else
        {
            System.out.println("Large Storage: I received the request but I can't handle more than 100 items.");
            Successor.RequestOrder(amount);
        }
    }
}
