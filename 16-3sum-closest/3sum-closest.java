class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);

        int closest = nums[0] + nums[1] + nums[2];

        for(int i = 0; i < nums.length - 2; i++) {
            for(int j = i + 1; j < nums.length - 1; j++) {

                int need = target - nums[i] - nums[j];

                int l = j + 1;
                int r = nums.length - 1;

                while(l <= r) {
                    int mid = l + (r - l) / 2;

                    int sum = nums[i] + nums[j] + nums[mid];

                    if(Math.abs(sum - target) < Math.abs(closest - target))
                        closest = sum;

                    if(nums[mid] < need)
                        l = mid + 1;
                    else if(nums[mid] > need)
                        r = mid - 1;
                    else
                        return sum;
                }

                // Check nearby positions if they exist
                if(l < nums.length) {
                    int sum = nums[i] + nums[j] + nums[l];
                    if(Math.abs(sum - target) < Math.abs(closest - target))
                        closest = sum;
                }

                if(r > j) {
                    int sum = nums[i] + nums[j] + nums[r];
                    if(Math.abs(sum - target) < Math.abs(closest - target))
                        closest = sum;
                }
            }
        }

        return closest;
    }
}