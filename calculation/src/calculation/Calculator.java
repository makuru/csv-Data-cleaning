 package calculation;
  import java.util.*;
   public class Calculator {
	public static void main(String[]args){
	  int choice,a,b;
	   Scanner inpu=new Scanner(System.in); 
	 
	  System.out.print("------------------------------------------------------------\n");
	  System.out.print ("     \twelcome to simple calculator\n");
	  System.out.print("------------------------------------------------------------\n");
	  
	  System.out.print("Enter first integer:");
	  a=inpu.nextInt();
	  System.out.print("Enter second integer:");
	  b=inpu.nextInt();
	  System.out.print("1.substraction of number\n");
	  System.out.print("2.division of number\n");
	  System.out.print("3.multiplication of number\n");
	  System.out.print("4.addition of number\n");
	  System.out.print("5.reminder of number\n");
	  System.out.print("\n");

	  System.out.print("Enter your choice:");
	   choice=inpu.nextInt();

	    while(choice<1 || choice>5)
	    {
	    	System.out.print("You have entered an invalid input! please try again:");
	   choice=inpu.nextInt();
	    }
	    if(choice==1)
	    {
	       checkSubstraction(a,b);
	    }

	    else if(choice==2)
	     {
	       findDivision(a,b);
	     }

	    else if(choice==3)
	     {
	       checkMultiplication(a,b);
	     }

	     else if(choice==4)
	     {
	        findSum(a,b);
	     }

	     else if(choice==5)
	     {
	       findModulus(a,b);
	     }
	
	     }
	
        
 public static void checkSubstraction(int x,int y)
{
  int diff;
  diff=x-y;
  System.out.print("The value is "+ diff);
}

 public static void findDivision(int x,int y)
{
float div;
if(y!=0){
  div=x/y;
  System.out.print("Answer is "+div);
}
else 
	System.out.print("denominator should not be equal to zero");
}

 public static void checkMultiplication(int x,int y)
{
  int multi;
  multi=x*y;
  System.out.print("Total is  "+multi);
}

 public static void findModulus(int x,int y)
{
  int modu;if(y!=0){
	  modu=x%y;
	  System.out.print("The value is "+modu);
	}
	else 
		System.out.print("denominator should not be equal to zero");
  }
 
 public static void findSum(int x,int y)
{
  int sum;
  sum=x+y;
  System.out.print("The value ="+sum);
  }
 
}