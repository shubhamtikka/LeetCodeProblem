package MajorityElement;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        int me = -1, count = 0;

        for (int i : nums) {
            if (count == 0) {
                me = i;
                count++;
            } else if (i == me) {
                count++;
            } else {
                count--;
            }
        }
        return me;
    }

}
