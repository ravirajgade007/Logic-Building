class StarPattern20
{
  public static void main(String args[])
    {
       int n = 5;
      
       for(int i=n; i>=1; i--)
      {
          int product = 1;
 	  for(int j=n; j>=i;j--)
           {
           product = product * j;   
	   if(j>1)
              {
              System.out.print("*");
	   }
            System.out.print(j);
         }
          System.out.println();
	}
  }
}