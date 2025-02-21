// Write a program to print all even numbers between 1 and 50. 
 
class EvenNo
{
   public static void main(String args[])
    {
       int num = 50;
        int i = 1;
        
         for(;i<= num; i++)
            {
	      if(i%2 == 0)
               {
 		 System.out.print(i + " ");
		}
	      }
     }
}