---
author: choutianxius
date: 2024-07-15
---

# Hello Spring Boot

A hello world app built with Spring Boot. Initialized with [Spring Initializr](https://start.spring.io/). Requires Java 17.

## Quick Start

### Option 1

Use your choice of IDE to work with this project.

### Option 2

Or you can run the project from command line. You need Gradle installed (tested with Gradle 8.8).

For the first time start, run

```shell
gradle wrapper --gradle-version 8.8 # or with your gradle version, which will change the gradle/wrapper/gradle-wrapper.properties file
```

This will generate the `gradlew` and `gradlew.bat` (Windows) scripts, which can be used for running/building the app. For the following commands, use `./gradlew` if you are on a UNIX-like environment, or `.\gradlew.bat` if you are using Windows.

For dev start, use

```shell
./gradlew bootRun
```

Or you can build the project and run the `.jar` application:

```shell
./gradlew build
java -jar ./build/libs/hello-spring-boot-<version>-SNAPSHOT.jar
```

## Unit Testing

Use your choice of IDE to run the tests. Or, from command line, run

```shell
./gradlew test -i
```
