#!bin/bash

LIST=$(ls *.sh)

for i in $LIST
do
 itr=$( cat $i)
 echo "The content of $i are:"
 echo $itr
done
