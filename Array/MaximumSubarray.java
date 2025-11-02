class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int maximum=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                sum=0;
                for(int k=i;k<=j;k++){
                    sum+=nums[k];
maximum=Math.max(sum,maximum);
                }
            }
        }
        return maximum;
    }
}