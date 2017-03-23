package com.github.oshai

import com.github.mauricio.async.db.Connection
import com.github.mauricio.async.db.QueryResult
import scala.*
import scala.collection.Seq
import scala.compat.java8.`FutureConverters$`
import scala.concurrent.Awaitable
import scala.concurrent.CanAwait
import scala.concurrent.ExecutionContext
import scala.concurrent.Future
import scala.concurrent.duration.Duration
import scala.reflect.ClassTag
import scala.util.Try

import java.util.concurrent.CompletableFuture
import java.util.concurrent.TimeoutException

class MockConnection : Connection {

    internal var queryResult = QueryResult(0L, "success", null)

    override fun disconnect(): Future<Connection>? {
        return null
    }

    override fun connect(): Future<Connection>? {
        return null
    }

    override fun isConnected(): Boolean {
        return false
    }

    override fun sendQuery(s: String): Future<QueryResult>? {
        return null
    }

    override fun sendPreparedStatement(s: String, seq: Seq<Any>): Future<QueryResult> {
        return `FutureConverters$`.`MODULE$`.toScala(CompletableFuture.completedFuture(queryResult))
    }

    override fun `sendPreparedStatement$default$2`(): Seq<Any>? {
        return null
    }

    override fun <A> inTransaction(function1: Function1<Connection, Future<A>>, executionContext: ExecutionContext): Future<A>? {
        return null
    }
}
