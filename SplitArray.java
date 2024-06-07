//https://leetcode.com/problems/split-array-largest-sum/
public class SplitArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k=2;
        int ans=splitArray(arr,k);
        System.out.println(ans);
    }
    public static int splitArray(int[] nums, int k) {
        int start=0;
        int end=0;
        for(int i=0;i<nums.length;i++){
            start=Math.max(start,nums[i]);
            end+=nums[i];
        }
        while(start!=end){
            int mid=(start+end)/2;
            int sum=0;
            int count=1;
            for(int num:nums){
                if(sum+num>mid){
                    sum=num;
                    count++;
                }else{
                    sum+=num;
                }
            }
            if(count>k){
                start=mid+1;
            }
            else{
                end=mid;
            }
        }
        return end;
    }
}
