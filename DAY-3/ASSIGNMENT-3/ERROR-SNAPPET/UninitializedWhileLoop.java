//Snippet 7:  
public class UninitializedWhileLoop { 
    public static void main(String[] args) { 
        int count; 
 
 
        while (count < 10) { 
            System.out.println(count); 
            count++; 
        } 
    } 
} 
/* Error to investigate: Why does this code produce a compilation error? What needs to be done to initialize the loop 
variable properly? 

Answer:- 
        public class UninitializedWhileLoop { 
    public static void main(String[] args) { 
        int count = 1; 
 
 
        while (count < 10) { 
            System.out.println(count); 
            count++; 
        } 
    } 
} 

        
*/