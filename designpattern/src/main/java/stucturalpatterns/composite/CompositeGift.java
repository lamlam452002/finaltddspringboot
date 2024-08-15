package stucturalpatterns.composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeGift extends GiftBase implements IGiftOperations{
    private List<GiftBase> gifts;
    public CompositeGift(String name, int price) {
        super(name, price);

        gifts = new ArrayList<>();
    }

    @Override
    public int CalculateTotalPrice() {
        int total = 0;

        for(GiftBase gift: gifts)
        {
            total+= gift.CalculateTotalPrice();
        }

        return total;
    }

    @Override
    public void Add(GiftBase gift) {
        gifts.add(gift);
    }

    @Override
    public void Remove(GiftBase gift) {
        gifts.remove(gift);
    }
}
