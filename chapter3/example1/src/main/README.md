# Two Java classes in an executable Jar

At first the two classes didn't have an external dependency and were built in a jar with gradle default 'jar' function
defined by the java plugin.

Then we added a yodatime dependency to the gradle file, and in order to have the two classes and their dependency packaged
in a single jar we created a custom 'fatjar' gradle function.


To execute the fatjar:

```
java -jar build/libs/gs-gradle-all.jar
```