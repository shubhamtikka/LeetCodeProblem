package MinimumPenaltyforShop;

public class MinimumPenaltyforShop {

    public int bestClosingTime(String customers) {
        int maxScore = 0;
        int score = 0;
        int maxScoreIndex = -1;
        for (int i = 0; i < customers.length(); i++) {
            score += customers.charAt(i) == 'Y' ? 1 : -1;
            if (score > maxScore) {
                maxScore = score;
                maxScoreIndex = i;
            }
        }
        return ++maxScoreIndex;
    }

    public int bestClosingTime_bruteForce(String customers) {

        int minPenaltyhour = 0;
        int minPenalty = Integer.MAX_VALUE;
        boolean isClosed = false;
        int penaltyCounter = 0;

        for (int i = 0; i <= customers.length(); i++) {
            isClosed = false;
            penaltyCounter = 0;
            for (int j = 0; j < customers.length(); j++) {

                if (j == i) {
                    isClosed = true;
                }
                if ((customers.charAt(j) == 'Y' && isClosed) ||
                        (customers.charAt(j) == 'N' && !isClosed)) {
                    penaltyCounter++;
                }
            }
            if (minPenalty > penaltyCounter) {
                minPenalty = penaltyCounter;
                minPenaltyhour = i;
            }
        }
        return minPenaltyhour;

    }

}
