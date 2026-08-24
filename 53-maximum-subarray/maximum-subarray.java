class Solution {
    public int maxSubArray(int[] nums) {
      int cursum=0, maxsum=Integer.MIN_VALUE;
        for(int val:nums)
        {
             //int cursum=nums[0], maxsum=nums[0];
            cursum=Math.max(val,cursum+val);
           // maxsum=maxsum+cursum;
            maxsum=Math.max(cursum,maxsum);
        }
    return maxsum;
    }
}