class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String str : strs){
            sb.append(str.length() + "#" + str);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
            List<String> newStr = new ArrayList<>();
        int i = 0;
        while( i < str.length()){
            int j = i;
            while(str.charAt(j) != '#'){
                j++;
            }
            int len = Integer.parseInt(str.substring(i,j));

            String strs = str.substring(j+1,j+1+len);

            newStr.add(strs);
            i = j+1+len;
        }
        return newStr;
    }
}
// Character.getNumericValue('5')