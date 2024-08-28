class Solution {
    public int lengthOfLastWord(String s) {
        if (s.length() == 0) {
            return 0;
        }
        String result = s.trim();
        int count=0;
        for (int i = result.length()-1; i >= 0; i--) {
            char c = result.charAt(i);
            if (c == ' '){
                return count;
            }
            else {
                count++;
            }
        }
        return count;
        
    }
}