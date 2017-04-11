FROM openjdk:8u121-jre

MAINTAINER 'Y. Tyurin <tyurin23@gmail.com>'

ENV WORK_DIR /app

WORKDIR ${WORK_DIR}

EXPOSE 8080

ENV JAVA_OPTS ''
ENV JAVA_ARGS ''

ADD provision/entrypoint.sh /
ADD provision/start.sh ${WORK_DIR}/
ADD target/kube-example-app-1.0.jar ${WORK_DIR}/

ENTRYPOINT ["/entrypoint.sh"]