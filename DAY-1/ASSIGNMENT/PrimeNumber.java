class PrimeNumber
 {
    public static void main(String args[])
     {
         int number = 17;
         int count = 0;

     for(int i=1;i<=number;i++)
        {
	   if(number%2==0)
 	    {
		count++;
	      }
	}
       
         if(count==2)
          {
		System.out.println(number + " is Prime No");
	  }
         
           else
          {
		System.out.println(number + " is Not Prime No");
	  }
        
	}
}