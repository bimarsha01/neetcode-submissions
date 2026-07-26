class Solution {
    public boolean validPalindrome(String string) {
         string = string.toLowerCase().replaceAll("[^a-z0-9]" , "");

        int left = 0;
        int right = string.length()-1;

        while(left<right) {

            if (string.charAt(left) == string.charAt(right)) {
                left++;
                right--;
            }
            else{
                boolean skipLeft = ispalindrome(string , left+1 , right);
                boolean skipRight = ispalindrome(string , left , right-1);

                if(skipLeft || skipRight){
                    
                    return true;
                }
                else{
                   
                    return false;
                }
            }

        }
        return true;
    }

    static boolean ispalindrome(String s , int l , int r){
        while(l < r){
            if(s.charAt(l) != s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

}
