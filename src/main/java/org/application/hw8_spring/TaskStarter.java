package org.application.hw8_spring;

import org.application.hw8_spring.service.Service;

import java.util.List;

public class TaskStarter {
    public static void run(Service cachedService) {
        System.out.println("Проверка метода \"powerNumber\"");
        double result1 = cachedService.powerNumber(2, 3);
        System.out.println("Результат 1: " + result1);

        double result1Cached = cachedService.powerNumber(2, 3);
        System.out.println("Кэшированный результат 1: " + result1Cached);

        System.out.println("\nПроверка метода \"factorial\"");
        int result2 = cachedService.factorial(5);
        System.out.println("Результат 2: " + result2);

        int result2Cached = cachedService.factorial(5);
        System.out.println("Кэшированный результат 2: " + result2Cached);

        System.out.println("\nПроверка метода \"dividedWithoutRemainder\"");
        List<Integer> result3 = cachedService.dividedWithoutRemainder(30);
        System.out.println("Результат 3: " + result3);

        List<Integer> result3Cached = cachedService.dividedWithoutRemainder(30);
        System.out.println("Кэшированный результат 3: " + result3Cached);


        System.out.println("\nПроверка метода \"identity\"");
        int square1 = cachedService.squaring("Овал", 8);
        System.out.println("Результат 4: " + square1);

        int squareCached1 = cachedService.squaring("Овал", 8);
        System.out.println("Кэшированный результат 4: " + squareCached1);

        int square2 = cachedService.squaring("Кружочек", 8);
        System.out.println("Результат 5: " + square2);

        int squareCached2 = cachedService.squaring("Кружочек", 8);
        System.out.println("Кэшированный результат 5: " + squareCached2);
    }
}
