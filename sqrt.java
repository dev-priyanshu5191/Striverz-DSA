public class sqrt {
    public static void main(String[] args) {
        int n = 29;
        int low=1, high=n;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(mid == n/mid) {
                System.out.println(mid);
                return;
            }
            else if(mid > n/mid){
                 high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        System.out.println(high);
    }
}
