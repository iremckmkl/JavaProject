#!/bin/sh
# This is a comment!


mvn clean
mvn install
mvn compiler:compile
mvn org.apache.maven.plugins:maven-compiler-plugin:compile
mvn org.apache.maven.plugins:maven-compiler-plugin:2.0.2:compile



