class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0){
                return 0;
            }
        int longest = 1 ;
        Arrays.sort(nums);
        int cur_cnt = 1 ;
         int last = nums[0];
        for(int i = 1 ; i < nums.length ; i++){
            if(nums[i] == last){
                continue;
            }
            else if(nums[i] == last+1){
                cur_cnt+=1;
            }
            else{
                cur_cnt = 1;
            }
            last = nums[i];
            longest = Math.max(longest,cur_cnt);
        }
        return longest;
    }
}