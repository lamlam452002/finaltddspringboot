package stucturalpatterns.adapter;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.*;
import java.util.stream.Collectors;

public class XmlFileWorking implements IFileWorking{
    @Override
    public Person Read() throws JsonProcessingException {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        InputStream inputStream = classLoader.getResourceAsStream("data.xml");

        //Read content by use BufferedReader
        String xmlInString = new BufferedReader(new InputStreamReader(inputStream))
                .lines().collect(Collectors.joining("\n"));

        //Map XML to Object
        XmlMapper xmlMapper = new XmlMapper();
        Person person = xmlMapper.readValue(xmlInString, Person.class);

        return person;
    }

    @Override
    public void Save(Person person) throws IOException {
        String path = "src/main/resources";
        File file = new File(path);
        String xmlPath = file.getAbsolutePath();

        XmlMapper xmlMapper = new XmlMapper();
        String dataXml = xmlMapper.writeValueAsString(person);

        FileWriter fw = new FileWriter( xmlPath+ "\\data.xml", true);
        fw.write(dataXml);
        fw.close();
    }
}
