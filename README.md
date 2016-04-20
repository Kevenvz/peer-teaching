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

## Routes

* `/server - GET` List all servers
* `/server - POST` Insert a new server
* `/server/{id} - GET` Get a specific server
* `/server/{id} - DELETE` Deletes a specific server

## The server object

The server object has a few properties: Processor, memory and storage space. Down below you can find an example object in JSON.

```
{
  "processor": "Intel i7",
  "memory": "4GB",
  "storage-space": "250GB"
}
```
