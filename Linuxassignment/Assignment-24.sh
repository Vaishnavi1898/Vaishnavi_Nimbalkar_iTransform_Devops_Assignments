#!/user/bin/bash

function gender(){
local arms=2
local legs=2
  if [[ $ans -eq Female ]];then
           Female; 
   else 
          Male;
    fi 
   }

  function Female(){
          echo "Male has $arms arms ,$legs legs and no beards."
          }


  function Male(){
           echo "Female has $arms arms, $legs legs and beard."
          }
      

echo "Enter Male or Female"
read ans
gender $ans
