package stucturalpatterns.facade;

public class Test {
    public static void main(String[] args) {
        ShopFacade shopFacade = ShopFacade.getInstance();

        shopFacade.buyProductByCashWithFreeShipping("khanh.tx@live.com");
        shopFacade.buyProductByPaypalWithStandardShipping("khanh.tx@live.com", "0924448888");
    }
}
