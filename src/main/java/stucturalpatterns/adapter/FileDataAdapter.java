package stucturalpatterns.adapter;

import com.fasterxml.jackson.core.JsonProcessingException;

import java.io.IOException;

public class FileDataAdapter {
    JsonFileWorking jsonFileWorking = new JsonFileWorking();
    XmlFileWorking xmlFileWorking = new XmlFileWorking();

    Person person;
    public void WriteToJson() throws IOException {
        ReadFromXml();
        jsonFileWorking.Save(this.person);
    }

    public void WriteToXML() throws IOException {
        ReadFromJson();
        xmlFileWorking.Save(this.person);
    }

    public void ReadFromJson()
    {
        this.person = jsonFileWorking.Read();
    }

    public void ReadFromXml() throws JsonProcessingException {
        this.person = xmlFileWorking.Read();
    }

}
