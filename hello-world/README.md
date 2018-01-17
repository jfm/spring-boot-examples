# Spring Boot Examples

## Hello World

### Building
~~~
./gradlew build
~~~

### Running
~~~
java -jar build/libs/hello-world-1.0-SNAPSHOT.jar
~~~

### Docker

#### Build
~~~
docker build . -t hello-world:latest
~~~

#### Run
~~~
docker run -p 8080:8080 hello-world:latest
~~~