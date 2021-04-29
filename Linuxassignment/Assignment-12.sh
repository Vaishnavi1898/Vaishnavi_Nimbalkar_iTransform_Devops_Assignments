#!/bin/bash


read -p "Enter a number between 1 and 3:" num

if [[ 0 -lt $num ]]; then
      
	if [[ $num -lt 4 ]]; then
	     echo "right choosen"
         
        else
             echo "choose between 1 and 3 "
             echo $num > /dev/null
        fi
 fi
