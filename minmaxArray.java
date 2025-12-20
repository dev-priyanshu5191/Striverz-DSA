public class minmaxArray {
    public static void main(String[] args) {
        int arr[] = {8,7,1,2,5,9};
        int[] result = minmaxarr(arr);
        for(int i:result){
            System.out.println(i);
        }
    }
    static int[] minmaxarr(int[] arr){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return new int[] {min, max};
    }
}
