import java.util.ArrayList;

public class commonElement3Sorted {
    public static void main(String[] args) {
        int[] a1= {1, 5, 10, 20, 40, 80};
        int[] a2 = {6,7,20,80,100};
        int[] a3 = {3, 4, 15, 20, 30, 70, 80, 120};
        int i=0, j=0, k=0;
        ArrayList<Integer> res = new ArrayList<>();
        while(i<a1.length && j<a2.length && k<a3.length){
            if(a1[i] == a2[j] && a2[j] == a3[k]){
                if(res.isEmpty() || res.get(res.size()-1) != a1[i]){
                    res.add(a1[i]);
                }
                i++;
                j++;
                k++;
            }
            else if(a1[i]<a2[j]){
                i++;
            } else if(a2[j]<a3[k]){
                j++;
            } else{
                k++;
            }
        }
        if(res.isEmpty()){
            res.add(-1);
        }
        for(int x:res){
            System.out.print(x+" ");
        }
    }
}
