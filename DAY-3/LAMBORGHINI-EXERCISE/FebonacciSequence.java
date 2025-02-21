//Write a program to print the Fibonacci sequence up to the number 21. 

class FebonacciSequence
 {
   public static void main(String args[])
    {
       int num = 21;
       int num1 = 0,  num2 = 1;
    
      System.out.print("Febonacci Series up to " + num + ": ");
 
      while(num1 <= num)
      {
	 System.out.print(num1+ " ");
         int num3 = num1 + num2;

         num1 = num2;
         num2 = num3;
     }
     
  }
}