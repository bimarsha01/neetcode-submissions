class Solution {
    public void rotate(int[] arr, int k) {
         int length = arr.length;
        while(k > 0){
            int temp = arr[length-1] ;
            for(int j = length-1; j > 0 ; j--){

                arr[j] = arr[j-1];

            }
            arr[0] = temp;
            k--;
        }
        for(int i = 0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}