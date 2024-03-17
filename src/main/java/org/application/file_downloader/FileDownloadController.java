package org.application.file_downloader;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/download")
public class FileDownloadController {
    private final DownloadService downloadService;

    @PostMapping
    public String fileDownload(@RequestParam("urls")List<String> urls,
                               @RequestParam("directory") String directory,
                               @RequestParam("maxThreads") int maxThreads,
                               @RequestParam("speedLimit") int speedLimit) {
        downloadService.downloadFiles(urls, directory, maxThreads, speedLimit);
        return "Данные успешно загружены";
    }
}
