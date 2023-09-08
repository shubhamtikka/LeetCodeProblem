package PascalsTriangle;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> list = new ArrayList<Integer>();
            for (int j = 0; j <= i; j++) {
                list.add(getNum(res, i, j));
            }
            res.add(list);
        }
        return res;
    }

    private int getNum(List<List<Integer>> res, int i, int j) {
        if (j == 0
                || j == i) {
            return 1;
        }
        List<Integer> prevList = res.get(i - 1);
        return prevList.get(j) + prevList.get(j - 1);

    }

}
