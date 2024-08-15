package stucturalpatterns.composite;

public abstract class GiftBase {
    public String name;
    public int price;
    public GiftBase(String name, int price)
    {
        this.name = name;
        this.price = price;
    }
    public abstract int CalculateTotalPrice();
}
