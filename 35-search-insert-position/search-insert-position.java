class Solution {
    public int searchInsert(int[] nums, int target) {
        int f=0;
        int l=nums.length-1;
            while(f<=l)
            {
                int mid=f+(l-f)/2;
                if(target==nums[mid])
                {
                    return mid;
                }
                else if(target>nums[mid])
                {
                    f=mid+1;
                    // if(target!=nums[f])
                    // return f;
                }
                else{
                    l=mid-1;
                }
             } 
        return f;     
        }   
    }
