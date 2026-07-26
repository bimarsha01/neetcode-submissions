class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer , Integer> hashMap = new HashMap<>();
        for(int i : nums){
               hashMap.put( i  , hashMap.getOrDefault(i,0) + 1);
        }

int maxValue = Integer.MIN_VALUE;
        int maxKey = 0;
        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            if (entry.getValue() > maxValue) {
                maxValue = entry.getValue();
                maxKey = entry.getKey();
            }
        }
        return maxKey;
    }
}