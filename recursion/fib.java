public class fib{
     public static void main(String[] args) {
        int n = 5;
        System.out.println(fibb(5));
    }
    public static int fibb(int n){
        if(n<=1){
            return n;
        }
       int nth_term = fibb(n-1)+fibb(n-2);
       return nth_term;
    }
}