plugins {
    kotlin("jvm") version "1.5.31"
    java
    groovy
}

group = "io.template"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.5.31")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.1")
    testImplementation("org.codehaus.groovy:groovy-all:3.0.8")
    testImplementation("org.spockframework:spock-core:2.0-groovy-3.0")
    testImplementation("org.spockframework:spock-spring:2.0-groovy-3.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.1")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}