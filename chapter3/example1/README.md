# Gradle example building a fatjar

This is using jodatime as a dependency example but it doesn't offer much on top of Java8.

Created a custom fatjar gradle function to build a jar with all the dependencies (one in this case).

You can see what's in the jar with `jar tf build/libs/gs-gradle-all.jar`

You can execute the Main in the jar with `java -jar build/libs/gs-gradle-all.jar`

**NOTE ABOUT INTELLIJ**

The project was initially imported not from a gradle module causing the auto complete to not find the gradle dependencies and failing to autocomplete.
