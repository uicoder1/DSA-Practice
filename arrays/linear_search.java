import java.util.*;

public class linear_search {
    public static int linearsearch(int num[], int key){
        for(int i = 0; i<num.length; i++){
            if(num[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int num[] = { 2, 4, 6, 8, 10, 12, 14, 16};
        int key = 20;

        int index = linearsearch(num, key);
        if(index == -1){
            System.out.println("Not Found");
        }else{
            System.out.println("Key is at iindex :" +index);
        }
    }
    
}
