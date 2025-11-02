class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] pos = new int[n / 2];
        int[] neg = new int[n / 2];
        int p = 0, ne = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] > 0)
                pos[p++] = nums[i];
            else
                neg[ne++] = nums[i];
        }

        int[] ans = new int[n];
        int index = 0;
        for (int i = 0; i < n / 2; i++) {
            ans[index++] = pos[i];
            ans[index++] = neg[i];
        }
        return ans;
    }
}
