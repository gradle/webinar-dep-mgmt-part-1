plugins {
   `java`
   `application`
}

repositories {
   jcenter()
}

dependencies {
   implementation(project(":gitutils"))
   implementation("info.picocli:picocli") {
      version {
         require("[3.9, 4[")
         prefer("3.9.5")
      }
   } 
}

application {
   mainClassName = "org.gradle.webinar.dm.cli.Main"
}

