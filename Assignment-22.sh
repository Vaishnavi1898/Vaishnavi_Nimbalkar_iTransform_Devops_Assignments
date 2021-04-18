#!user/bin/bash

var_change(){
  local var1='local 1'
  local var2='local 2'
  echo Inside function: var1 is $var1 : $var2

 }
var1='global1'
var2='global2'

echo Before fucntion call: var1 is $var1 : var2 is $var2
var_change
echo After function call: var1 is $var1 : var2 is $var2
