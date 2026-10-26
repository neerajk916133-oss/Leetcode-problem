class Solution {
    public int maxSubArray(int[] nums) {
        int mxsum =nums[0];
        int cruntsum =nums[0];
        for(int i =1;i<nums.length;i++){
            cruntsum = Math.max(nums[i],cruntsum+nums[i]);
            mxsum = Math.max(cruntsum,mxsum);
        }
        return mxsum;
    }
}