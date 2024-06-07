//https://leetcode.com/problems/missing-number/description/

public class MissingNo {
    public static void main(String[] args) {
        int arr[]={0,1,4,2};
        int ans=missingNo(arr);
        System.out.println(ans);
    }
    public static int missingNo(int nums[]){
        int i=0;
        while(i<nums.length){
            int correct=nums[i];
            if(nums[i] < nums.length && nums[i]!=nums[correct]){
                int temp=nums[i];
                nums[i]=nums[correct];
                nums[correct]=temp;
            }else{
                i++;
            }
        }
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=j){
                return j;
            }
        }
        return nums.length;
    }
}
