#!/bin/bash

javac -cp javax.servlet.jar ReservationGeneratorServlet.java
jar cf reservation_servlet.jar ReservationGeneratorServlet.class
./apache-tomcat-9.0.0.M3/bin/shutdown.sh
cp reservation_servlet.jar apache-tomcat-9.0.0.M3/webapps/ROOT/WEB-INF/lib/
./apache-tomcat-9.0.0.M3/bin/startup.sh
