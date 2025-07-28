public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> myMap = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            myMap.put(nums[i], i);
        }
        
        for (int i = 0; i < nums.length; i++) {
            int newTarget = target - nums[i];
            if (myMap.containsKey(newTarget) && myMap.get(newTarget) != i) {
                return new int[] {i, myMap.get(newTarget)};
            }
        }
        
        return new int[] {};
    }
}