public class moveNegative {
    public static void main(String[] args) {
        int[] arr = {4,-5,2,-3,6, -1};
        int[] result = move(arr);

        for(int i:result){
            System.out.print(i+" ");
        }
    }
    static int[] move(int[] arr){
        int i=0;
        for(int j=0;j<arr.length;j++){
            if(arr[j]<0){
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                i++;
            }
        }
        return arr;
    }
}
