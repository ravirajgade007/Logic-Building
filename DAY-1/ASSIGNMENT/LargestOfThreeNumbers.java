class LargestOfThreeNumbers
   {
      public static void main(String args[])
       {
          int num1 = 12;
          int num2 = 45;
          int num3 = 22;
       
          if(num1 >= num2 && num1 >= num3)
           {
              System.out.println(num1 + " is largest Number");
        }    
  
          else if(num2 >= num1 && num2 >= num3)
		{
              System.out.println(num2 + " is largest Number");
        }  
          else
              {
                 System.out.println(num3 + " is largest Number");
                }
      }
    }