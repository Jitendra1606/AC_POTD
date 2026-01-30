class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            }
            set.add(nums[i]);

            if (set.size() > k)// mtlb abbhi tk hame k number tk koi esa elment nhi mila to ab ham window ko
                               // aage bdha rhe h pichla element hta kr
            {
                set.remove(nums[i - k]);
            }
        }
        return false;
    }
}