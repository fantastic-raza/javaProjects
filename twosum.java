class Solution {

    public static void twoSum(int[] nums, int target) {
        int i;
        int j;
        for (j = 0; j < nums.length; j++) {
            for (i = 0; i < nums.length; i++) {
                if (nums[j] + nums[i] == target) {
                    System.out.print(nums[i]);
                    System.out.println(nums[j]);
                }
            }
        }
    }

    public static void main(String[] args) {
        int nums[] = {2, 4, 5, 6, 7, 9};
        int target = 11;
        twoSum(nums, target);
    }
}

