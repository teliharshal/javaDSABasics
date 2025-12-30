import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {3,2,5,4,8,6};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void selectionSort(int[] arr) {
        for(int i=0;i<arr.length-1;i++){
            int small_idx = i;
            for(int j=i+1;j< arr.length;j++){
                if(arr[j]<arr[small_idx]){
                    small_idx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[small_idx];
            arr[small_idx] = temp;
        }
    }
}
