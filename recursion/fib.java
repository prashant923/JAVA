public class fib{
     public static void main(String[] args) {
        int n = 30;
        System.out.println(fibb(n));
    }
    //recursive way
    public static int fibb(int n){
        if(n<=1) return n;
        
       int nth_term = fibb(n-1)+fibb(n-2);
       return nth_term;
    }
    //iterative way
    public int fibbn(int n){
        
    }
}