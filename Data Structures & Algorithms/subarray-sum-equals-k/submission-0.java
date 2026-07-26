class Solution {
    public int subarraySum(int[] nums, int k) {
      int currentSum = 0;
    int count = 0;
    HashMap<Integer , Integer> hashMap = new HashMap<>();
    hashMap.put(0,1);

    for(int i : nums){
        currentSum = currentSum + i;
        if (hashMap.containsKey(currentSum - k)) {
            count += hashMap.get(currentSum - k);
        }
        hashMap.put(currentSum , hashMap.getOrDefault(currentSum , 0)+1);

    }
       return count;
    }
}