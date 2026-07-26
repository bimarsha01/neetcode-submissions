class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
           int left = 0;
        int right = arr.length-1;
        int windowSize = arr.length;
        List<Integer> list = new ArrayList<>();
        while(windowSize > k){
            int a = Math.abs(arr[left] - x);
            int b = Math.abs(arr[right] - x);
            if(a < b){
                right--;
            }
            else if(a > b){
                left++;
            }
            else if(a==b){
                if(arr[left] < arr[right]){
                    right--;
                }
                else{
                    left++;
                }
            }
            windowSize--;
        }

        for (int i = left ; i<= right ; i++){
            list.add(arr[i]);
        }
    return list;
    }
}