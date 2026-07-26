class Solution {
    public void rotate(int[] arr, int k) {
            int length = arr.length;

         k = k % length;

        rotate(arr , 0 , length-1);
        rotate(arr ,  0 , k-1);
        rotate(arr , k , length-1);

        for(int i = 0;i<=length-1;i++){
            System.out.println(arr[i]);
        }

    }
    public static void rotate(int[] arr , int a , int b){
        int length = b;

        while(a<b){
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
            a++;
            b--;
        }
    }
    }