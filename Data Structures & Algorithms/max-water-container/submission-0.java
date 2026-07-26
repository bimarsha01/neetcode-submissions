class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length - 1;

        List<Integer> finalArea = new ArrayList<>();
        int left = 0;
        int right = n;
        int area;
        while(left<right){
            int width = right - left;
            area = width * Math.min(heights[left] , heights[right]);
            finalArea.add(area);
            if(heights[left] < heights[right]){
                left++;
            }
            else {
                right--;
            }
        }


        return Collections.max(finalArea);
    }
}
