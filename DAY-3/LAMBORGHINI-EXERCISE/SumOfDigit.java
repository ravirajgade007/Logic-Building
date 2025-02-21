/*Write a program to calculate the sum of the digits of the number 9876. The output should be 
30 (9 + 8 + 7 + 6) */

class SumOfDigit
{
  public static void main(String args[])
     {
          int num = 9876;
          int sum = 0;
   
          for(int i=1; i<=num; i++)
           {
  	       int result = num%10;
		sum = sum  + result;
		num = num / 10;
        
	   } 
         System.out.println("Addition Of 9876 is :" + sum);
             
	}
 }
