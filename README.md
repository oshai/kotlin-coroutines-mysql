# [kotlin-coroutines-mysql](https://github.com/oshai/kotlin-coroutines-mysql) [![Apache License V.2](https://img.shields.io/badge/license-Apache%20V.2-blue.svg)](https://github.com/MicroUtils/kotlin-logging/blob/master/LICENSE)

Async kotlin mysql client, with coroutine suspending extensions. Based on [kotlinx-couroutines](https://github.com/Kotlin/kotlinx.coroutines) and [postgresql-async](https://github.com/mauricio/postgresql-async)

Show your :heart: with a [:star:](https://github.com/oshai/kotlin-coroutines-mysql/stargazers)

## Getting started

```kotlin
val connection : Connection = ...
val queryStatement = QueryStatement(statement = "select ...")
val preparedStatement = queryStatement.sendPreparedStatement(connection)
...
preparedStatement.awaitQuery()
```
## Download

TBD

## Contributing

- Pull requests are welcome!


