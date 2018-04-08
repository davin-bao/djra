#!/bin/sh

chmod -R 777 $JIRA_HOME/logs
chmod -R 777 $JIRA_HOME/temp
chmod -R 777 $JIRA_HOME/bin

echo "[JIRA] starting jira ..."
bash $JIRA_HOME/bin/start-jira.sh
echo "[JIRA] tailing jira logs ..."
tail -f $JIRA_HOME/logs/catalina.out

wait
