class Solution {
    public boolean hasDuplicate(int[] nums) {
  HashMap<Integer, Boolean> hashMap = new HashMap<>();

        for(int num : nums){
            if(hashMap.containsKey(num))
                return true;
            else{
                hashMap.put(num , true);
            }
        }
        return false;
    }
}