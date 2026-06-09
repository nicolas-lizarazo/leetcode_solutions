# Mi metodo

class Solution(object):
    def maximumLength(self, nums):
        even, odd, prev, mix = 0, 0, 0, []
        for num in nums:
            prev = num % 2
            if prev == 0:
                even += 1
            elif prev == 1:
                odd += 1
            if not mix:
                mix.append(prev)
            elif mix[-1] != prev:
                mix.append(prev)
        return max(even,odd,len(mix))

# Metodo mas eficiente
class Solution(object):
    def maximumLength(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        odd, even , alt, prev = 0, 0, 1, nums[0] % 2
        if(prev):odd += 1
        else: even += 1
        for num in nums[1:]:
            curr = num % 2
            if(curr):odd += 1
            else: even += 1
            if(curr != prev):alt, prev = alt + 1, curr
        return max(odd, even, alt)
    
    
        """
        3201. Find the Maximum Length of Valid Subsequence I
Solved
Medium
Topics
premium lock icon
Companies
Hint
You are given an integer array nums.
A subsequence sub of nums with length x is called valid if it satisfies:

(sub[0] + sub[1]) % 2 == (sub[1] + sub[2]) % 2 == ... == (sub[x - 2] + sub[x - 1]) % 2.
Return the length of the longest valid subsequence of nums.

A subsequence is an array that can be derived from another array by deleting some or no elements without changing the order of the remaining elements.

 

Example 1:

Input: nums = [1,2,3,4]

Output: 4

Explanation:

The longest valid subsequence is [1, 2, 3, 4].

Example 2:

Input: nums = [1,2,1,1,2,1,2]

Output: 6

Explanation:

The longest valid subsequence is [1, 2, 1, 2, 1, 2].

Example 3:

Input: nums = [1,3]

Output: 2

Explanation:

The longest valid subsequence is [1, 3].

 

Constraints:

2 <= nums.length <= 2 * 105
1 <= nums[i] <= 107

        """