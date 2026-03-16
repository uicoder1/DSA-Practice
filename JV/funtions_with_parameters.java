import java.util.*;
public class funtions_with_parameters {
    
    public static void function_name(){
        System.out.println("HElloWorld");
        System.out.println("HElloWorld");
        
    }

    public static int calculatesum(int num1, int num2){
        int sum = num1 + num2;
        System.out.println("Sum is :" + sum);

        return 0;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number a");
        int a = sc.nextInt();

        System.out.println("Enter number b");
        int b = sc.nextInt();
        calculatesum(a, b);

        sc.close();
        
    }
}
