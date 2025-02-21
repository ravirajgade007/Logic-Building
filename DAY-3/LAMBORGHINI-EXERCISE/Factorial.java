//Write a program to compute the factorial of the number 10. 

class Factorial
{
  public static void main(String args[])
    {
       int num = 10;
       int fact = 1;
   
        for(int i = 1; i<=num; i++)
         {
            fact = fact * i;
	  }
 	    System.out.println("Factorial Of the Number 10: " + fact);
    }
}
