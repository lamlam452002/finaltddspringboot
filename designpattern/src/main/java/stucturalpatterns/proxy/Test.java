package stucturalpatterns.proxy;

public class Test {
    public static void main(String[] args) {
        DataService dbService = new DataService();

        DataCacheProxy proxy = DataCacheProxy.getInstance(dbService);

        System.out.println(proxy.getNumber());
        System.out.println(proxy.getNumber());
        System.out.println(proxy.getNumber());
    }
}
