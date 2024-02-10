import java.util.Arrays;

class Count{
    public static void countSort(int []arr){
        if(arr==null || arr.length<=1){
            return;
        }
        int max= arr[0];
        for(int num : arr){
            if(max<num){
                max=num;
            }
        }
        int[] countArray = new int[max+1];

         for(int num : arr){
            countArray[num]++;
         }
         int index=0; 
         for(int i=0; i<=max; i++){
            while(countArray[i]>0){
                arr[index]=i;
                index++;
                countArray[i]--;

            }
         }

    }
    public static void main(String[] args) {
        int arr[]= {6,3,6,4,8,9,2,53,7,4};
        countSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}