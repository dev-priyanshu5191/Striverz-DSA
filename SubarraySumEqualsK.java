import java.util.HashMap;
public class SubarraySumEqualsK {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int k = 3;

        System.out.println(subarraySum(nums, k)); 
    }

    public static int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        int currSum = 0;
        int count = 0;

        for (int num : nums) {
            currSum += num;

            if (map.containsKey(currSum - k)) {
                count += map.get(currSum - k);
            }

            map.put(currSum, map.getOrDefault(currSum, 0) + 1);
        }

        return count;
    }
}
