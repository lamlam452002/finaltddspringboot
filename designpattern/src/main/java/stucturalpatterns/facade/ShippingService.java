package stucturalpatterns.facade;

public class ShippingService {
    public void FreeShipping()
    {
        System.out.println("Free Shipping");
    }

    public void StandardShipping()
    {
        System.out.println("Standard Shipping");
    }

    public void ExpressShipping()
    {
        System.out.println("Express Shipping");
    }
}
