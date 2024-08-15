package com.samsung;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;

public class Object2Json {
    public static void main(String[] args) throws IOException {
        Person person = new Person();
        person.firstName = "Alexander";
        person.lastName = "Smith";
        person.phone = "084213232";
        Address address = new Address();
        address.streetName = "Duy Tan";
        address.city = "Ha Noi";

        person.address = Arrays.asList(address);

        Gson gson = new Gson();
        String strJson = gson.toJson(person);

        System.out.println(strJson);

        String path = "src/main/resources";
        File file = new File(path);
        String jsonPath = file.getAbsolutePath();
        System.out.println(jsonPath);
        FileWriter fileWriter = new FileWriter(jsonPath + "\\newJson.json");
        fileWriter.write(strJson);
        fileWriter.close();
    }
}
