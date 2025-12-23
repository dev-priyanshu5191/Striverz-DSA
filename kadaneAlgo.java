public class kadaneAlgo {
    public static void main(String[] args) {
        int[] arr = {2,3,-8,7,-1,2,3};
        int n = arr.length;
        int maxSum = arr[0];
        int currSum = arr[0];
        for(int i=0;i<n;i++){
            currSum = Math.max(arr[i], currSum+arr[i]);
            maxSum = Math.max(currSum, maxSum);
        }
        System.out.println(maxSum);
    }
}
