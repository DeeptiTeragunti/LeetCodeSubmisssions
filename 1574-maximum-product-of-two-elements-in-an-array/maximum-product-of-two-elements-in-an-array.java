class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
                //last 2 elements 
                int last = nums[nums.length - 1];
                int beforelast = nums[nums.length - 2];
                int product = (last -1) * (beforelast -1);
          
        return product;
    }
}