public class missingNumber {
    public static void main(String[] args) {
        int[] arr = {9,6,4,2,3,5,7,0,1};
        int n = arr.length;
        int sum = n*(n+1)/2;
        int sum2 = 0;
        for(int i=0;i<n;i++){
            sum2 += arr[i];
        }
        int diff = sum-sum2;
        System.out.println("Missing Number is: "+diff);
    }
}
