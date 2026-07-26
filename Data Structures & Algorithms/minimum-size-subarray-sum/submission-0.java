class Solution {
    public int minSubArrayLen(int target, int[] arr) {
         int left = 0;
        int right = 0;
        int sum = 0;
        int minCount = Integer.MAX_VALUE;
        while(right < arr.length) {
            sum = sum + arr[right];
            while(sum >= target){
            minCount = Math.min(minCount , (right-left) + 1);
            sum = sum - arr[left];
            left++;
            }
            right++;
        }

        return minCount == Integer.MAX_VALUE ? 0:minCount;
    }
}