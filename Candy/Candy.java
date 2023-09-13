package Candy;

public class Candy {
    public int candy(int[] ratings) {
        int N = ratings.length;
        int[] candies = new int[N];
        candies[0] = 1;

        for (int i = 1; i < N; i++) {
            if (ratings[i] > ratings[i - 1]) {
                candies[i] = candies[i - 1] + 1;
            } else if (ratings[i] < ratings[i - 1]) {
                candies[i] = 1;
                if (candies[i - 1] == 1) {
                    int j = i;
                    while (j > 0
                            &&
                            ratings[j - 1] > ratings[j]
                            &&
                            candies[j - 1] <= candies[j]) {
                        candies[j - 1] = candies[j - 1] + 1;
                        j--;
                    }
                }
            } else {
                candies[i] = 1;
            }
        }

        int totalCandies = 0;
        for (int candy : candies) {
            totalCandies += candy;
        }
        return totalCandies;

    }

}
