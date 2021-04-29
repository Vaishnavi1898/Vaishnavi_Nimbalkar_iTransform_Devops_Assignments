#!/bin/bash

mynum=4

read -p "Guess my number between 1 to 5:" gnum

if [[ $gnum == $mynum ]]
then
	echo "you guessed it right"

fi	

	
