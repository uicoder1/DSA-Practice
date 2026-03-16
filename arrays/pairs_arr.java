import java.util.*;
public class pairs_arr {

    public static void printpairs(int numbers[]){

        int totpairs = 0;
        for(int i=0; i<numbers.length; i++){
            int current = numbers[i];
            for(int j=i+1; j<numbers.length; j++){
                System.out.print("(" + current + "," + numbers[j] + ")");
                totpairs++;
            }
            System.out.println();
        }
        System.out.println("Total pairs " +totpairs );
    }

    public static void main(String args[]){
        int numbers[] = {2, 4, 6, 8, 10};
        printpairs(numbers);
    }
    
}
