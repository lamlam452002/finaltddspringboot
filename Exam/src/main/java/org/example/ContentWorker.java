package org.example;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Queue;

public class ContentWorker implements Runnable {
    Queue<String> queue;
    Queue<String> queuePath;

    public ContentWorker(Queue<String> store, Queue<String> queuePath) {
        this.queue = store;
        this.queuePath = queuePath;
    }

    @Override
    public void run() {
        while (true) {
            if (queue.size() > 0) {
                String content = queue.poll();
                String path = queuePath.poll();
                EmailExtractor emailExtractor = EmailExtractor.getInstance();
                try {
                    List<String> emails = emailExtractor.getEmails(content);
                    String fileName = "C:\\Users\\HAN\\gitdemo\\Exam\\src\\main\\java\\org\\example\\EmailListFile\\EmailListFile.txt";
                    FileOutputStream fos = new FileOutputStream(fileName, true);
                    for (String email : emails) {
                        String contentEmail = "<a href=\"mailto:Email \">" + email + "</a>";
                        fos.write(contentEmail.getBytes(StandardCharsets.UTF_8));
                        content.replaceAll(email, contentEmail);
                    }
                    Files.write(Paths.get(path), content.getBytes(), StandardOpenOption.CREATE);

                } catch (IOException e) {
                    throw new RuntimeException(e);
                }

            }
        }
    }
}