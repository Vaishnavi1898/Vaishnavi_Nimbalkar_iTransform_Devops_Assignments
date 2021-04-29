package com.test.demo

//1.	Sorting Strings
//Create a list of strings. Sort them alphabetically. Sort them by length. Sort them by length in descending order.

def str = ["Blue","Green","Black","Red","White","Yellow","Orange","Pink"]

println str.sort()
println str.sort { it.size() }
println str.sort { -it.size() }


println"================================================"


//2.	Processing a list of numbers
//Create a list of numbers. Add them together. First double each number, then add them up. Compute their average.

def x1 =[1,2,3,4,5,6,7,8,9]
println x1
println x1.sum()

def x2 = x1.multiply(2)
println x2
println x2.sum()
println x2.average()

println"================================================"

//3.	Reading a web page
//Using the Groovy JDK, access your home page and display the source code. Print the length of each line of the home page.

def urlContents = "https://en.wikipedia.org/wiki/Apache_Groovy".toURL().getText()
println urlContents.eachLine {println it}
println urlContents.eachLine { it -> println "The Line is :" + it + "and its size is :" + it.size() }

println"================================================"


//4.	Closures as a filter
//Create a list of numbers. Print all elements greater than zero.

def list=[2,6,-3,0,5,-9]
def filter=list.findAll{it>0}
 println filter


println"================================================"


//5.	Multi-line strings
//Make a multi-line string. Compute the number of vowels on each line.



def string= """Hello everyone,
			this is a multiline string,
			example for assignment """
count=0
def vow=["a","e","i","o","u"]
for (def i in string) {
for (def j in vow) {
if (i==j) {
count+=1

}
}
}
println "The number of vowels in the given string is :"+count


println"================================================"


//6.	Padded binary output
//Print the numbers from 0 to 15 in binary (use Java's Integer.toBinaryString() method). Use a method in String from the Groovy JDK to make all the output values have four digits.

for(i in 0..15)
	println String.format("%4s", Integer.toBinaryString(i)).replace(" ","0")