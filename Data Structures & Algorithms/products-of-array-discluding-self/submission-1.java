class Solution {
    public int[] productExceptSelf(int[] nums) {
        ArrayList<Integer> alist = new ArrayList<>();
        int count = 1;
        for (int i = 0; i< nums.length;i++){
        for(int j = 0; j < nums.length; j++){
            if(i != j){
                count = count * nums[j];
            }
        }
        alist.add(count);
        count = 1;
        }

        int k = 0;
        int[] result = new int[nums.length];
        for(int i : alist){
            result[k++] = i;
        }
        return result;
    }
}