package com.github.oshai;

import com.github.mauricio.async.db.Connection;
import com.github.mauricio.async.db.QueryResult;
import scala.*;
import scala.collection.Seq;
import scala.concurrent.*;
import scala.concurrent.duration.Duration;
import scala.concurrent.java8.FuturesConvertersImpl;
import scala.reflect.ClassTag;
import scala.util.Try;

import java.util.concurrent.TimeoutException;

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
        return new Future<QueryResult>() {
            @Override
            public <U> void onSuccess(PartialFunction<QueryResult, U> partialFunction, ExecutionContext executionContext) {
                System.out.println("onSuccess");
            }

            @Override
            public <U> void onFailure(PartialFunction<Throwable, U> partialFunction, ExecutionContext executionContext) {
                System.out.println("onFailure");
            }

            @Override
            public <U> void onComplete(Function1<Try<QueryResult>, U> function1, ExecutionContext executionContext) {
                System.out.println("onComplete");
            }

            @Override
            public boolean isCompleted() {
                return true;
            }

            @Override
            public Option<Try<QueryResult>> value() {
                Function0<QueryResult> f = new Function0<QueryResult>() {
                    @Override
                    public QueryResult apply() {
                        return queryResult;
                    }

                    @Override
                    public boolean apply$mcZ$sp() {
                        return false;
                    }

                    @Override
                    public byte apply$mcB$sp() {
                        return 0;
                    }

                    @Override
                    public char apply$mcC$sp() {
                        return 0;
                    }

                    @Override
                    public double apply$mcD$sp() {
                        return 0;
                    }

                    @Override
                    public float apply$mcF$sp() {
                        return 0;
                    }

                    @Override
                    public int apply$mcI$sp() {
                        return 0;
                    }

                    @Override
                    public long apply$mcJ$sp() {
                        return 0;
                    }

                    @Override
                    public short apply$mcS$sp() {
                        return 0;
                    }

                    @Override
                    public void apply$mcV$sp() {

                    }
                };
                return Option.apply(Try.apply(f));
            }

            @Override
            public Future<Throwable> failed() {
                return null;
            }

            @Override
            public <U> void foreach(Function1<QueryResult, U> function1, ExecutionContext executionContext) {
                System.out.println("onSuccess");
            }

            @Override
            public <S> Future<S> transform(Function1<QueryResult, S> function1, Function1<Throwable, Throwable> function11, ExecutionContext executionContext) {
                return null;
            }

            @Override
            public <S> Future<S> map(Function1<QueryResult, S> function1, ExecutionContext executionContext) {
                return null;
            }

            @Override
            public <S> Future<S> flatMap(Function1<QueryResult, Future<S>> function1, ExecutionContext executionContext) {
                return null;
            }

            @Override
            public Future<QueryResult> filter(Function1<QueryResult, Object> function1, ExecutionContext executionContext) {
                return null;
            }

            @Override
            public Future<QueryResult> withFilter(Function1<QueryResult, Object> function1, ExecutionContext executionContext) {
                return null;
            }

            @Override
            public <S> Future<S> collect(PartialFunction<QueryResult, S> partialFunction, ExecutionContext executionContext) {
                return null;
            }

            @Override
            public <U> Future<U> recover(PartialFunction<Throwable, U> partialFunction, ExecutionContext executionContext) {
                return null;
            }

            @Override
            public <U> Future<U> recoverWith(PartialFunction<Throwable, Future<U>> partialFunction, ExecutionContext executionContext) {
                return null;
            }

            @Override
            public <U> Future<Tuple2<QueryResult, U>> zip(Future<U> future) {
                return null;
            }

            @Override
            public <U> Future<U> fallbackTo(Future<U> future) {
                return null;
            }

            @Override
            public <S> Future<S> mapTo(ClassTag<S> classTag) {
                return null;
            }

            @Override
            public <U> Future<QueryResult> andThen(PartialFunction<Try<QueryResult>, U> partialFunction, ExecutionContext executionContext) {
                return null;
            }

            @Override
            public Awaitable<QueryResult> ready(Duration duration, CanAwait canAwait) throws TimeoutException, InterruptedException {
                return new Awaitable<QueryResult>(){
                    @Override
                    public Awaitable<QueryResult> ready(Duration duration, CanAwait canAwait) throws TimeoutException, InterruptedException {
                        return null;
                    }

                    @Override
                    public QueryResult result(Duration duration, CanAwait canAwait) throws Exception {
                        return queryResult;
                    }
                } ;
            }

            @Override
            public QueryResult result(Duration duration, CanAwait canAwait) throws Exception {
                return queryResult;
            }
        };
    }

    public <A> Future<A> inTransaction(Function1<Connection, Future<A>> f, ExecutionContext executionContext) {
        throw new RuntimeException("not implemented");
    }
}
