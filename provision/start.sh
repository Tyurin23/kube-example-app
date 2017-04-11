#!/bin/bash

set -e

DIR=$(dirname $0)
JAR="*.jar"

if [ -n "$DEBUG" ]; then
  OPTS="-Xdebug -Xrunjdwp:server=y,transport=dt_socket,address=5005,suspend=n"
fi

cd "$DIR"
java ${JAVA_OPTS} ${OPTS} -classpath ${JAR} org.springframework.boot.loader.JarLauncher ${JAVA_ARGS}