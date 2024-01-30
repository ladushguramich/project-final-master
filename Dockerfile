FROM openjdk:17

WORKDIR /app
COPY /target/jira-1.0.jar /app/app.jar
COPY ./resources/* /app/resources/


ENV DB_USERNAME=default
ENV DB_PASSWORD=default
ENV GITHUB_CLIENT_ID=default
ENV GITHUB_CLIENT_SECRET=default
ENV GOOGLE_CLIENT_ID=default
ENV GOOGLE_CLIENT_SECRET=default
ENV GITLAB_CLIENT_ID=default
ENV GITLAB_CLIENT_ID=default
ENV MAIL_USERNAME=default
ENV MAIL_PASSWORD=default

CMD ["java", "-jar", "app.jar"]