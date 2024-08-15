package stucturalpatterns.composite;

public class SingleGift extends GiftBase{
    public SingleGift(String name, int price) {
        super(name, price);
    }

    @Override
    public int CalculateTotalPrice() {
        return price;
    }
}
