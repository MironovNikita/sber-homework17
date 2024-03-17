package org.application.file_downloader;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Service
public class FileDownloadService {
    public void downloadFiles(List<String> urls, String directory, int maxThreads, int speedLimit) {
        ExecutorService executor = Executors.newFixedThreadPool(maxThreads);
        WebClient webClient = WebClient.builder().build();
        FileDownloader fileDownloader = new FileDownloader(speedLimit);

        for (String url : urls) {
            executor.submit(() -> {
                fileDownloader.download(url, directory, webClient);
            });
        }
        executor.shutdown();
    }
}
