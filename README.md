# Learning-Log4j2

## Providers & Priorities

    ./gradlew run

This logs _"hello, world"_, using JUL, to the console (unless otherwise configured).

This uses the (new) `log4j-to-jul` module, which I ([vorburger](https://github.com/vorburger)@)
contributed in https://issues.apache.org/jira/browse/LOG4J2-3282.

The interesting part here is noticing that we [have dependencies] (app/build.gradle.kts)
to both `log4j-to-jul` **AND** `log4j-core` (which can happen, for various reasons),

But `log4j-to-jul` takes precedence over `log4j-core`, which is ignored.
