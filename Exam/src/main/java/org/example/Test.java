package org.example;

import java.nio.file.Path;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {
  public static void main(String[] args) {
    Queue<String> store = new LinkedList<>();
    Queue<String> storePath = new LinkedList<>();
    String folderPath = "C:\\Users\\HAN\\gitdemo\\Exam\\src\\main\\java\\org\\htmlfolder";
    List<Path> lstPath = FileManager.getInstance().getAllFilePath(folderPath);
    ExecutorService fileExecutor = Executors.newSingleThreadExecutor();
    for (Path filePath: lstPath)
    {
      fileExecutor.execute(new FileWorker(store, filePath, storePath));
    }

    ExecutorService contentExecutor = Executors.newSingleThreadExecutor();
    contentExecutor.execute(new ContentWorker(store, storePath));
    storePath.forEach(System.out::println);

  }
}
