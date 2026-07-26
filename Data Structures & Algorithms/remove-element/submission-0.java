class Solution {
    public int removeElement(int[] nums, int val) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int s : nums){
        arrayList.add(s);
        }

        Iterator<Integer> iterator = arrayList.iterator();
        while(iterator.hasNext()){
            if(iterator.next() == val){
                iterator.remove();
            }
        }

        for(int i = 0;i<arrayList.size();i++){
            nums[i] = arrayList.get(i);
        }

       return arrayList.size();
    }
}