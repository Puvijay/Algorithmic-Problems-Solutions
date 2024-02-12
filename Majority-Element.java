import java.util.Arrays;

class Solution {
    public int majorityElement(int[] nums) {
        // Step 1: Sort the array to bring identical elements together
        Arrays.sort(nums);

        // Initialize variables to keep track of the majority element
        int maxCount = 0;   // Count of the current majority element
        int maxItem = 0;    // The current majority element
        int prevItem = nums[0];  // The first element in the sorted array
        int count = 1;      // Count of the current element

        // Step 2: Traverse the sorted array to find the majority element
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == prevItem) {
                // If the current element is the same as the previous one, increment the count
                count++;
            } else {
                // If a new element is encountered, check if it becomes the new majority element
                if (count > maxCount) {
                    maxCount = count;
                    maxItem = prevItem;
                }
                // Update the previous element and reset the count for the new element
                prevItem = nums[i];
                count = 1;
            }
        }

        // Check for the last element in the array
        if (count > maxCount) {
            maxCount = count;
            maxItem = prevItem;
        }

        // Step 3: Return the majority element
        return maxItem;
    }
}
