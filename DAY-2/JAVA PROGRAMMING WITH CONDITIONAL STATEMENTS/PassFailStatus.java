public class PassFailStatus{
       public static void main(String args[])
         {

           int subject1 = 41;
	   int subject2 = 52;  
	   int subject3 = 39;    

           int failcount = 0;

           if(subject1 < 40){
               failcount++;
           }
           if(subject2 < 40){
               failcount++;
           }
           if(subject3 < 40){
               failcount++;
           }
           
           if(failcount == 0){
                System.out.println("Congratulations! You have passes all subjects.");
           }
           else{
                System.out.println("You have failed in " + failcount + " subjects.");

           }
       }
}