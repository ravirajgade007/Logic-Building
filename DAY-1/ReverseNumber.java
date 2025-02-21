class ReverseNumber
  {
     public static void main(String args[])
      {
          int num = 12345;
	  int reverseNum = 0;
          
	  System.out.println("Original Number:" + num);
           while(num!=0)
             {
                 int last = num%10;
                 reverseNum = reverseNum * 10 + last;
                 num = num / 10; 
                }
		System.out.println("Reverse Number:" + reverseNum);
       }
   }