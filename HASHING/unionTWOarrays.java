import java.util.*;
public class unionTWOarrays{
    public static void main(String[] args) {
        int[] num1 = {7,3,9};
        int[] num2 = {6,3,9,2,9,4};
        int result[]= union(num1, num2);
        for(int num: result){
            System.out.print(num+" ");
        }
    }
    public static int[] union(int[]num1, int[] num2){
        HashSet<Integer> set = new HashSet<>();
        for (int num : num1) {
            set.add(num);
        }
        for (int num : num2) {
            set.add(num);
        }
        int[] arr = new int[set.size()];
        int i = 0;
        for (int num : set) {
            arr[i++] = num;
        }
        return arr;
    }
}