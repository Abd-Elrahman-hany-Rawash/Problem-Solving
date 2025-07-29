class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int [] merged=mergee(nums1,nums2);
        double median=0;
        if(merged.length%2==0){
            double a=(double)merged[((merged.length)/2)-1];
            double b = (double)  merged[((merged.length)/2)];
            median=(a+b)/2;

        }else {        median= merged[((merged.length)/2)];
        }

        return median;
    }

    public  int[] mergee(int[] nums1, int[] nums2) {
        int i = 0,j = 0,index=0;
        int []mergedArray=new int [nums1.length+nums2.length];
        while(i<nums1.length&&j<nums2.length){
            if (nums1[i] < nums2[j]) {
                mergedArray[index++]=nums1[i++];
            }else {
                mergedArray[index++]=nums2[j++];

            }
        }
        while (i<nums1.length) mergedArray[index++]=nums1[i++];
        while (j<nums2.length) mergedArray[index++]=nums2[j++];
return mergedArray;
    }

}