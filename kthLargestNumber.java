public class kthLargestNumber {
    public static void main(String[] args) {
        int[] arr = {3,2,1,5,6,4};
        int k = 2;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int num : arr){
            if(num<min) min = num;
            if(num>max) max = num;
        }
        int[] freq = new int[max-min+1];
        
        for(int num:arr){
            freq[num-min]++;
        }
        int result = -1;
        for(int i=freq.length-1;i>=0;i--){
            k-=freq[i];
            if(k<=0){
                result=i+min;
                break;
            }
        }
        System.out.println(result);
    }
}
