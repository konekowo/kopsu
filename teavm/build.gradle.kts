plugins {
    java
    id("org.teavm") version "0.9.2"
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

dependencies {
    teavm(teavm.libs.jso)
    teavm(teavm.libs.jsoApis)
    compileOnly("org.teavm:teavm-core:0.9.2")

    implementation(project(":core"))
}
