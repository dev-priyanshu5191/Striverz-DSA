public class secondLargest {
    public static void main(String[] args) {
        int[] a = {1,2,3,5,8,6,9};
        int max = 0;
        int secMax = 0;
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                secMax = max;
                max = a[i];
            } else if(a[i]<max && a[i]>secMax){
                secMax = max;
            }
        }
        System.out.println("Second Largest Element is: "+secMax);
    }
}
