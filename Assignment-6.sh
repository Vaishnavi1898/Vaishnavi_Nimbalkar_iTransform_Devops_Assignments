#!/bin/bash

first=1
second=2
third=3

sum=$(($first + $second))

multiplication=$(($sum * $third))

echo "sum of two no. is $sum and multiplying with 3rd no. is $multiplication"

echo $((( $first + $second) * $third))

