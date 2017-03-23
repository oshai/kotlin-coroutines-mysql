package com.github.oshai;

import com.github.mauricio.async.db.Connection;
import com.github.mauricio.async.db.QueryResult;
import scala.Function0;
import scala.Function1;
import scala.collection.Seq;
import scala.concurrent.ExecutionContext;
import scala.concurrent.Future;
import scala.concurrent.Future$;
import scala.concurrent.java8.FuturesConvertersImpl;

public class JavaMockConnection implements Connection {

  QueryResult queryResult = new QueryResult(0L, "success", null);

  public Future<Connection> disconnect() {
    return null;
  }

  public Future<Connection> connect() {
    return null;
  }

  public boolean isConnected() {
    return false;
  }

  public Future<QueryResult> sendQuery(String query) {
    return null;
  }

  public Seq<Object> sendPreparedStatement$default$2() {
    return null;
  }

  public Future<QueryResult> sendPreparedStatement(String query, Seq<Object> values) {
//    return scala.concurrent.Future$.MODULE$.apply(() -> queryResult, ExecutionContext.Implicits$.MODULE$.global());
    Future<QueryResult> f1 = FuturesConvertersImpl.successful(queryResult);
  return f1;
  }

  public <A> Future<A> inTransaction(Function1<Connection, Future<A>> f, ExecutionContext executionContext) {
    throw new RuntimeException("not implemented");
  }
}
