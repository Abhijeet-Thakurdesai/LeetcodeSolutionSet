package twosum;

import java.util.HashMap;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> complements = new HashMap<>();
        int[] indices = new int[2];
        for (int i=0; i<nums.length; i++) {
            if (complements.containsKey(nums[i])) {
                indices[1] = i;
                System.out.println(complements.get(nums[i]));
                indices[0] = complements.get(nums[i]);
                break;
            }

            int complement = target - nums[i];
            complements.put(complement, i);
        }
        return indices;
    }

    public static void main(String[] args) {

        int[] test = { 2,7,11,15};
        int target = 9;
        new Solution().twoSum(test, target);

    }
}
