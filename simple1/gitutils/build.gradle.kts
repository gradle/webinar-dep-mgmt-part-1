plugins {
    `java-library`
}

repositories {
    jcenter()
}

dependencies {
    implementation("org.slf4j:slf4j-api:1.7.26")
    implementation("org.eclipse.jgit:org.eclipse.jgit:5.3.0.201903130848-r")

    testImplementation("org.junit.jupiter:junit-jupiter:5.4.1")
    testRuntimeOnly("org.slf4j:slf4j-simple:1.7.26")
}


tasks.test {
    useJUnitPlatform()
}
