class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        Integer ans = null;
        for(int i = 0; i < nums.length-2; i++)
        {
            int l = i + 1;
            int r = nums.length -1;

            while(l < r)
            {
                int sum = nums[i] + nums[l] + nums[r];
                if(sum < target)
                {
                    l++;
                }else if(sum > target)
                {
                    r--;
                }else
                {
                    return sum;
                }
                if(ans == null)
                {
                    ans = sum;
                }else
                {
                    int distance = Math.abs(target - sum);
                    ans = distance < Math.abs(target - ans)? sum : ans;
                }
            }
        }
        return ans;
    }
}