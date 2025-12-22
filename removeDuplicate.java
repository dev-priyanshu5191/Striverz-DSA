import java.util.ArrayList;
import java.util.Arrays;

public class removeDuplicate {
    public static void main(String[] args) {
        int[] a = {2,2,3,3,4,5,5,6,6};
        ArrayList<Integer> result = new ArrayList<>();
        for(int j=0;j<a.length;j++){
            if(!result.contains(a[j])){
                result.add(a[j]);
            }
        }
        System.out.println(Arrays.toString(result.toArray()));
    }
}
