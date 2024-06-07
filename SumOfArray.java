//https://leetcode.com/problems/running-sum-of-1d-array/
import java.util.Arrays;

public class SumOfArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] ans=runningSum(arr);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] runningSum(int[] nums) {
        int[] ans=new int[nums.length];
        int sum=0;
        for(int i=0;i<ans.length;i++){
            sum+=nums[i];
            ans[i]=sum;
        }
        return ans;
    }
}
