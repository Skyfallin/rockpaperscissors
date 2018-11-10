package ratings;

public class RatingCalculator {

    // constructor
    RatingCalculator() {
    }

    // calculator
    int calculate2PlayersRating(int player1Rating, int player2Rating, String outcome, int K) {

        double actualScore;

        switch (outcome) {
            // win
            case "+":
                actualScore = 1.0;
                break;
            // loss
            case "-":
                actualScore = 0;
                break;
            default:
                return player1Rating;
        }

        // calculate expected outcome
        double exponent = (double) (player2Rating - player1Rating) / 400;
        double expectedOutcome = (1 / (1 + (Math.pow(10, exponent))));

        // calculate new rating
        int newRating = (int) Math.round(player1Rating + K * (actualScore - expectedOutcome));

        return newRating;
    }

    // Determine the rating constant K-factor based on current rating
    int determineK(int rating) {
        int K;
        if (rating < 2000) {
            K = 40;//32
        } else if (rating >= 2000 && rating < 2400) {
            K = 32;//24
        } else {
            K = 24;//16
        }
        return K;
    }
}