//Assignment 1: Personal Information
//Write a program to display your personal details using println. Include your name, age, address, and a short introduction.
package Information;
  public class Personal {
	public static void main(String[] args) {
	
		System.out.println("Name: Manu K Shibu,Age: 28,Address: Erumely po Kottayam,Introduction: Hi Every one my name is Manu and i am here to teach you some assignments using println methods in java.");
			
	}
}

//Assignment 1: Personal Information
//Write a program to display your personal details using println. Include your name, age, address, and a short introduction.
package assigments;
  public class Personal {
	public static void main(String[] args) {
	  System.out.println("Name: Manu K Shibu");
	  System.out.println("Age: 28");
	  System.out.println("Address: Kottayam po Erumley");
	  System.out.println("Introduction:  Hi Every one my name is Manu and i am here to teach you some assignments using println methods in java.");
	}
}

//Assignment 2: Arithmetic Operations
//Write a program that performs and displays the result of addition, subtraction, multiplication, division, and modulo operations between two numbers.
package assigments;
  
public class Personal {
	public static void main(String[] args) {
     int num1=10;
     int num2=20;
     
     System.out.println("Number 1: " + num1);
     System.out.println("Number 2: " + num2);
     
     int addition = num1 + num2;
     System.out.println("Addition: " + addition);
     
     int subtraction = num1-num2;
     System.out.println("Substraction: " + subtraction);

     int division = num1%num2;
     System.out.println("Division: "+ division);
     
     int multliply = num1*num2;
     System.out.println("Multiplication: " + multliply);
     
     
	}
}

//Assignment 3: Greeting Message
//Create a program to print greetings for three different users by storing their names in variables and using println.

package assigments;
 public class Personal {
	 public static void main(String[] args){
		System.out.println("Hello, Alice!");
		System.out.println("Hello, Bob");
		System.out.println("Hello, charlie");
	 }
	 
		 
	 
 }

//Assignment 4: Invoice Generator
//Write a program to generate a simple invoice for a product. Include details like product name, price, quantity, and total cost.
//Example Output:
//Product: Smartphone
//Price: $699.99
//Quantity: 2
//Total Cost: $1399.98

package assigments;
public class Personal{
	public static void main(String[] agrs) {
		System.out.println("Product: Smartphone");
		System.out.println("Price: $699.99");
		System.out.println("Quantity: 2");
		System.out.println("Total Cost: $1399.98");
	}
}

//Assignment 5: Simple Interest Calculator
//Write a program to calculate and display simple interest. Use the formula 
//SI=P×R×T/100
//Principal: $1000 Rate: 5% Time: 2 years Simple Interest: $100

package assigments;
public class Personal{
	public static void main(String[] agrs) {
		int Principle= 1000;
		float Rate = 100/5;
		int Time = 2;
		int Simple_interest = 100;
		System.out.println("Principle: " + Principle);
		System.out.println("Rate: " + Rate);
		System.out.println("Time:" + Time);
		System.out.println("Simple interest: " + Simple_interest);
		
		float SI=Principle*Rate*Time/100;
		System.out.println("SI:" + SI);
	}
}

//Assignment 6: Shapes with Symbols
//Write a program to display simple shapes using symbols and println.
package assigments;
public class Personal{
	public static void main(String[] agrs) {
		//Square
		System.out.println("****");
		System.out.println("*  *");
		System.out.println("*  *");
		System.out.println("*  *");
		System.out.println("*  *");
		System.out.println("****");
       //Rectangle
		System.out.println(" * ");
		System.out.println("***");
		System.out.println("****");
	}
}

//Assignment 7: Rectangle/perimeter/Area
//Write a program to display the above with equations 

package assignments;
public class Assignment{
       public static void main(String[] args){
               int l=10;
               int w=12;
              
       System.out.println("Length: " + l);
       System.out.println("width: " + w);
       
       int area = l*w;
       int perimeter = 2*(l+w);
       System.out.println("Area: " + area);
       System.out.println("Perimeter: " + perimeter);
      }
}

//Assignment 8: Swap Two Numbers
//Write a program to swap two numbers without using a third variable. Use println to show the values before and after swapping.

package assignments;
public class Assignment{
public static void main(String[] agrs){
               
                  int a=10;
                  int b=20;
             System.out.println("Before swapping: ");
            System.out.println("a: " + a);
            System.out.println("b: " + b);
//do calculation for swapping

           a=a+b;
           b=a-b;
           a=a-b;
        System.out.println("After swapping: ");
       System.out.println("a: " + a);
      System.out.println("b: " + b);
  }
}
    
