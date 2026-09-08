public class Solution {
    public boolean search(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;

       while(left <=right){
           int mid = left + (right-left)/2;

           if(nums[left] <= nums[mid]){
               if(nums[left] == nums[mid]){
                   left++;
               }
               else if (target>=nums[left] && target<=nums[mid]){
                   right = mid;
               }
               else{
                   left = mid +1;
               }
           } else if (nums[right] >= nums[mid]) {
               if(nums[right] == nums[mid]){
                   right--;
               }

               else if(target>=nums[left] && target<=nums[right]){
                   left = mid;
               }
               else{
                   right = mid -1;
               }
           }

           if(nums[mid] == target){
               return true;
           }
       }
        return false;
    }
}