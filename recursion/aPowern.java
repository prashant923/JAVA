public class aPowern {
    public static void main(String[] args) {
        int a = 2;
        int n = 4;
        System.out.println(power(a, n));
    }
    public static int power(int a,int n){
        if(n==0){
            return 1;
        }
         return a*power(a, n-1);
        
    }
}
