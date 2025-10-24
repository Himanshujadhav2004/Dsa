class Solution {
    public int singleNumber(int[] nums) {
        int n = nums.length;
int xoor=0;
for(int i =0;i<n;i++){
    // in  xoor the code if the same number arrives it is 0 , eg 2^2 =0, means repeating one become zero and the unquie one remains as it is 
    xoor=xoor^nums[i];
}
return xoor;
    }
}