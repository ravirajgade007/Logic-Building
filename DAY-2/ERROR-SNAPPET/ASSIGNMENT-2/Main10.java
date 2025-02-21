//Snippet 10:  
public class Main10 { 
    public void display() { 
        System.out.println("No parameters"); 
    } 
    public void display(int num) { 
        System.out.println("With parameter: " + num); 
    } 
    public static void main(String[] args) { 
        display(); 
        display(5); 
    } 
} 


/*
   Answer:-  non-static method display() cannot be referenced from a static context
  display();
*/

/*
public class Main10 { 
    public void display() { 
        System.out.println("No parameters"); 
    } 
    public void display(int num) { 
        System.out.println("With parameter: " + num); 
    } 
    public static void main(String[] args) { 
   
        Main10 main = new Main10();
        main.display(); 
        main.display(5); 
    } 
} 

*/