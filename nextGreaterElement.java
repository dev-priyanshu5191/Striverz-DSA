public class nextGreaterElement {
    public static void main(String[] args) {
        int[] arr1 = {4,1,2};
        int[] arr2 = {1,3,4,2};

        int[] res = nextGreater(arr1, arr2);
        for(int i:res){
            System.out.print(i+" ");
        }
    }
    static int[] nextGreater(int[] a1, int[] a2){
        int[] res = new int[a1.length];

        for(int i=0;i<a1.length;i++){
            int ele = -1;
            for(int j=0;j<a2.length;j++){
                if(a1[i] == a2[j]){
                    for(int k=j+1;k<a2.length;k++){
                        if(a2[k]>a2[j]){
                            ele = a2[k];
                            break;
                        }
                    }
                    break;
                }
            }
            res[i] = ele;
        }
        return res;
    }
}
