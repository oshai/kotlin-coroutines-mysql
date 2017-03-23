package com.github.oshai

import com.github.mauricio.async.db.Connection
import com.github.mauricio.async.db.QueryResult
import scala.Option
import scala.collection.Seq
import scala.concurrent.Future

//class MockConnection : Connection {
//
//    val queryResult = QueryResult(0, "success", Option.empty())
//
//    override fun disconnect(): Future<Connection> {
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//    }
//
//    override fun connect(): Future<Connection> {
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//    }
//
//    override fun isConnected(): Boolean {
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//    }
//
//    override fun sendQuery(query: String?): Future<QueryResult> {
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//    }
//
//    override fun `sendPreparedStatement$default$2`(): Seq<Any> {
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//    }
//
//    override fun sendPreparedStatement(query: String?, values: Seq<Any>?): Future<QueryResult> {
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//    }
//
//
//}
