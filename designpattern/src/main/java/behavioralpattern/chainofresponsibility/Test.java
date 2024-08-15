package behavioralpattern.chainofresponsibility;

public class Test {
    public static void main(String[] args) {
        ChainHandlers chain = new ChainHandlers();
        chain.Handle(101);
    }
}
