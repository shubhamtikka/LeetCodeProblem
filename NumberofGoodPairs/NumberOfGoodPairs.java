package NumberofGoodPairs;

import java.util.HashMap;
import java.util.Map;

public class NumberOfGoodPairs {
    public int numIdenticalPairs(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int goodPairsCount = 0;

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                goodPairsCount += map.get(nums[i]);
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }
        return goodPairsCount;
    }
}