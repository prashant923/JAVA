import java.util.*;
public class gameoftwoStacks1 {
    public static int twoStacks(int x, int[]a, int[]b){
       return twoStacks(x, a, b, 0, 0)-1;
    }
    public static int twoStacks(int x, int[]a, int[]b , int sum, int count){
        if(sum>x){
            return count;
        }
        if(a.length == 0 || b.length == 0){
            return count;
        }

        int ans1= twoStacks(x, Arrays.copyOfRange(a, 1, a.length), b, sum+a[0], count+1);
        int ans2 = twoStacks(x, a,Arrays.copyOfRange(b, 1, b.length), sum+b[0], count+1);
        return Math.max(ans1, ans2);
    }
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int b[]={6,7,8,9};
        int result = twoStacks(10, a, b);
        System.out.println("The max number of move will be: "+ result);

    }
}
