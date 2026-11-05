class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int tot = 0;
        int currmax = 0 ;
        int currmin = 0 ; 
        int maxi = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length ; i++){
            tot += nums[i];
            currmax = Math.max(nums[i],currmax+nums[i]);
            currmin = Math.min(nums[i],currmin+nums[i]);
            maxi = Math.max(currmax,maxi);
            min = Math.min(currmin,min);
        }
        if(maxi < 0){
            return maxi;
        }
        return Math.max(maxi,tot - min);
    }
}