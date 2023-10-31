package FindTheOriginalArrayofPrefixXor;

public class FindTheOriginalArrayofPrefixXor {
    public int[] findArray(int[] pref) {
        int[] output = new int[pref.length];
        if (pref.length == 0)
            return output;
        output[0] = pref[0];
        for (int i = 1; i < pref.length; i++) {
            output[i] = pref[i - 1] ^ pref[i];
        }
        return output;
    }
}