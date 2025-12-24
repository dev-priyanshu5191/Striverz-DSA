public class powerOfTwo {
    public static void main(String[] args) {
        // Solve using bitwise Op.
        int n = 18;
        if(n>0 && (n & (n-1)) == 0){
            System.out.println("This number is in Power of Two"); // it check its binary expreseeion
        } else{
            System.out.println("This number is not in Power of Two");
        }
    }
}
