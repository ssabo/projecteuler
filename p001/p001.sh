#!/bin/bash

CAP=10
SUM=0

if [[ $1 =~ ^[0-9]+$ ]]
then
  CAP=$1
fi

for i in `seq 1 $((CAP - 1))`
do
  if [ $(( i % 3 )) -eq 0 -o $(( i % 5 )) -eq 0 ]
  then
    SUM=$(( SUM + i ))
  fi
done

echo $SUM
