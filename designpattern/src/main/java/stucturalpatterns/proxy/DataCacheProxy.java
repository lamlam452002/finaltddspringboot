package stucturalpatterns.proxy;

public class DataCacheProxy {
    private static int Cache_number = 0;
    private static DataCacheProxy instance;

    public static DataCacheProxy getInstance(DataService dataService) {
        if (instance == null)
            instance = new DataCacheProxy(dataService);
        return instance;
    }

    private DataService dataService;

    private DataCacheProxy(DataService dataService) {

        this.dataService = dataService;
    }

    public int getNumber() {
        if (Cache_number == 0) {
            int number = dataService.GenerateNumber();
            Cache_number = number;
        }
        return Cache_number;
    }
}
