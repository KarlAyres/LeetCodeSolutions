
/** Given an array of integers nums, calculate the pivot index of this array.
 The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal to the sum
 of all the numbers strictly to the index's right. If the index is on the left edge of the array, then the left sum
 is 0 because there are no elements to the left. This also applies to the right edge of the array.
 Return the leftmost pivot index. If no such index exists, return -1.
**/
 public class PivotIndex {
     public static void main(String[] args) {

         // Initialise nums array
         int[] nums = {-1,-1,0,0,-1,-1};
         int leftSum, rightSum;
         int pivotIndex = -1;

         // Iterate over array from left and right until leftSum is equal to rightSum
         for (int i = 0; i < nums.length; i++) {

             // Left sum
             leftSum = 0;
             for (int j = 0; j < i; j++) {
                 leftSum += nums[j];
             }

             // Right sum
             rightSum = 0;
             for (int j = i + 1; j < nums.length; j++) {
                 rightSum += nums[j];
             }

             // Compare sums and return pivot index if equal
             if (leftSum == rightSum) {
                 pivotIndex = i;
                 System.out.println("leftSum: " + leftSum + " rightSum: " + rightSum);
                 break;
             }
         }
         System.out.println("Pivot Index: " + pivotIndex);




     }
}
