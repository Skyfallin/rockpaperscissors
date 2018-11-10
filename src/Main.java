import ratings.RatingCalculator;

public class Main {

    public static void main(String[] args) {

        int rating = RatingCalculator.calculateRatings(1500, 1500, "+", 30);

        System.out.println("Player 1's new rating is " + rating);
    }
}
