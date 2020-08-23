# Dragon

## Installation

```shell
mvn install
```

## Running

```shell
# For Maven based project
mvn spring-boot:run

# For Gradle based project
gradle bootRun
```

```shell


curl localhost:8080/dragons

curl -H 'Content-Type: application/json' -d '{"name": "vijay", "power": "fire"}' localhost:8080/dragons

export MAVEN_OPTS=-Xmx1024m

```
