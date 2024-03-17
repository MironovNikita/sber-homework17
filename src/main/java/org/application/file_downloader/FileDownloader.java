package org.application.file_downloader;

import org.springframework.web.reactive.function.client.WebClient;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileDownloader {
    private final int speedLimit;

    public FileDownloader(int speedLimit) {
        this.speedLimit = speedLimit;
    }

    public void download(String url, String directory, WebClient webClient) {
        try {
            String fileName = url.substring(url.lastIndexOf("/") + 1);
            long startDownloading = System.currentTimeMillis();
            byte[] bytes = webClient.get().uri(url).retrieve().bodyToMono(byte[].class).block();
            if (bytes != null) {
                double fileSizeKB = (double) bytes.length / 1024;
                long targetDownloadingTime = (long) (fileSizeKB / (speedLimit / 1000.0));

                Path filePath = Paths.get(directory, fileName);
                Files.write(filePath, bytes);

                long finishDownloading = System.currentTimeMillis() - startDownloading;

                if (finishDownloading < targetDownloadingTime) {
                    Thread.sleep(targetDownloadingTime - finishDownloading);
                    finishDownloading = System.currentTimeMillis() - startDownloading;
                }
                double speedKBpS = fileSizeKB / (finishDownloading / 1000.0);

                System.out.printf("Файл %s загружен за %d секунд(-ы) со скоростью %.2f кб/сек%n",
                        fileName,
                        finishDownloading / 1000,
                        speedKBpS);
            } else {
                System.out.printf("Ошибка загрузки файла по ссылке %s%n", url);
            }
        } catch (IOException | InterruptedException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
