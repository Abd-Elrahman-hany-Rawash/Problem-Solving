class Solution {
    public int removeDuplicates(int[] nums) {
         HashSet<Integer> mySet = new HashSet<>();
        int writeindex=0;
        for(int i=0;i<nums.length;i++){
            if(!mySet.contains(nums[i])){
                mySet.add(nums[i]);
                nums[writeindex++]=nums[i];
            }
                
        }

return mySet.size();
    }
    }
