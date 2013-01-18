#!/bin/bash
#cd ~/projecteuler/$1
PWD=$( pwd )
FILE=$( basename $PWD )
g++ ${FILE}.cpp -o ${FILE}.bin

./${FILE}.bin
