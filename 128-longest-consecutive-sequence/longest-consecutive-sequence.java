class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int longest = 1;
        if(nums.length == 0){
            return 0;
        }
        for(int num : nums){
            set.add(num);
        }
        for(int i : set){
            if(set.contains(i-1)){
                continue;
            }
            else{
                int curr = 1;
                int curr_ele = i;
                while(set.contains(curr_ele + 1)){
                    curr++;
                    curr_ele++;
                } 
                longest = Math.max(longest,curr);
            }
            }
        return longest;
    }
}