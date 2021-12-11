class Solution:
        
    def containsDuplicate(self, nums: List[int]) {
        if nums.len() <= 1:
             return False;

        map = {}

        for num in nums:
            if num in map:
                return True

            map[num] = true

        return False;
