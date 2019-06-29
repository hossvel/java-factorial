FROM openjdk:8u151-slim
ENV APP_HOME=/usr/app/
WORKDIR $APP_HOME
COPY ./build/libs/* ./app.jar
EXPOSE 3000
CMD ["java","-jar","app.jar"]