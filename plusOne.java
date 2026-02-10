//import static java.lang.IO.print;

public class plusOne {
    public static void main(String[] args) {
        int[] arr = {5,2,8};
        int n = arr.length;
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] < 9) {
                arr[i]++;
                print(arr);
                return;
            } else {
                arr[i] = 0;
            }
        }
        int[] res = new int[n + 1];
        res[0] = 1;
        print(res);
    }
    static void print(int[] a){
        for(int i:a){
            System.out.print(i+" ");
        }
    }
}
