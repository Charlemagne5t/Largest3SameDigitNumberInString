public class Solution {
    public String largestGoodInteger(String num) {
        char curMax = 47;
        for(int i = 0; i < num.length() - 2; i++){
            if(num.charAt(i) <= curMax){
                continue;
            }
            if(num.charAt(i) == num.charAt(i + 1)  && num.charAt(i) == num.charAt(i + 2)){
                curMax = num.charAt(i);
                if(curMax == 57){
                    return "999";
                }
            }
        }
        return curMax == 47 ? "" : "" + (char)curMax + (char)curMax + (char)curMax;
    }
}
