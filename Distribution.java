
import java.util.Arrays;

public class Distribution {
    public static void main(String[] args) {
        int[] apple = {1,3,2};
        int[] capacity = {2,4,2,7};
        
        // Distribution of apple in min number of boxes 
        int result = distributeApples(apple, capacity);
        System.out.println(result);
    }
    static int distributeApples(int[] a, int[] c){
        int sum = 0;
        int ans = 0;
        for(int i:a){
            sum+=i;
        }
        Arrays.sort(c);
        for(int i=c.length-1;i>=0 && sum>0; i--){
            sum -= c[i];
            ans++;
        }
        return ans;
    }
}
