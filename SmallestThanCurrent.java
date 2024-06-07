import java.util.Arrays;

class SmallestThanCurrent {
    public static void main(String[] args) {
        int[] arr={8,1,2,2,3};
        int ans[]=smallerNumbersThanCurrent(arr);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int arr[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int count=0;
            for(int j=nums.length-1;j<=0;j--){
                if(nums[i]>nums[j]){
                    count++;
                }
                arr[i]=count;
            }
        }
        return arr;
    }
}