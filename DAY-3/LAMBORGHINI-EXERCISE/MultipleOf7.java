//Write a program to print all multiples of 7 between 1 and 100. 

class MultipleOf7
  {
     public static void main(String args[])
      {
           int num = 100;
           
	    for(int i = 1; i<= num; i++)
             {
                 if(i%7 == 0)
                 {
                System.out.println("All Multiples of 7 between 1 to 100 is : " + i); 
	      }
           }
	}
}