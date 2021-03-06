FROM java:8-jdk-alpine

MAINTAINER Davin Bao <davin.bao@gmail.com>

RUN set -x \
    && apk add --update bash curl ttf-dejavu \
    && cp /bin/bash /

COPY jira-6.3.6 /usr/local/jira
COPY *.sh /

ENV JIRA_HOME=/data

VOLUME ["/data"]
EXPOSE 8080 8443

CMD ["bash", "/entrypoint.sh"]
