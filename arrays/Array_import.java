import java.util.*;
public class Array_import{
    public static void main(String args[]){
        int mark[] = new int[100];
        Scanner sc = new Scanner(System.in);

        mark[0] = sc.nextInt();
        mark[1] = sc.nextInt();
        mark[2] = sc.nextInt();
        mark[3] = sc.nextInt();
        mark[4] = sc.nextInt();

        System.out.println("Phy = " +mark[0]);
        System.out.println("Chem = " +mark[1]);
        System.out.println("Maths = " +mark[2]);
        System.out.println("English = " +mark[3]);
        System.out.println("Bio = " +mark[4]); //update plus vlue add

        mark[2] = mark[2] + 1;
        System.out.println("Maths = " +mark[2]);

        System.out.println("Lenght of arr " + mark.length);
    }
    
}
