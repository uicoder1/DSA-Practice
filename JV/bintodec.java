import java.util.*;

public class bintodec {

    public static void bin2dec(int binNum) {
        int pow = 0;
        int decNum = 0;
        int originalBin = binNum; // store original number to display later

        while (binNum > 0) {
            int lastDig = binNum % 10;
            decNum = decNum + (lastDig * (int)Math.pow(2, pow));
            pow++;
            binNum = binNum / 10;
        }

        System.out.println("Decimal of " + originalBin + " = " + decNum);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        int binNum = sc.nextInt();

        bin2dec(binNum);

        sc.close();
    }
}












