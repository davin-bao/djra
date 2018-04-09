#!/bin/sh

chmod -R 777 /usr/local/jira/logs
chmod -R 777 /usr/local/jira/temp
chmod -R 777 /usr/local/jira/bin

echo "[JIRA] starting jira ..."
bash /usr/local/jira/bin/start-jira.sh
echo "[JIRA] tailing jira logs ..."
tail -f /usr/local/jira/logs/catalina.out

wait
