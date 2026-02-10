public class sort012 {
    public static void main(String[] args) {
        int[] arr = {2,1,2,1,2,1,0,0,};
        int low=0, mid=0, high=arr.length-1;
        System.out.print("Original Array is: ");
        for(int i: arr){
            System.out.print(i+" ");
        }
        while(mid<=high){
            if(arr[mid] == 0){
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            } else if(arr[mid] == 1){
                mid++;
            }
            else {
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
        System.out.print("\nAfter sorting is: ");
        for(int i: arr){
            System.out.print(i+ " ");
        }
    }
}
