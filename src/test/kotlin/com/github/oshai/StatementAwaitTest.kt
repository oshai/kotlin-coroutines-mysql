package com.github.oshai

import kotlinx.coroutines.experimental.runBlocking
import org.junit.Assert.assertEquals
import org.junit.Test

class StatementAwaitTest {

    @Test
    fun sendPreparedStatement() = runBlocking {
        val queryStatement = QueryStatement(statement = "select 1")
        val mockConnection = MockConnection()
        val sendPreparedStatement = queryStatement.sendPreparedStatement(mockConnection)
        assertEquals(mockConnection.queryResult, sendPreparedStatement.awaitQuery())
    }

}
