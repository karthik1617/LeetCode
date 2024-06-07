//https://leetcode.com/problems/search-in-rotated-sorted-array/description/

public class SearchInRotatedArray {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        int ans=search(arr,0);
        System.out.println(ans);
    }
    public  static int search(int[] nums, int target) {
        int pivot=FindPivot(nums);
        if(pivot==-1){
            return BinarySearch(nums,target,0,nums.length-1);
        }
        else if(target==nums[pivot]){
            return pivot;
        }
        else if(target>=nums[0]){
            return BinarySearch(nums,target,0,pivot-1);
        }
        return BinarySearch(nums,target,pivot+1,nums.length-1);

    }
    public static int FindPivot(int[] nums){
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if( mid<end && nums[mid]>nums[mid+1] ){
                return mid;
            }
            else if(mid>start && nums[mid]<nums[mid-1]){
                return mid-1;
            }
            else if(nums[start]>nums[mid]){
                end=mid-1;
            }else{
                start=mid+1;
            }

        }
        return -1;
    }
    public static int BinarySearch(int[] nums,int target,int start,int end){
        while(start<=end){
            int mid=(start+end)/2;
            if(target==nums[mid]){
                return mid;
            }
            else if(target<nums[mid]){
                end=mid-1;
            }
            else if(target>nums[mid]){
                start=mid+1;
            }
        }
        return -1;
    }
}
