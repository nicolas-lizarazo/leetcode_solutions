class Solution(object):
    def findLucky(self, arr):
        count = 0
        dic = {}
        for num in arr:
            if (num in dic):
                dic[num] = dic[num] + 1 
            else:
                dic[num] = 1
        max = 0
        for key in dic:
            if key == dic[key]:
                max = key
        return max if max != 0 else -1

        """
        :type arr: List[int]
        :rtype: int
        """