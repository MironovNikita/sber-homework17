
# Spring Framework

### ✨Немного теории

🛠️ **Spring Framework**

**Spring Framework** - это один из самых популярных и широко используемых фреймворков для разработки приложений на языке Java. Он предоставляет комплексный набор инструментов и функций для создания масштабируемых, гибких и надёжных приложений. Вот основные компоненты и возможности **Spring Framework**:

1. **Inversion of Control (IoC) / Dependency Injection (DI)**. Это основной принцип **Spring**. Вместо того, чтобы явным образом создавать и управлять объектами, **Spring** позволяет инвертировать контроль над созданием и внедрением зависимостей. Это делает ваш код более модульным, уменьшает связанность и облегчает тестирование.

2. **Spring Core Container**. Этот модуль содержит основные функции IoC и DI, включая контейнеры для управления жизненным циклом бинов, конфигурацию через XML, аннотации или Java-конфигурации, а также управление зависимостями.

3. **Aspect-Oriented Programming (AOP)**. **Spring** поддерживает **AOP**, позволяя разделять перекрестно-резонансную функциональность на отдельные модули (аспекты), что упрощает поддержку самих бизнес-операций.

4. **Spring MVC: Spring MVC (Model-View-Controller)** является веб-фреймворком, который обеспечивает модульную и гибкую архитектуру для создания веб-приложений. Он предлагает обработку запросов, маршрутизацию, валидацию, обработку исключений и другие функции для управления веб-приложениями.

5. **Spring Data Access / ORM**. **Spring** предоставляет поддержку для работы с базами данных и интеграции с ORM _(Object-Relational Mapping)_ фреймворками, такими как **`Hibernate`**, **`JPA`** и другими. Это упрощает доступ к данным и уменьшает сложность работы с базами данных.

6. **Spring Transaction Management**. **Spring** обеспечивает поддержку управления транзакциями для обеспечения целостности данных и сохранности транзакций при взаимодействии с базами данных и другими ресурсами.

7. **Spring Security**. **Spring Security** обеспечивает функции аутентификации, авторизации и защиты ваших приложений. Он предлагает различные механизмы аутентификации, отслеживание сеансов, защиту от атак и другие функции безопасности.

8. **Spring Integration**. Этот модуль обеспечивает интеграцию с внешними системами и сервисами, такими как системы обмена сообщениями, системы реестра, веб-службы и другие.

9. **Spring Testing**. **Spring Framework** предоставляет поддержку для тестирования приложений с помощью модуля **Spring Test**, который упрощает написание и запуск интеграционных и модульных тестов.

### 🚀Практика

В данной работе представлены реализации заданий, связанных с вышеописанной темой:
1. Завернуть любое предыдущее задание в Spring.
2. Написать программу с использованием Spring Boot для скачивания файлов.

## Задание - Spring

Взять любое задание в котором получается больше одного класса и завернуть старт в Spring.
Можно взять что-нибудь из предыдущих упражнений.

## 🤔 Описание результатов

