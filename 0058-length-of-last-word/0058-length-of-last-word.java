class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        s=s.replaceAll("  "," ");
        String []str= s.split(" ");
        return str[str.length-1].length();
        
    }
}