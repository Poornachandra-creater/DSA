import java.util.*;

class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> l = new ArrayList<>();

        int i = 0;

        while(i < nums.length) {
            int start = i;

            while(i + 1 < nums.length && nums[i + 1] == nums[i] + 1) {
                i++;
            }

            if(start == i) {
                l.add(String.valueOf(nums[i]));
            } else {
                l.add(nums[start] + "->" + nums[i]);
            }

            i++;
        }

        return l;
    }
}