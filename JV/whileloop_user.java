import java.util.*;
public class whileloop_user {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of n you want to print number");
        int n = sc.nextInt();
        
        System.out.println("\n");

        int counter = 1;

        while(counter <= n){
            System.out.println(counter);
            counter++;
        }
         sc.close();
    }
   
    
}
