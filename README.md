# Learning-Log4j2

## Providers & Priorities

    $ ./gradlew run
    Jan 14, 2022 6:30:52 PM ch.vorburger.log4j.App main
    INFO: hello, world

As we can see, this logged _"[hello, world](https://en.wikipedia.org/wiki/%22Hello,_World!%22_program#History)"_ using JUL to the console (unless otherwise configured).
It uses the (new) [`log4j-to-jul`](https://github.com/apache/logging-log4j2/tree/release-2.x/log4j-to-jul)
module, which I ([vorburger](https://github.com/vorburger)@) contributed in https://issues.apache.org/jira/browse/LOG4J2-3282.

The interesting part here is noticing that in this project we [have dependencies](app/build.gradle.kts)
to both `log4j-to-jul` **AND** `log4j-core` (which can happen, for various reasons) -
but `log4j-to-jul` takes precedence over `log4j-core`, which is ignored.

This is because `LogManager` respects the _priority_ of each `Provider`,
and JUL's is 15 (or 20, [after this PR](https://github.com/apache/logging-log4j2/pull/699)) whereas Core's is 10.

We can make `LogManager` print details about this e.g. by putting a
[`log4j2.StatusLogger.properties`](app/src/main/resources/log4j2.StatusLogger.properties) on the classpath,
which [after this bug is fixed](https://issues.apache.org/jira/browse/LOG4J2-3340) will show:

    WARN StatusLogger Multiple logging implementations found: 
    Factory: org.apache.logging.log4j.core.impl.Log4jContextFactory, Weighting: 10
    Factory: org.apache.logging.log4j.tojul.JULLoggerContextFactory, Weighting: 15
    Using factory: org.apache.logging.log4j.tojul.JULLoggerContextFactory
