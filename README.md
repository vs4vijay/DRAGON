# Dragon

## Installation

```shell
mvn install
```

## Running

```shell
mvn boot:run
```

```shell


curl localhost:8080/dragons

curl -H 'Content-Type: application/json' -d '{"name": "vijay", "power": "fire"}' localhost:8080/dragons

```
