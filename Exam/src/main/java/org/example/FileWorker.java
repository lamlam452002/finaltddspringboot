package org.example;

import java.nio.file.Path;
import java.util.Queue;

public class FileWorker implements Runnable{
    Queue<String> store;
    Queue<String> storePath;
    Path filePath;
    public FileWorker(Queue<String>store, Path filePath, Queue<String> storePath)
    {
        this.store = store;
        this.filePath = filePath;
        this.storePath = storePath;
    }
    @Override
    public void run() {
        String content = FileManager.getInstance().readFile(filePath);
        store.add(content);
        storePath.add(filePath.toString());
    }
}