#!/bin/bash


read -p "Yourname?:" name
read -p "Lastname?:" lname
read -p "AGE?:" age



echo "Greetings $name $lname" 

fage=$(($age+10))
echo "your age in 10 years would be" $fage
