class Solution {
    public boolean hasDuplicate(int[] nums) {
          Set<Integer> set = new HashSet<>();
    
    for(Integer integer : nums){
        set.add(integer);
    }
    
    if(set.size() < nums.length){
        return true;
    }
    else{
        return false;
    }
    }
}