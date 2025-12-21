
import java.util.ArrayList;
import java.util.Arrays;

public class unionOfSortedArray {
    public static void main(String[] args) {
        int[] a = {1,1,2,2,3,4};
        int[] b = {2,2,3,4};
        int i=0, j=0;
        ArrayList<Integer> res = new ArrayList<>();

        while(i<a.length && j<b.length){
            if(i>0 && a[i] == a[i-1]){
                i++;
                continue;
            }
            if(j>0 && b[j] == b[j-1]){
                j++;
                continue;
            }
            if(a[i]<b[j]){
                res.add(a[i]);
                i++;
            }
            else if(a[i]>b[j]){
                res.add(b[j]);
                j++;
            }
            else{
                res.add(a[i]);
                i++;
                j++;
            }
        }
        while(i<a.length){
            if(i==0 || a[i] != a[i-1]){
                res.add(a[i]);
            }
            i++;
        }
        while(j<b.length){
            if(j==0 || b[j] != b[j-1]){
                res.add(b[j]);
            }
            j++;
        }
        System.out.println(Arrays.toString(res.toArray()));
    }
}
