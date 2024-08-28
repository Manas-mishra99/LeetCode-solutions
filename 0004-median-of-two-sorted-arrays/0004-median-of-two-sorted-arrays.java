class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length == 0) 
			return (nums2[(nums2.length-1)/2] + nums2[nums2.length/2])/2.0;
		if (nums2.length == 0)
			return (nums1[(nums1.length-1)/2] + nums1[nums1.length/2])/2.0;

        double answer;
        int[] numsCombined = new int[nums1.length + nums2.length];

        int numsOneIndex = 0;
        int numsTwoIndex = 0;
        int numsCombinedIndex = 0;

        while(numsCombinedIndex < numsCombined.length) {
            if (numsOneIndex >= nums1.length) {
                numsCombined[numsCombinedIndex] = nums2[numsTwoIndex];
                numsTwoIndex++;
            } else if (numsTwoIndex >= nums2.length) {
                numsCombined[numsCombinedIndex] = nums1[numsOneIndex];
                numsOneIndex++;
            } else if (nums1[numsOneIndex] < nums2[numsTwoIndex] || nums1[numsOneIndex] == nums2[numsTwoIndex]) {
                numsCombined[numsCombinedIndex] = nums1[numsOneIndex];
                numsOneIndex++;
            } else {
                numsCombined[numsCombinedIndex] = nums2[numsTwoIndex];
                numsTwoIndex++;
            }
            numsCombinedIndex++;
        }

        int middle = numsCombined.length / 2;
        if (numsCombined.length % 2 == 0) {
            answer = ((double) numsCombined[middle] + (double) numsCombined[middle - 1]) / 2;
        } else {
            answer = numsCombined[middle];
        }

        return answer;
    }
}