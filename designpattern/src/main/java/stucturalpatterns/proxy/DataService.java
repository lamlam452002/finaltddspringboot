package stucturalpatterns.proxy;

import java.util.Random;

public class DataService {
    public int GenerateNumber()
    {
        Random rdn = new Random();
        return rdn.nextInt(99999);
    }
}
