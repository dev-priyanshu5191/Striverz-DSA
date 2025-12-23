import java.util.HashMap;

public class majorityElement {
    public static void main(String[] args) {
        int[] a = {2,2,1,1,1,2,2};
        // Arrays.sort(a);
        // System.out.println("Majority Element is: "+a[a.length/2]);

        HashMap<Integer, Integer> hash = new HashMap<>();
        int res=0;
        int majority=0;

        for(int n:a){
            hash.put(n, 1+hash.getOrDefault(n, 0));
            if(hash.get(n)>majority){
                res=n;
                majority=hash.get(n);
            }
        }
        System.out.println(res);
    }
}
