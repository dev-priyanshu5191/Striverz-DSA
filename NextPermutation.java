import java.util.Arrays;

public class NextPermutation {
    public static void main(String[] args) {
        int[] a = {2,4,1,7,5,0};

        nextPermutation(a);
        System.out.println(Arrays.toString(a));
    }

    public static void nextPermutation(int[] a) {
        int n = a.length;
        int index = -1;

        for (int i = n - 2; i >= 0; i--) {
            if (a[i] < a[i + 1]) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            reverse(a, 0, n - 1);
            return;
        }

        for (int j = n - 1; j > index; j--) {
            if (a[j] > a[index]) {
                swap(a, j, index);
                break;
            }
        }

        reverse(a, index + 1, n - 1);
    }

    public static void reverse(int[] a, int start, int end) {
        while (start < end) {
            swap(a, start, end);
            start++;
            end--;
        }
    }

    public static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
