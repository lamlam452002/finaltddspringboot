package stucturalpatterns.composite;

public class Test {
    public static void main(String[] args) {
        CompositeGift box = new CompositeGift("My Box", 0);
        SingleGift iPhone = new SingleGift("iPhone", 2000);
        SingleGift samsungPhone = new SingleGift("Samsung Phone", 1500);

        box.Add(iPhone);
        box.Add(samsungPhone);

        System.out.println(box.CalculateTotalPrice());
    }
}
