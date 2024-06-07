public class DuplicateNo {
    public static void main(String[] args) {
        int arr[]={3,3,3,3,3};
        int ans=findDuplicate(arr);
        System.out.println(ans);
    }
    public static int findDuplicate(int[] nums) {
        int i=0;
        while(i<nums.length){
            if(nums[i]!=i+1){
                int correct=nums[i]-1;
                if(nums[i]!=nums[correct]){
                    int temp=nums[i];
                    nums[i]=nums[correct];
                    nums[correct]=temp;
                }else{
                    return nums[i];
                }
            }
            else{
                i++;
            }
        }
        return -1;
    }
}
