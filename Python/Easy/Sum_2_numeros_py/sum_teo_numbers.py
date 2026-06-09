class Solution(object):
    def twoSum(self, nums, target):
        map = {}
        for i, num in enumerate(nums):
            complement = target - num
            if complement in map:
                list_result = [map[complement], i]
                return list_result
            else:
                map[num] = i
        return
                    

"""
:type nums: List[int]
:type target: int
:rtype: List[int]
"""
        