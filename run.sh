#!/usr/bin/env bash

running_pid=`jps | grep fair-core | awk '{print $1}'`

if [ -z "$running_pid" ]
then
	echo "no running fair-core service"
else
	echo "stop running fair-core service"
	kill $running_pid
	tail --pid=$running_pid -f /dev/null
fi

KWCHAT_HOME=`dirname "$0"`

cd $KWCHAT_HOME

echo "start service fair-core"

java -jar $KWCHAT_HOME/fair-core.jar > $KWCHAT_HOME/log.out &

echo "done"

