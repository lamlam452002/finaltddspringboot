package com.samsung;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.stream.Collectors;

public class XML2Object {
    public static void main(String[] args) throws JsonProcessingException {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        InputStream inputStream = classLoader.getResourceAsStream("person.xml");


        String xmlInString = new BufferedReader(new InputStreamReader(inputStream)).lines().collect(Collectors.joining("\n"));

        XmlMapper xmlMapper = new XmlMapper();
        Person person = xmlMapper.readValue(xmlInString, Person.class);
        System.out.println(person.firstName);
    }
}
