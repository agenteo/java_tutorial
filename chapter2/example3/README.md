# Annotated servlet class running within tomcat.

Compile the servlet

```
javac -cp javac.servlet.jar ReservationGenerator
```

Create a jar

```
jar cf resapp.jar ReservationGenerator.class
```

```
mkdir apache-tomcat-9.0.0.M3/webapps/ROOT/WEB-INF/lib/
cp resapp.jar apache-tomcat-9.0.0.M3/webapps/ROOT/WEB-INF/lib/
```

When the servlet is annotate with @WebServlet you don't need to edit Tomcat (>7) web.xml.

**But you must ensure the web-app element metadata-complete attribute is set to "false".**

the meaning of the option is misleading:

http://www.coderanch.com/t/548158/Tomcat/WebServlet-annotation-working-Tomcat
https://tomcat.apache.org/migration-7.html
https://java.net/jira/si/jira.issueviews:issue-html/SERVLET_SPEC-36/SERVLET_SPEC-36.html
