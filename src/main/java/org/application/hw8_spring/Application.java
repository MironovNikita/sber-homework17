package org.application.hw8_spring;

import org.application.hw8_spring.cacheProxy.CacheProxy;
import org.application.hw8_spring.service.Service;
import org.application.hw8_spring.service.ServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        System.out.println("Задание №1 Spring");
        String cacheFolder = "src/main/java/org/application/hw8_spring/proxyData";

        ApplicationContext applicationContext = SpringApplication.run(Application.class, args);
        Service service = applicationContext.getBean(ServiceImpl.class);
        Service cachedService = CacheProxy.cache(service, cacheFolder, Service.class);

        TaskStarter.run(cachedService);
    }
}