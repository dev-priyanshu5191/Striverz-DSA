import java.util.HashSet;

public class subarraywithsum0 {
    public static void main(String[] args) {
        int[] arr1 = {4, 2, -3, 1, 6};
        // int[] arr2 = {4, 2, 0, 1, 6};
        // int[] arr3 = {1, 2, -1};

        System.out.println(subArrayExists(arr1));
        // System.out.println(subArrayExists(arr2)); 
        // System.out.println(subArrayExists(arr3));
    }
    public static boolean subArrayExists(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        int sum = 0;

        for (int num : arr) {
            sum += num;

            if (sum == 0) {
                return true;
            }

            if (set.contains(sum)) {
                return true;
            }

            set.add(sum);
        }

        return false;
    }
}
