class Solution {
    public int missingNumber(int[] nums) {
        // Step 1: The maximum value 'n' in the range [0, n] is the length of the array
        int maxVal = nums.length;
        
        // Step 2: Calculate the expected sum of all numbers from 0 to maxVal
        int expectedSum = (maxVal * (maxVal + 1)) / 2;
        
        // Step 3: Calculate the actual sum of the elements present in the array
        int actualSum = 0;
        for (int num : nums) {
            actualSum += num;
        }
        
        // Step 4: The difference is the missing number
        return expectedSum - actualSum;
    }
}
