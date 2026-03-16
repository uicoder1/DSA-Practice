import java.util.*;
public class callbyvalue {
    
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

        int a = 5;
        int b = 10;


        //swap
        int temp = a;
        a = b;
        b = temp;

        System.out.println("a = " +a);
        System.out.println("b = " +b);

        sc.close();
    }
}


