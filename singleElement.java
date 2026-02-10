public class singleElement {
    public static void main(String[] args) {
        int[] nums = {4,2,5,6,6,5,2,4,3};

        int xor = 0;
        for(int i:nums){
            xor = xor^i;
        }
        System.out.println(xor);
    }
}
