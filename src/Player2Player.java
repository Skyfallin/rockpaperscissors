import javax.swing.*;

public class Player2Player {

    public static void matchAgainstPlayer() {

        //creating our variables

        String user1Choice;
        String user2Choice;

        int convertedUser1Choice = 0;
        int convertedUser2Choice = 0;

        int user1TempScore = 0;
        int user2TempScore = 0;

        int user1Overall = 0;
        int user2Overall = 0;

        int numOfRounds = 3; //this is a set number for player-to-player rounds

        //play the match until either player gets 2 wins

        int i;

        for (i = 0; i < numOfRounds; i++) {

            while (user1TempScore < 2 && user2TempScore < 2) {

                // display menu screen for user 1
                user1Choice = JOptionPane.showInputDialog("Player 1, please select either rock (1), paper (2), or scissors (3).");
                convertedUser1Choice = Integer.parseInt(user1Choice);

                // display menu screen for user 2
                user2Choice = JOptionPane.showInputDialog("Player 2, please select either rock (1), paper (2), or scissors (3).");
                convertedUser2Choice = Integer.parseInt(user2Choice);

                switch (convertedUser1Choice) {
                    case 1:
                        switch (convertedUser2Choice) {
                            case 1:
                                JOptionPane.showMessageDialog(null, "Player 1 and Player 2 both chose rock. It's a tie!");
                                break;
                            case 2:
                                user2TempScore += 1;
                                JOptionPane.showMessageDialog(null, "Player 2 chose paper and Player 1 chose rock. Player 2 won!"
                                        + "\nPlayer 1's score is " + user1TempScore + "/2"
                                        + "\nPlayer 2's score is " + user2TempScore + "/2");
                                break;
                            case 3:
                                user1TempScore += 1;
                                JOptionPane.showMessageDialog(null, "Player 2 chose scissors and Player 1 chose rock. Player 1 won!"
                                        + "\nPlayer 1's score is " + user1TempScore + "/2"
                                        + "\nPlayer 2's score is " + user2TempScore + "/2");
                                break;
                        }
                        break;
                    case 2:
                        switch (convertedUser2Choice) {
                            case 1:
                                user1TempScore += 1;
                                JOptionPane.showMessageDialog(null, "Player 2 chose rock and Player 1 chose paper. Player 1 won!"
                                        + "\nPlayer 1's score is " + user1TempScore + "/2"
                                        + "\nPlayer 2's score is " + user2TempScore + "/2");
                                break;
                            case 2:
                                JOptionPane.showMessageDialog(null, "Player 1 and Player 2 both chose paper. It's a tie!");
                                break;
                            case 3:
                                user2TempScore += 1;
                                JOptionPane.showMessageDialog(null, "Player 2 chose scissors and Player 1 chose paper. Player 1 lost!"
                                        + "\nPlayer 1's score is " + user1TempScore + "/2"
                                        + "\nPlayer 2's score is " + user2TempScore + "/2");
                                break;
                        }
                        break;
                    case 3:
                        switch (convertedUser2Choice) {
                            case 1:
                                user2TempScore += 1;
                                JOptionPane.showMessageDialog(null, "Player 2 chose rock and Player 1 chose scissors. Player 1 lost!"
                                        + "\nPlayer 1's score is " + user1TempScore + "/2"
                                        + "\nPlayer 2's score is " + user2TempScore + "/2");
                                break;
                            case 2:
                                user1TempScore += 1;
                                JOptionPane.showMessageDialog(null, "Player 2 chose paper and Player 1 chose scissors. Player 1 won!"
                                        + "\nYour score is " + user1TempScore + "/2"
                                        + "\nPlayer 2's score is " + user2TempScore + "/2");
                                break;
                            case 3:
                                JOptionPane.showMessageDialog(null, "Player 1 and Player 2 both chose scissors. It's a tie!");
                                break;
                        }
                        break;
                }
            }
        }

        // determine our winner, store their overall score
        if (user1TempScore == 2) {
            user1Overall++;
        } else {
            user2Overall++;
        }

        // reset per-round scores
        user1TempScore = 0;
        user2TempScore = 0;

        // if user 1 or user 2 wins a majority of the rounds, stop the game
        if (user1Overall > (.5*numOfRounds) || user2Overall > (.5*numOfRounds)) {
            JOptionPane.showMessageDialog(null, "Game over!");
        } else {
            JOptionPane.showMessageDialog(null, "Moving on to the next round."
                    + "\nPlayer 1's overall score is " + user1Overall + "/" + numOfRounds
                    + "\nPlayer 2's overall score is " + user2Overall + "/" + numOfRounds);
        }

        // TODO: display match score after each round
        if (user1Overall > user2Overall) {
            JOptionPane.showMessageDialog(null, "Player 1 beat Player 2! :)");
        } else {
            JOptionPane.showMessageDialog(null, "Player 2 beat Player 1! :)");
        }
    }
}

