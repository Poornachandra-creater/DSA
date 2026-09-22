class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);

        List<Integer> l = new ArrayList<>();

        for(int i = 0; i < nums.length - 1; i++) {

            int current = nums[i];
            int next = nums[i + 1];

            for(int x = current + 1; x < next; x++) {
                l.add(x);
            }
        }

        return l;
    }
}