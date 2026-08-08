public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int top = 0;
        int bottom  = matrix.length-1;
        boolean result = false;

        while(top <= bottom) {

            int midRowIndex = top + (bottom - top) / 2;

            int firstColIndex = 0;

            int lastColIndex = matrix[midRowIndex].length - 1;


            int lowerVal = matrix[midRowIndex][firstColIndex];
            int higherVal = matrix[midRowIndex][lastColIndex];

            if(target >= lowerVal && target <= higherVal){

                return findElement(matrix[midRowIndex], target);
            }
            else{
                 if(target < lowerVal){
                     bottom = midRowIndex -1;
                 }
                 else if(target > higherVal){
                     top = midRowIndex + 1;
                 }
            }

        }


        return result;
    }

    public boolean findElement(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (target < arr[mid]) {
                right = mid - 1;
            } else if (target > arr[mid]) {
                left = mid + 1;
            } else if (target == arr[mid]) {
                return true;
            }
        }
        return false;
    }
    }
