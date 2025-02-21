//Write a program to calculate the sum of the first 50 natural numbers.

class SumOfNo
  {
    public static void main(String args[])
      {
         int num = 50;
         int sum = 0;
   
         for(int i = 1; i <= num; i++)
          {
	      sum = sum + i;
	  }
         System.out.println("Sum Of the First 50 Natural Numbers is: " + sum);
    }
 }