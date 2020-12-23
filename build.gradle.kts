/*
 * This file was generated by the Gradle 'init' task.
 */

group = "site.four2"
version = "2.0"
description = "febs"
java.sourceCompatibility = JavaVersion.VERSION_1_8

plugins {
    application
}

repositories {
    // ～/.m2
    mavenLocal()
    maven {
        url = uri("https://maven.aliyun.com/repository/public/")
    }
    maven {
        url = uri("https://maven.aliyun.com/repository/spring/")
    }
    // https://repo.maven.apache.org/maven2
    mavenCentral() 
}

dependencies {
    annotationProcessor ("org.projectlombok:lombok:1.18.6")
    implementation("org.springframework.boot:spring-boot-starter-web:2.4.0")
    implementation("org.springframework.boot:spring-boot-starter-aop:2.4.0")
    implementation("org.springframework.boot:spring-boot-starter-thymeleaf:2.4.0")
    implementation("org.springframework.boot:spring-boot-starter-data-redis:2.4.0")
    implementation("org.springframework.boot:spring-boot-starter-cache:2.4.0")
    implementation("org.springframework.boot:spring-boot-starter-jdbc:2.4.0")
    implementation("org.springframework.boot:spring-boot-configuration-processor:2.4.0")
    implementation("org.springframework.boot:spring-boot-actuator:2.4.0")
    implementation("org.springframework.boot:spring-boot-starter-actuator:2.4.0")
    implementation("org.springframework.boot:spring-boot-starter-validation:2.4.0")
    implementation("org.apache.commons:commons-pool2:2.9.0")
    implementation("org.quartz-scheduler:quartz:2.3.2")
    implementation("com.baomidou:mybatis-plus-boot-starter:3.3.1")
    implementation("com.baomidou:mybatis-plus-generator:3.3.1")
    implementation("com.baomidou:dynamic-datasource-spring-boot-starter:3.0.0")
    implementation("org.freemarker:freemarker:2.3.28")
    implementation("p6spy:p6spy:3.8.1")
    implementation("org.apache.shiro:shiro-spring:1.6.0")
    implementation("org.crazycake:shiro-redis:3.3.1")
    implementation("com.github.theborakompanioni:thymeleaf-extras-shiro:2.0.0")
    implementation("org.lionsoul:ip2region:1.7.2")
    implementation("org.apache.commons:commons-lang3:3.11")
    implementation("commons-io:commons-io:2.6")
    implementation("com.google.guava:guava:27.0-jre")
    implementation("com.wuwenze:ExcelKit:2.0.72")
    implementation("org.projectlombok:lombok:1.18.16")
    implementation("com.github.whvcse:easy-captcha:1.6.2")
    implementation("org.jsoup:jsoup:1.12.1")
    implementation("io.springfox:springfox-boot-starter:3.0.0")
    implementation("xml-apis:xml-apis:1.0.b2")
    runtimeOnly("mysql:mysql-connector-java:8.0.22")
}

application {
    mainClass.set("cc.mrbird.febs.FebsShiroApplication")
}

tasks.withType<JavaCompile>() {
    options.encoding = "UTF-8"
}

tasks.withType<Jar> {
    manifest {
        attributes["Main-Class"] = "cc.mrbird.febs.FebsShiroApplication"
    }
}