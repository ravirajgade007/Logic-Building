//Snippet 15:  
public class Main15 { 
    public static void main(String[] args) { 
        int num1 = 10; 
        double num2 = 5.5; 
        int result = num1 + num2; 
        System.out.println(result); 
    } 
} 

/*
   Answer:- incompatible types: possible lossy conversion from double to int
        int result = num1 + num2;
*/

/*
public class Main15 { 
    public static void main(String[] args) { 
        int num1 = 10; 
        double num2 = 5.5; 
        int result = (int)(num1 + num2); 
        System.out.println(result); 
    } 
} 

*/