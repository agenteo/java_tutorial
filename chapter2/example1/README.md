# Servlet class running within tomcat.

Compile the servlet

```
javac -cp javac.servlet.jar ReservationGenerator
```

```cp ReservationGenerator.class apache-tomcat-9.0.0.M3/webapps/ROOT/WEB-INF/classes/ReservationGenerator.class```

add: 


```
  <servlet>
     <servlet-name>ReservationGenerator</servlet-name>
     <servlet-class>ReservationGenerator</servlet-class>
  </servlet>

  <servlet-mapping>
     <servlet-name>ReservationGenerator</servlet-name>
     <url-pattern>/generate_reservation</url-pattern>
  </servlet-mapping>
```

to


```apache-tomcat-9.0.0.M3/webapps/ROOT/WEB-INF/web.xml```
