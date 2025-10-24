class Solution {
    public int removeDuplicates(int[] nums) {
//       TreeSet<Integer> obj = new TreeSet<>();

//       for(int num:nums){
//         obj.add(num);
//       }
// int index =0;
//       for(int an :obj ){
// nums[index]=an;
// index++;
//       }

//       return obj.size();


int i =0;

for(int j=1;j<nums.length;j++){
    if(nums[j]!=nums[i]){
        nums[i+1]=nums[j];
        i++;
    }
}
return i+1;
    }
}
