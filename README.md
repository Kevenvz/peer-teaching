# Dropwizard Peer Teaching

Example application build in Dropwizard for a Peer Teaching lesson at het Grafisch Lyceum Utrecht.

## Dependencies

There are a few dependencies you need to have in order to build, and run the project.

* [Java Development Kit (JDK)](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
* [Maven](https://maven.apache.org/)

## How to build

Make sure `Maven` is in your path so that you can access the `mvn` command. Then open up a terminal and execute the command `mvn package`. A .jar file will be build inside the `target` directory.

## How to run

Make sure you first build the project and the `target` directory exist. Then open up a terminal and execute the command `java -jar target/peer-teaching-1.0-SNAPSHOT.jar server`
