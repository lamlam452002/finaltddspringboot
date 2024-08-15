package stucturalpatterns.adapter;

import com.google.gson.Gson;

import java.io.*;

public class JsonFileWorking implements IFileWorking{
    @Override
    public Person Read() {
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        InputStream inputStream = loader.getResourceAsStream("data.json");

        Gson gson = new Gson();
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        Person person = gson.fromJson(reader, Person.class);

        return person;
    }

    @Override
    public void Save(Person person) throws IOException {
        Gson gson = new Gson();
        String strJson = gson.toJson(person);

        String path = "src/main/resources";
        File file = new File(path);
        String jsonPath = file.getAbsolutePath();

        FileWriter fw = new FileWriter(jsonPath + "\\data.json", true);
        fw.write(strJson);
        fw.close();
    }
}
