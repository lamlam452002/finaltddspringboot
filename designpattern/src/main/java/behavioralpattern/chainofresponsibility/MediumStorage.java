package behavioralpattern.chainofresponsibility;

public class MediumStorage extends IHandler{
    @Override
    public void RequestOrder(int amount) {
        if(amount<50)
        {
            System.out.println("Medium Storage: I can handle less than 50 item");
        }
        else
        {
            System.out.println("Medium Storage: I received the request but can't handle more than 50 items.");
            this.Successor.RequestOrder(amount);
        }
    }
}
