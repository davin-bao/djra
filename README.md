# docker-jira
jira 6.3.6 for docker


### use docker command
docker run -it --name bind -v /xmisp/jira/data:/data:rw -p 80:8080 -p 8443:8443  192.168.189.47:5000/jira

### configration
/xmisp/server/jira/jira-6.3.6/atlassian-jira/WEB-INF/classes/jira-application.properties
/xmisp/server/jira/jira-6.3.6/conf/server.xml
/xmisp/jira/dbconfig.xml

### use docker compose

version: '3.3'
services:
  bind:
    image: 192.168.189.47:5000/jira:latest
    deploy:
      replicas: 1
      endpoint_mode: vip
      resources:
        limits:
          memory: 512M
    volumes:
    - /xmisp/jira/data:/data:rw
    ports:
    - 80:8080
    - 8443:8443
    networks:
      - backend
