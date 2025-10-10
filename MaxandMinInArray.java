public class MaxandMinInArray {

    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,1,8};
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            } else if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Maximum Element Of the Array is "+max);
        System.out.println("Minimum Element of the Array is "+min);
    }
}
