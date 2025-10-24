class Solution {
    public void moveZeroes(int[] nums) {
        
        int n =nums.length;
int zerocount=0;

for(int i =0;i<n;i++)
{
    if(nums[i]!=0){
        nums[zerocount]=nums[i];
        zerocount++;
    }
}
for(int i=zerocount;i<n;i++){
    nums[i]=0;
}
    }

}