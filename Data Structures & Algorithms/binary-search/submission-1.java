public class Solution {
    public int search(int[] arr, int target) {
        int left = 0;
       int right = arr.length - 1;

       int finalAns = searchTarget(arr , left , right , target);

        return finalAns;
    }

    public static  int searchTarget(int[] arr , int left , int right , int target){
        if(left > right){
            return -1;
        }
        int mid = (left + right)/2;
        
        if(target < arr[mid]){
          return  searchTarget(arr, left, mid-1, target);
        }
        else if(target > arr[mid]){
           return searchTarget(arr, mid+1, right, target);
        }
        else {
            return mid;
        }
    }
}