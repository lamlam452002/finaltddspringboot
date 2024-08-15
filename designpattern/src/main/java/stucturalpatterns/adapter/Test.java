package stucturalpatterns.adapter;

import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        FileDataAdapter adapter = new FileDataAdapter();
        adapter.WriteToJson();
    }
}
