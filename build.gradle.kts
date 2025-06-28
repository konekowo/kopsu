plugins {
    id("java")
}

allprojects {
    apply(plugin = "eclipse")

    repositories {
        mavenCentral()
    }

    plugins.withId("java") {
        java {
            toolchain {
                languageVersion = JavaLanguageVersion.of(17)
            }
        }
    }
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

repositories {
    mavenCentral()
}
