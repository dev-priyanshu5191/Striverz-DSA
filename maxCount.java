// Maximum Count of positive and negative integer
public class maxCount {
    public static void main(String[] args) {
        int[] arr = {-9,-7,-6,-2,-1, 2, 3, 6, 8};
        int low=0, high=arr.length-1;
        int n = arr.length;
        int firstPos = n;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]>0){
                firstPos = mid;
                high=mid-1;
            } 
            else {
                low=mid+1;
            }
        }
        low=0;
        high=n-1;
        int nonNeg=n;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]>=0){
                nonNeg=mid;
                high=mid-1;
            } else{
                low=mid+1;
            }
        }
        int neg=nonNeg;
        int pos=n-firstPos;
        int res = Math.max(neg, pos);
        System.out.println("Max Count is: "+ res);


        // Without binary search
        // int negC=0, posC=0;
        // for(int x:arr){
        //     if(arr[x]>0){      with this method time complexity is O(n); 
        //         negC++;
        //     }else{
        //         posC++;
        //     }
        // }
        // int result = Math.max(negC, posC);
        // System.out.println(result);
    }
}
