package PascalsTriangleII;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangleII {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> ans = new ArrayList<>();
        ans.add(1);
        long temp = 1;
        for (int i = 1, up = rowIndex; i <= rowIndex; i++, up--) {
            temp = temp * up / i;
            ans.add((int) temp);
        }
        return ans;
    }

}