Для реализации данного задания было взято данное [**задание**](https://github.com/MironovNikita/sber-homework8) - реализация кэширующего прокси с возможностью опциональной настройки. Полностью программа расположена в пакете [**hw8_spring**](https://github.com/MironovNikita/sber-homework17/tree/main/src/main/java/org/application/hw8_spring). Для применения **Spring** классы [**CacheProxy**](https://github.com/MironovNikita/sber-homework17/blob/main/src/main/java/org/application/hw8_spring/cacheProxy/CacheProxy.java) и [**ServiceImpl**](https://github.com/MironovNikita/sber-homework17/blob/main/src/main/java/org/application/hw8_spring/service/ServiceImpl.java) были помечены аннотацией **@Component**. Затем в [**Application**](https://github.com/MironovNikita/sber-homework17/blob/main/src/main/java/org/application/hw8_spring/Application.java) был вызван контекст приложения для запуска функционала программы, результаты которого описаны [**здесь**](https://github.com/MironovNikita/sber-homework8/blob/main/README.md). [**TaskStarter**](https://github.com/MironovNikita/sber-homework17/blob/main/src/main/java/org/application/hw8_spring/TaskStarter.java) отевчает за запуск расчётов.

## Задание - FileDownloader

Нужно написать программу, которая при старте будет скачивать эти файлы и складывать в указанную папку на локальном диске.
Программа должна уметь качать несколько файлов одновременно (в несколько потоков, например, 3 потока) и выдерживать указанное ограничение на скорость загрузки, например, 500 килобайт в секунду.
Программу можно сделать консольной, можно использовать spring-boot.
Для работы с http, с ограничением скорости и любыми манипуляциямис данными можно брать любую
библиотеку.
При желании, можно любую часть сделать самостоятельно.
Нужно учитывать, что программа может развиваться, из неё могут быть переиспользованы полезные
части.
Поэтому крайне желательно использовать абстракции (ООП, интерфейсы, паттерны, SOLID и т.д.).

## 🤨 Описание результатов

Для реализации данного задания был создан отдельный пакет [**file_downloader**](https://github.com/MironovNikita/sber-homework17/tree/main/src/main/java/org/application/file_downloader), который содержит в себе следующие классы:
1. [**FileDownloaderApp**](https://github.com/MironovNikita/sber-homework17/blob/main/src/main/java/org/application/file_downloader/FileDownLoaderApp.java) - отвечает за запуск **Spring Boot** приложения.
2. [**FileDownloadController**](https://github.com/MironovNikita/sber-homework17/blob/main/src/main/java/org/application/file_downloader/FileDownloadController.java) - отвечает за обработку запроса на скачивание.
3. [**FileDownloadService**](https://github.com/MironovNikita/sber-homework17/blob/main/src/main/java/org/application/file_downloader/FileDownloadService.java) - отвечает за выделение потоков на скачивание, а также делегирует выполнение задачи [**FileDownloader**](https://github.com/MironovNikita/sber-homework17/blob/main/src/main/java/org/application/file_downloader/FileDownloader.java).
4. [**FileDownloader**](https://github.com/MironovNikita/sber-homework17/blob/main/src/main/java/org/application/file_downloader/FileDownloader.java) - отвечает непосредственно за загрузку файлов с определённой скоростью.

####
[**FileDownloadController**](https://github.com/MironovNikita/sber-homework17/blob/main/src/main/java/org/application/file_downloader/FileDownloadController.java) принимает такие параметры, как:
- **`urls`** - список адресов, с которых необходимо загрузить файлы;
- **`directory`** - конечная папка, куда необходимо сохранить файлы;
- **`maxThreads`** - число потоков, в которых будет осуществляться скачивание файлов;
- **`speedLimit`** - скорость загрузки в килобайт/секунду.

[**FileDownloadService**](https://github.com/MironovNikita/sber-homework17/blob/main/src/main/java/org/application/file_downloader/FileDownloadService.java) создаёт ограниченный пул потоков на основании параметра **`speedLimit`**, **webClient**, который будет производить запросы по url, а также создаёт непосредственно класс-загрузчик файлов.

[**FileDownloader**](https://github.com/MironovNikita/sber-homework17/blob/main/src/main/java/org/application/file_downloader/FileDownloader.java) в методе **`download`** принимает строку url для загрузки файла, строку-адрес, куда нужно будет сохранить этот файл, а также экземпляр webClient. Он высчитывает начало работы метода, массив байтов скачиваемого файла, а затем проверяет, получил ли клиент какой-либо массив байтов.

Если всё успешно, то вычисляется время, за которое файл должен быть загружен, и происходит сохранение файла. Если файл загружается быстрее, чем переданный параметр скорости, то поток не будет завершён, пока не будет достигнуто необходимое время загрузки. По итогу выводится сообщение о загрузке:
```java
System.out.printf("Файл %s загружен за %d секунд(-ы) со скоростью %.2f кб/сек%n",
                        fileName,
                        finishDownloading / 1000,
                        speedKBpS);
```
, где 
- **`filename`** - имя файла;
- **`finishDownloading / 1000`** - время, затраченное на загрузку в секундах;
- **`speedKBpS`** - скорость загрузки в килобайтах/секунду.

Сам запрос был сформирован в Postman. Ознакомиться с ним можно [**здесь**](https://github.com/MironovNikita/sber-homework17/tree/main/src/main/java/org/application/file_downloader/postman/file_downloader_postman.json). Так он выглядит в программе:

<p align="center">

  <img src="https://github.com/MironovNikita/sber-homework17/blob/main/res/postman.png">

</p>

####
Загрузка файлов осуществлялась по следующим url-адресам:
- [**первый**](https://tiniatov.ru/wp-content/uploads/c/a/b/cab466aa3eb8325e9ef78a9935ad56c3.png);
- [**второй**](https://cdn-icons-png.flaticon.com/512/1183/1183618.png);
- [**третий**](https://cdn.coursehunter.net/category/java.png);
- [**четвёртый**](https://cdn3.iconfinder.com/data/icons/developer-files-2-add-on/48/v-35-1024.png);
- [**пятый**](https://tiniatov.ru/wp-content/uploads/a/f/c/afc39d2488aaf2a9c242ca3d23a128dd.png);
- [**шестой**](https://www.shareicon.net/download/2015/09/25/107068_development_512x512.png).
При отправке запроса с параметром **`speedLimit = 500`** получил следующие результаты:

<p align="center">

  <img src="https://github.com/MironovNikita/sber-homework17/blob/main/res/speed500.png">

</p>

При отправке запроса с параметром **`speedLimit = 10`** получил следующие результаты:

<p align="center">

  <img src="https://github.com/MironovNikita/sber-homework17/blob/main/res/speed10.png">

</p>

В результате работы обоих вариантов с разными скоростями загрузки результат в папке [**downloads**](https://github.com/MironovNikita/sber-homework17/tree/main/src/main/java/org/application/file_downloader/downloads) будет одинаковый:

<p align="center">

  <img src="https://github.com/MironovNikita/sber-homework17/blob/main/res/files.png">

</p>

Результат сборки текущего проекта:

```java
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  2.849 s
[INFO] Finished at: 2024-03-17T18:16:25+03:00
[INFO] ------------------------------------------------------------------------
```