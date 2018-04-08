FROM alpine:latest

MAINTAINER Davin Bao <davin.bao@gmail.com>

RUN set -x \
    && apk add --update bash \
    && cp /bin/bash /

COPY jira-6.3.6 /usr/local/jira

VOLUME ["/data"]
EXPOSE 8080 8443

CMD ["bash", "/usr/local/jira/bin/start-jira.sh"]
