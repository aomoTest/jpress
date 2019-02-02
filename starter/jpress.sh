#!/bin/bash
# ----------------------------------------------------------------------
# name:         jpress.sh
# version:      1.0
# description:  JPress 控制脚本
# author:       yangfuhai
# email:        fuhai999@gmail.com
# use : ./jpress.sh {start, stop, restart}
# ----------------------------------------------------------------------

command="$1"

if [[ "$command" != "start" ]] && [[ "$command" != "stop" ]] && [[ "$command" != "restart" ]]; then
	echo "./jpress.sh {start, stop, restart}"
	exit 0
fi

# 启动入口类，该脚本文件用于别的项目时要改这里
MAIN_CLASS=io.jboot.app.JbootApplication

# Java 命令行参数，根据需要开启下面的配置，改成自己需要的，注意等号前后不能有空格
# JAVA_OPTS="-Xms256m -Xmx1024m -Dundertow.port=80 -Dundertow.host=0.0.0.0"
# JAVA_OPTS="-Dundertow.port=80 -Dundertow.host=0.0.0.0"

# 生成 class path 值
APP_BASE_PATH=$(cd `dirname $0`; pwd)
CP=${APP_BASE_PATH}/config:${APP_BASE_PATH}/lib/*

function start()
{
  # 运行为后台进程，并在控制台输出信息
    java -Xverify:none ${JAVA_OPTS} -cp ${CP} ${MAIN_CLASS} &

    # 运行为后台进程，并且不在控制台输出信息
    # nohup java -Xverify:none ${JAVA_OPTS} -cp ${CP} ${MAIN_CLASS} >/dev/null 2>&1 &

    # 运行为后台进程，并且将信息输出到 output.log 文件
    # nohup java -Xverify:none ${JAVA_OPTS} -cp ${CP} ${MAIN_CLASS} > output.log &

    # 运行为非后台进程，多用于开发阶段，快捷键 ctrl + c 可停止服务
    # java -Xverify:none ${JAVA_OPTS} -cp ${CP} ${MAIN_CLASS}
}

function stop()
{
    # 运行为后台进程，并在控制台输出信息
    kill `pgrep -f ${MAIN_CLASS}` 2>/dev/null

    # 运行为后台进程，并且不在控制台输出信息
    # nohup java -Xverify:none ${JAVA_OPTS} -cp ${CP} ${MAIN_CLASS} >/dev/null 2>&1 &

    # 运行为后台进程，并且将信息输出到 output.log 文件
    # nohup java -Xverify:none ${JAVA_OPTS} -cp ${CP} ${MAIN_CLASS} > output.log &

    # 运行为非后台进程，多用于开发阶段，快捷键 ctrl + c 可停止服务
    # java -Xverify:none ${JAVA_OPTS} -cp ${CP} ${MAIN_CLASS}

}

if [[ "$command" == "start" ]]; then
	start
elif [[ "$command" == "stop" ]]; then
    stop
else
    stop
    start
fi
