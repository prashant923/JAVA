public class arraySortedcheck {
    public static void main(String[] args) {
        int arr[]={1,2,33,4,5,6};
       
        int N = arr.length;
        System.out.println(sortedCheck(0,arr));
    }
    public static boolean sortedCheck(int i, int []arr){
        int N = arr.length;
        if(i==N-1)return true;
        if(arr[i]<=arr[i+1]&& sortedCheck(i+1,arr)) return true;
        else return false;
    }
}
