# 305. Can Place Flowers
## 📌 Problem Description
You have a long flowerbed in which some of the plots are planted, and some are not. However, flowers cannot be planted in adjacent plots.

Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty, and an integer n, return true if n new flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule and false otherwise.

 

Example 1:

Input: flowerbed = [1,0,0,0,1], n = 1
Output: true
Example 2:

Input: flowerbed = [1,0,0,0,1], n = 2
Output: false
 

Constraints:

1 <= flowerbed.length <= 2 * 104
flowerbed[i] is 0 or 1.
There are no two adjacent flowers in flowerbed.
0 <= n <= flowerbed.length

## 💡 Intuition & Approach
First, i create a count variable, its important cause it will compare with the number n that enters as a parameter. Then we need to traverse the array and verify the edge cases, like the first value and the last value. If is correct the comparison and not exist an adjacent, we increase the counter and change the value in the array position where the process is correct. 

## ⚙️ Complexity Analysis
- **Time Complexity:** $O(n)$ because we traverse the array only a time in a loop.
- **Space Complexity:** $O(1)$ we only work with an static array in place, so the complexity is O(1) cause we not create a new array or list to solve the problem.

## 🛠️ Key Lessons Learned
- Learned how to handle edge cases at the boundaries of the array (`i == 0` and `i == length - 1`).
- Avoided unnecessary memory allocation by modifying the array in-place.