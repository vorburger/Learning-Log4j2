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
}

application {
    mainClass.set("ch.vorburger.log4j.App")
}
