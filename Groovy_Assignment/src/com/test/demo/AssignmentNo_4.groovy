package com.test.demo

//4.	Strings and GroovyStrings
//a. How many characters are in the string "Hello, Groovy!"?

String a ="Hello, Groovy"
println("String length is "+a.length())


//b. Define a string variable containing a name. Print a hello statement with your name using string concatenation, then using a Groovy string.

String name="Vaishnavi"
println"Hello "+name
println("Hello ${name}")


//c. Demonstrate that "racecar" is a palindrome by comparing it to its reverse. Do the same with "Bob", removing case sensitivity first.


String s2 =""
def s1= System.console().readLine('Enter string ')

println "Hello $s1"

int length = s1.length();
for(int i = length - 1; i >= 0; i --)
{
	s2 = s2 + s1.charAt(i)
}
if (s1.equalsIgnoreCase(s2))
{
	println("String is Palindrome");
}
else
{
	println("String is NOT a Palindrome");
}


//d. Define a string variable containing the sentence, "Hello, World. How are you?". Split the sentence into an array using the split method. Count the number of words. Do the same using the tokenize method

String sentence="Hello, World. How are you?"
println sentence

println sentence.split()
println sentence.tokenize()
//println sentence.countTokens()

//e. Using the same sentence, use array notation (square brackets) to print the substring "World".
println sentence[7..11]

//f. Use array notation to print the last word, but reversed.
println sentence[-2..-5]
print sentence[24..22]