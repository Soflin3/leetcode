class Solution {
    public void nextPermutation(int[] nums) {
        //prefix
        int index = -1;
        int n = nums.length;
        for(int i = n-2 ; i >= 0 ; i--){
            if(nums[i]< nums[i+1]){
                index = i;
                break;
            }
        }
        // index == -1
        if(index == -1){
        int left = 0;
        int right = n-1;
        while(left <= right ){
            int tmp = nums[left];
            nums[left] = nums[right];
            nums[right] = tmp;
            left++;
            right--;
        }
        return;
        }
        //smallest greater than 1
        for(int i = n-1; i > index ; i--){
            if(nums[i] > nums[index]){
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
                break;
            }
        }
        //reverse all the array like sorting
        int lef = index+1;
        int righ = n-1;
        while(lef <= righ){
            int tmp = nums[lef];
            nums[lef] = nums[righ];
            nums[righ] = tmp;
            lef++;
            righ--;
        }
    }
}
