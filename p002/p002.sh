#!/bin/bash

FIRST=1
SECOND=2

SUM=2

while [ true ]
do
  TMP=$(( FIRST + SECOND ))
  FIRST=$SECOND
  SECOND=$TMP

  if [ $SECOND -gt 4000000 ]
  then
    break
  fi
 
  if [ $(( SECOND % 2 )) -eq 0 ]
  then
    SUM=$(( SUM + SECOND ))
  fi
done

echo $SUM
