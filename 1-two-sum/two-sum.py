class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        seen = {}

        for index,value in enumerate(nums):
            diff = target - nums[index]
            if diff in seen : 
                return [seen[diff],index]
            seen[value] = index
        return []