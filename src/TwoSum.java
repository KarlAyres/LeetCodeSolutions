/**Given an array of integers nums and an integer target,
 return indices of the two numbers such that they add up to target.
 You may assume that each input would have exactly one solution,
 and you may not use the same element twice.
 You can return the answer in any order.
 **/

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {3,3};
        int target = 6;

        System.out.println(twoSum(nums, target)[0] + ", " + twoSum(nums, target)[1]);
    }
    public static int[] twoSum(int[] nums, int target) {

        // Initialise index positions for integers summing to target
        int sumIndex0 = 0;
        int sumIndex1 = 0;
        int[] twoSumIndex = {0,0};

        // Iterate over nums in 2D array checking if nums add to target
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] + nums[j] == target && i != j) {

                    // Assign index positions to sumIndex
                    sumIndex0 = i;
                    sumIndex1 = j;
                }
            }
        }

        twoSumIndex[0] = sumIndex0;
        twoSumIndex[1] = sumIndex1;
        return twoSumIndex;
    }
}
