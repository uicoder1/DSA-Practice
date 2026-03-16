import java.util.*;
public class factorial {

    public static int factorial(int n){
        int f = 1;
        for(int i = 1; i<=n; i++ ){
            f = f * i;
        }
        return f;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter tha Number for factorial");
        int fact = sc.nextInt();
        int fact1 = factorial(fact);
        System.out.println(fact1);

        sc.close();

    }
}
