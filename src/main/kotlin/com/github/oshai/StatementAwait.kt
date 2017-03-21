package com.github.oshai

import com.github.mauricio.async.db.Connection
import scala.collection.JavaConverters

class StatementAwait {

    fun await(connection: Connection, statement: String, vararg values: Any) {
        val future = connection.sendPreparedStatement(statement, JavaConverters.asScalaBuffer(values.toList()).toSeq())
    }
}
