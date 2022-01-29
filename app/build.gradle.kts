plugins {
    application
}

repositories {
    mavenLocal()
    mavenCentral()
}

dependencies {
    implementation("org.apache.logging.log4j:log4j-to-jul:2.17.2-SNAPSHOT")
    implementation("org.apache.logging.log4j:log4j-core:2.17.2-SNAPSHOT")

    // Log4j v1
    // NEVER implementation("log4j:log4j:1.2.17")
    // MAYBE implementation("org.apache.logging.log4j:log4j-1.2-api:2.17.1")
    // BETTER
    implementation("org.slf4j:log4j-over-slf4j:1.7.35")
    implementation("org.slf4j:slf4j-jdk14:1.7.35")
}

application {
    mainClass.set("ch.vorburger.log4j.App")
}
