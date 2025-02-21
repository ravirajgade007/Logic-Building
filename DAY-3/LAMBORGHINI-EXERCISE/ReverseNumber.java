 //Write a program to reverse the digits of the number 1234. The output should be 4321.

class ReverseNumber
 {
   public static void main(String args[])
    {
        int num = 1234;
        int reverseNo = 0;

        System.out.println("Before Reverse Number:" + num);

       while(num != 0)
        {
	   int result = num % 10;
           reverseNo = reverseNo * 10 + result;
           num = num /10;	 
	 }
          
          System.out.println("After Reverse Number:" + reverseNo);
        
    }
}