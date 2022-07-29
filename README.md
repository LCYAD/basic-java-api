# Basic Java API

This is a simple API which does the following
* simple GET request and return service name and time
* can call the same endpoint in another API

# How to use
* To start the service, run the following
```bash
PORT=8081 SERVICE_NAME=service1 OTHER_SERVICE_URL=http://localhost:8080 ./gradlew bootRun
```
now when you call `http://localhost:8081` you can get the service name

* To call another API you need to setup another API with a different port and different service name like
```bash
PORT=8080 SERVICE_NAME=service2 OTHER_SERVICE_URL=http://localhost:8081 ./gradlew bootRun
```
Once you have both API setup, when you call `http://localhost:8081/other`, the API should call `http://localhost:8080` and return service name of that API server