package com.test.demo

/*1.	Encode and decode
i.	Create two strings, one for a username and one for a password. Concatenate them together, separated by a colon. Use a method from the Groovy JDK to convert the resulting String to a byte array. Then use the encodeBase64 method on byte array to create an encoded string.
ii.	Decode the string by using the decodeBase64 method, and using the result as an argument to the String constructor. Use the split method to return the original username and password.
*/



String uname="vaishnavi"
String pwd="12345"
String str = uname.concat(':').concat(pwd)
println str
byte[] b = str.getBytes()
println Arrays.toString(b)
String encode
encode = b.encodeBase64()
println encode

byte[] decode = encode.decodeBase64()
println new String(decode)





prinln"========================================================"



//2.	Sorting a list
//Create a class called Course, with a String attribute called name and an int attribute called days. Create a list of four course instances, where at least two have the same number of days. Sort the list by number of days. Then, sort the list by days, but when the days are equal, sort by name.

class Course{
	public String name
	public int days
	
}

class SortingList{
	static void main(args)
	{
		Course a = new Course()
		Course b = new Course()
		Course c = new Course()
		Course d = new Course()
		a.days = 10
		b.days = 5
		c.days = 7
		d.days = 10
		
		a.name = "Python"
		b.name = "Java"
		c.name = "C"
		d.name = "Groovy"
		def List =[a,b,c,d]
		def len = List.size()
		def temp
		
		for(int i=0;i<=len;i++)
		{
			if(List[i].days > List[i+1].days)
			{
				temp=List[i].days
				List[i].days=List[i+1].days
				List[i+1].days=temp
			}
			else if(List[i].days == List[i+1].days)
			{
				if(List[i].name > List[i+1].name)
				{
					temp= List[i].name
					List[i].name=List[i+1].name
					List[i+1].name=temp
				}
				else {
					temp= List[i+1].name
					List[i+1].name=List[i].name
					List[i].name=temp
				}
				break
			}
		}
		for(int j=0;j<=len;j++)
		{
			println List[j].days
			println List[j].name
		}
		
	}
}





/*3.	Operator overloading
i.	Create a class called Money with a double amount and a String currency (like USD or EUR). Implement a plus method that checks that the currencies are the same and, if so, returns a new Money instance with the sum of the amounts and the correct currency. Write a similar minus method.
ii.	Write a MoneyTest class in Groovy that uses + and - and verifies that they work properly.
*/


package com.test.demo

class Money
{
	double ammount = 50
	String currency = 'USD'
	Money(String currency, double ammount)
	{
		this.ammount = ammount
		this.currency = currency
		
	}
	def plus(Money m1)
	{
		return new Money(this.currency + ","+m1.currency,this.ammount+m1.ammount)
	}
	def minus(Money m2)
	{
		return new Money(this.currency + ","+m2.currency,this.ammount-m2.ammount)
	}
	 public static void main(args)
	 {
		 Money m3 = new Money("USD",60)
		 
		 Money m4 = new Money("USD",70)
		 
		 Money m5 = m3+m4
		 println m5.ammount
		 println m5.currency
		 
	 }
}


