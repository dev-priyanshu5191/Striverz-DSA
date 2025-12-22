import java.util.*;

public class intersectionOfSortedArray {
    public static void main(String[] args) {
        int[] a = {1,2,2,3,4};
        int[] b = {2,2,3,4};
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> printed = new HashSet<>();

        for(int x:a){
            set.add(x);
        }
        for(int x:b){
            if(set.contains(x) && !printed.contains(x)){
                System.out.print(x+" ");
                printed.add(x);
            }
        }
    }
}
