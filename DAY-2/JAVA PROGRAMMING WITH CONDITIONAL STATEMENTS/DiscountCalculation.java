public class DiscountCalculation
     {
       public static void main(String args[]){
              
              double purchaseAmount =1000;

              /* System.out.print("Do you have a membership card? Yes/No: ");
              */ String membership = "Yes";

              double discount = 0;
 
              if(purchaseAmount >= 1000){
                  discount = 20;
              }
              else if(purchaseAmount >= 500){
                  discount = 10;
              }
              else{
                  discount = 5;
              }
  
             /* if(membership.equals("yes")){
                  discount = discount + 5;
              }
 */
              double discountAmount = (discount / 100) * purchaseAmount;
              double finalAmount = purchaseAmount - discountAmount;

              System.out.println("Applicable Discount: " + discount + "%");
              System.out.println("Discount Amount: Rs. " + discountAmount);
              System.out.println("Final Amount to Pay: Rs. " + finalAmount);
       }
}