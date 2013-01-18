#!/bin/bash
#cd ~/projecteuler/$1
PWD=$( pwd )
FILE=$( basename $PWD )
javac ${FILE}.java
[[ $? ]] && time java ${FILE}
