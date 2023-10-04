package SortArrayByParity;

public class SortArrayByParity {

    public int[] sortArrayByParity(int[] nums) {
        int evenIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                if (i > evenIndex) {
                    int temp = nums[evenIndex];
                    nums[evenIndex] = nums[i];
                    nums[i] = temp;
                }
                evenIndex++;
            }
        }

        return nums;
    }

}
