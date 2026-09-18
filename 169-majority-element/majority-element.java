class Solution {
    public int majorityElement(int[] nums) {
        int ele=0;
        int cnt=0;
        for(int num:nums)
        {
            if(cnt==0)
            {
                ele=num;
            }
            if(num==ele)
            {
                cnt++;
            }
            else
            {
                cnt--;
            }
        }
        return ele;
    }
}