class Solution {
    public void moveZeroes(int[] nums) {

        //logic  
        // 0 1 0 3 12 
        // left - start 
        // right - start 
        // o n 
        // if right is calc elem z or not 
        // if it is non zero swp with lefr, and moveon 
        //if 0 just move on till right end reached 

        int n = nums.length;

        int left = 0; 
        for( int right = 0 ; right < n ; right ++)
        {
            // check for non zero 
            if(nums[right] != 0 )
            {
                //swap 
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;
                // move left
                left++;
            }


        }
        
    }
}