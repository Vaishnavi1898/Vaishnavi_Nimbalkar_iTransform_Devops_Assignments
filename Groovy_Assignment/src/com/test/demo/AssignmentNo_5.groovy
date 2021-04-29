package com.test.demo

/* 5.	Prime Numbers
Write a method called isPrime that takes an integer argument and returns a boolean. Determine whether the number is prime by dividing it by all numbers from 2 up to one less than the number.
That limit is too high, of course. How high do you have to check to be sure whether you've gone far enough?
*/

def isPrime(num) {
	boolean flag= false
	for(int i=2; i<=num/2; ++i) {
		if(num % i==0) {
			flag= true
			break
		}
	}

	if(!flag)
		println num +"is a Prime number"
		
    else
		println("$num is not a Prime number ")			
	
}
println "Enter Number: "
int num= System.console().readLine().toInteger()
isPrime(num)