# Automated tests with jUnit

Gradle provide a test task with the `java` plugin. https://docs.gradle.org/current/userguide/java_plugin.html#sec:java_test

`gradle test` runs all your tests, but there are lots of filters that can be used ie. `gradle test --tests org.gradle.SomeTest.someSpecificFeature`

To see more explicit test errors:


```
test {
    testLogging{
        exceptionFormat = 'full'
    }

}
```
