package stucturalpatterns.adapter;

import com.fasterxml.jackson.core.JsonProcessingException;

import java.io.IOException;

public interface IFileWorking {
    public Person Read() throws JsonProcessingException;
    public void Save(Person person) throws IOException;
}
