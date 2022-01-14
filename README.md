# Learning-Log4j2

## Providers & Priorities

    ./gradlew run

This logs _"[hello, world](https://en.wikipedia.org/wiki/%22Hello,_World!%22_program#History)"_ using JUL to the console (unless otherwise configured).
It uses the (new) [`log4j-to-jul`](https://github.com/apache/logging-log4j2/tree/release-2.x/log4j-to-jul)
module, which I ([vorburger](https://github.com/vorburger)@) contributed in https://issues.apache.org/jira/browse/LOG4J2-3282.

The interesting part here is noticing that we [have dependencies](app/build.gradle.kts)
to both `log4j-to-jul` **AND** `log4j-core` (which can happen, for various reasons) -
but `log4j-to-jul` takes precedence over `log4j-core`, which is ignored.
