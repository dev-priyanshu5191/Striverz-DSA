public class buyandSellStock {
    public static void main(String[] args) {
        /*Leetcode 121 
        You are given an array prices where prices[i] is the price of a given stock on the ith day. You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
        Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.*/
        int[] a = {7,1,5,3,6,4};
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i=0;i<a.length;i++){
            if(a[i]<min){
                min = a[i];
            } else {
                max = Math.max(max, a[i]-min);
            }
        }
        System.out.println(max);
    }
}
