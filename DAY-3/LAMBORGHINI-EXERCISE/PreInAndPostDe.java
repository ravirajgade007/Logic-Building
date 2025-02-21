 /* Write a Java program to demonstrate the use of both pre-increment and post-decrement 
operators in a single expression 
*/

class PreInAndPostDe
 {
   public static void main(String[] args)
    {
       int num1 = 5;
       int num2 = 2;

       int result = ++num1 + num2--;

       System.out.println("Result: " + result);
       System.out.println("Updated Value of num1: " + num1);
       System.out.println("Updated Value of num2: " + num2);
    }
}