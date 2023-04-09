/** Given an array "nums". We define a running sum of an array as runningSum[i] = sum(nums[0]...nums[i]).
    Return the running sum of nums.
 */
public class RunningSum1D {
    public static void main(String[] args) {

        // Initialise 1D nums array
        int[] nums = {1,2,3,4,5,6,7,8,9,10};
        int[] runningSum = new int[nums.length];
        int sum = 0;

        // Iterate over array, keep a running sum
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            runningSum[i] = sum;
        }

        for (int i = 0; i < runningSum.length; i++) {
            System.out.printf("%s, ", runningSum[i]);
        }
    }

}
