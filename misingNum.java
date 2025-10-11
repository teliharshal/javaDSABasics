public class misingNum {

    public static void main(String[] args) {
        int[] nums = {1,3,4,5};
        int n = nums.length-1;
        for(int i=0;i<n;i++){
            int diff = nums[i+1] - nums[i];

            while(diff > 1){
                System.out.println("Mising num is " + (nums[i]+1));
                nums[i]++;
                diff--;
            }
        }
    }
}
