class Solution {
    public int jump(int[] nums) {
        int jump=0;
        int stopindex=0;
        int farindex=0;
        for (int i=0;i<nums.length-1;i++) {
        farindex=Math.max(farindex,i+nums[i]);
        if(i==stopindex){
            jump++;
        stopindex=farindex;}
        }
        return jump;
    }
}