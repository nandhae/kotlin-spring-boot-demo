<b>Setup instructions</b>

Prerequisites:

    - JDK 10
    - Gradle

--Create user and database
```sh
 $ psql
 
 > CREATE DATABASE kolin_demo;
```

--To build
```sh
$ gradle clean build
```

--To run migrations
```sh
$ gradle flywayMigrate -i
```

--To start the server
```sh
$ ./gradlew clean bootRun
```

--To run the tests
```sh
$ ./gradlew test
```