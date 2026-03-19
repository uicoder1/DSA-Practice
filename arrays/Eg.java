public class Eg {

    public static int bSearch(int arr[] , int sElem)
    {
        int left = 0 , right = arr.length-1;

        while(left <= right)
        {
            int mid = left + (right-left)/2; // prevent from interger overflow

            /*
            if(arr[mid] == sElem)
             */

            if(sElem < arr[mid])
                right = mid-1;

            else if(sElem > arr[mid])
                left = mid+1;

            else
                return mid;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        System.out.println( bSearch(arr , 6));


    }
    
}
