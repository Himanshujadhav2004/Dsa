class Solution {
    public int maxSubArray(int[] nums) {

        //brut time complexity O(n^3) space O(1)
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

        //better  time complexity O(n^2) space O(1)
        for(int i=0;i<n;i++){
            sum=0;
            for(int j=i;j<n;j++){
sum+=nums[j];
maximum=Math.max(sum,maximum);
            }
        }
        return maximum;
    }

    //optimal time complexity O(n) space O(1)
            for(int i=0;i<n;i++){
        sum += nums[i];
        if(sum>maximum){
            maximum=sum;
        }
            if(sum<0){
                  sum=0;
            }
        }
        return maximum;
    
}