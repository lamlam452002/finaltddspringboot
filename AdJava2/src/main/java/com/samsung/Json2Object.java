package com.samsung;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.util.List;

public class Json2Object {
    public static void main(String[] args) {
        //Tao 1 input stream toi file json
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        InputStream inputStream = classLoader.getResourceAsStream("data.json");

        //2. Tao Gson su dung
        Gson gson = new Gson();

        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        Type listPersonType = new TypeToken<List<Person>>() {
        }.getType();
        List<Person> person = gson.fromJson(reader, listPersonType);

        //3. Su dung
        System.out.println(person.get(0).firstName + " " + person.get(0).lastName);
        System.out.println(person.get(0).phone);

        person.get(0).address.forEach((u) -> {
            System.out.println(u.streetName + " " + u.city);
        });


    }
}
