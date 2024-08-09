package stucturalpatterns.facade;

public class PaymentService {
    public void PaymentByPaypal()
    {
        System.out.println("Payment by paypal");
    }

    public void PaymentByCreditCard()
    {
        System.out.println("Payment by Credit card");
    }

    public void PaymentByEbankingAccount()
    {
        System.out.println("Payment by ebanking account");
    }

    public void PaymentByCash()
    {
        System.out.println("Payment by cash");
    }

}
