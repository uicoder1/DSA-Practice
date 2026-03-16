import java.util.*;
public class funtions_with2_parameters {
    
    public static void function_name(){
        System.out.println("HElloWorld");
        System.out.println("HElloWorld");
        
    }

    public static int calculatesum(int num1, int num2){ // parameters r formal parameters
        int sum = num1 + num2;
        return sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number a");
        int a = sc.nextInt();

        System.out.println("Enter number b");
        int b = sc.nextInt();
        int sum = calculatesum(a, b); //arguments or actual parameters
        System.out.println("Sum is :" + sum);

        sc.close();
    }
}
