public class prefix_arr_sum {
    public static void subarry(int nums[]){
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        int prefix[] = new int[nums.length];

        prefix[0] = nums[0]; 
        for(int i=1; i<prefix.length; i++){
            prefix[i] = prefix[i-1] + nums[i];
        }


        for(int i = 0; i<nums.length; i++){
            int start = i;
            for(int j=i; j<nums.length; j++){
                int end = j;
                currsum =0;
                // for(int k=start; k<=end; k++){
                //     System.out.print(nums[k]+" ");

                //     currsum += nums[k];
                }
                System.out.println(currsum);
                if(maxsum < currsum){
                    maxsum = currsum;
                }
                System.out.println();
            }
            System.out.println();

            System.out.println("max sum= " +maxsum);
        }
    
    
    
    public static void main(String args[]){
    int nums[] = {2, 4, 6, 8, 10};

    subarry(nums);

    }
    
}



    

