public class kthMissingNumber {
    public static void main(String[] args) {
        int[] arr = {2,3,4,7,11};
        int k = 5;
        System.out.println("Missing Number at Kth position is: "+missingNumber(arr, k));
    }
    static int missingNumber(int[] a, int k){
        int left = 0;
        int right = a.length-1;
        while(left<=right){
            int mid = left+(right-left)/2;
            int miss = a[mid]-(mid+1);

            if(miss<k){
                left = mid+1;
            } else{
                right = mid-1;
            }
        }
        return left+k;
    }
}
