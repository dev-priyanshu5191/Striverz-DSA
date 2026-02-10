public class minSizeSubarray{
    public static void main(String[] args) {
        // int[] arr = {2,3,1,2,4,3};
        int[] arr = {1,4,4};
        int target = 4;

        int n = minSubArray(arr, target);
        System.out.println(n);
    } 
    static int minSubArray(int[] arr, int k){
        int j=0;
        int sum = 0;
        int min = Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){
            sum+=arr[i];

            while(sum>=k){
                min = Math.min(min, i-j+1);
                sum -= arr[j];
                j++;
            }
        }
        if(min == Integer.MAX_VALUE) return 0;
        return min;
    }
}