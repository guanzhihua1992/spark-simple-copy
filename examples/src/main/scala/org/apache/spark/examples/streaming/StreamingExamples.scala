package org.apache.spark.examples.streaming

import org.apache.logging.log4j.Level
import org.apache.logging.log4j.core.config.Configurator

import org.apache.spark.internal.Logging
object StreamingExamples extends Logging {
  /** Set reasonable logging levels for streaming if the user has not configured log4j. */
  def setStreamingLogLevels(): Unit = {
    if (Logging.islog4j2DefaultConfigured()) {
      // We first log something to initialize Spark's default logging, then we override the
      // logging level.
      logInfo("Setting log level to [WARN] for streaming example." +
        " To override add a custom log4j.properties to the classpath.")
      Configurator.setRootLevel(Level.WARN)
    }
  }
}
