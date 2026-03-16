import java.util.*;
public class Inocme_tax_cal {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Salary");

        int income = sc.nextInt();

        int tax;

        if(income < 500000){
            tax = (int)0.0;
            
        }
        else if (income >= 500000 && income < 100000){
            tax = (int)(income *  0.20);

        }
        else {
            tax = (int)(income * 0.30);
        }
        System.out.println("Your tax is: " + tax);
        sc.close();
    }
    
    
}
