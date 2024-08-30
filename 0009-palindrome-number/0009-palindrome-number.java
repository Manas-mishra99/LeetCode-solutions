class Solution {
    public boolean isPalindrome(int x) {
    
        int temp=x, rev=0;
        while(x>0){
            rev=rev*10+x%10;
            x=x/10;
        }
        return (rev==temp);
    }
}