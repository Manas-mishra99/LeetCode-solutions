class Solution {
    public int removeDuplicates(int[] nums) {
        int k=1,j=0,i=0;
        if(nums.length==0)
        return 0;
        int n=nums.length;
        while(i<n && j<n-1){
            if(nums[i]==nums[j+1]){
                j++;
            }else{
                ++i;
                ++j;
                nums[i]=nums[j];
                k++;
            }
        }
        return k;
    }
}