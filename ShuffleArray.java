//https://leetcode.com/problems/shuffle-the-array/
import java.util.Arrays;

public class ShuffleArray {
    public static void main(String[] args) {
        int[] arr ={2,5,1,3,4,7};
        int ans[]=shuffle(arr,3);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] shuffle(int[] nums, int n) {
        int ans[]=new int[2*n];
        for(int i=0;i<n;i++){
            ans[i*2]=nums[i];
            ans[i*2+1]=nums[i+n];
        }
        return ans;
    }
}
