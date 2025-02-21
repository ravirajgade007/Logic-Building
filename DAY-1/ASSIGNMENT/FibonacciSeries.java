class FibonacciSeries
   {
      public static void main(String args[])
       {
          int num = 10;
          int firstNum = 0;
          int secondNum = 1;
   
         
        System.out.println("Fibonacci Series of " + num + " numbers is: ");
        
           for(int i = 1; i<= num; i++)
             {
                System.out.print(firstNum + " ");
                 int thirdTerm = firstNum + secondNum;
  
                  firstNum = secondNum;
 		  secondNum = thirdTerm;
               }
		
         }
}