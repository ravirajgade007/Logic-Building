class PowerOfNo
{
  public static void main(String args[])
   {
      int baseNo = 3;
      int exponentNo = 4;
      int result = 1;
   
       for(int i = 0; i< exponentNo; i++)
       {
  	 result = result * baseNo;
  	}
	 System.out.println(baseNo + " raised to the power " + exponentNo + " is " + result);
    }
}