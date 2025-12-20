public class rotateArray {
    public static void main(String[] args) {
        int[] arr = {1,4,5,6,3,2};
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            temp--;
        }
        for(int i: arr){
            System.out.print(i+" ");
        }
    }
}
