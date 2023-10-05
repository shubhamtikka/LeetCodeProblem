package MajorityElementII;

import java.util.ArrayList;
import java.util.List;

public class MajorityElementII {
    public List<Integer> majorityElement(int[] nums) {
        int count1 = 0, count2 = 0;
        int element1 = 0, element2 = 0;

        for (int i = 0; i < nums.length; i++) {
            if (count1 == 0 && nums[i] != element2) {
                element1 = nums[i];
                count1++;
            } else if (count2 == 0 && nums[i] != element1) {
                element2 = nums[i];
                count2++;
            } else if (nums[i] == element1) {
                count1++;
            } else if (nums[i] == element2) {
                count2++;
            } else {
                count1--;
                count2--;
            }
        }

        count1 = 0;
        count2 = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == element1)
                count1++;
            if (nums[i] == element2)
                count2++;
        }

        int threshold = nums.length / 3;

        List<Integer> majorityElements = new ArrayList<>();
        if (count1 > threshold)
            majorityElements.add(element1);
        if (count2 > threshold && element2 != element1)
            majorityElements.add(element2);

        return majorityElements;
    }
}