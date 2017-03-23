package com.github.oshai

import com.github.mauricio.async.db.Connection
import com.github.mauricio.async.db.QueryResult
import kotlinx.coroutines.experimental.future.await
import scala.collection.JavaConversions
import java.util.concurrent.CompletableFuture
import java.util.concurrent.CompletionStage

object StatementAwait {

    fun QueryStatement.sendPreparedStatement(connection: Connection): CompletableFuture<QueryResult> {
        val future = connection.sendPreparedStatement(this.statement, JavaConversions.asScalaBuffer(this.values).toSeq())
        val javaFuture: CompletionStage<QueryResult> = scala.compat.java8.FutureConverters.toJava(future)
        return (javaFuture as CompletableFuture<QueryResult>)
    }

    suspend fun CompletableFuture<QueryResult>.awaitQuery() : QueryResult {
        return this.await()
    }
}

data class QueryStatement(val statement: String, val values: List<Any>)
