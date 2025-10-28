class Solution {
    public int[] twoSum(int[] nums, int target) {

        // Brute-force approach
        int n = nums.length;

       
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }

        return new int[]{}; 


        // Optimal approach using HashMap
         HashMap<Integer,Integer> map =  new HashMap<>();

        for(int i =0:i,nums.length;i++){
            int nedded = traget - nums[i];
            if(map.containsKey(nedded)){
                return new int[]{map.get(nedded),i};
            }
            else{
                map.put(nums[i],i);
            }
            return new int[]{};
        }

    }


}
