package game;

import javax.swing.*;
import java.util.Random;

public class computerMatch {

    public static void matchAgainstComputer() {

        // create our variables
        String userChoice;
        int convertedUserChoice;
        int computerChoice;
        int userTempScore = 0;
        int computerTempScore = 0;
        int numOfRounds;

        // ask user to specify number of rounds
        String inputRounds = JOptionPane.showInputDialog("Please specify a number of rounds. (1-5)");
        numOfRounds = Integer.parseInt(inputRounds);

        // play the match until player or CPU gets 2 wins
        for (int i = 0; i < numOfRounds; i++) {
            while (userTempScore < 2 && computerTempScore < 2) {

                // display menu screen
                userChoice = JOptionPane.showInputDialog("Please select either rock (1), paper (2), or scissors (3).");
                convertedUserChoice = Integer.parseInt(userChoice);

                // generate a random value
                Random rand = new Random();

                // bound that stuff, add '1' so it doesn't start at 0.
                computerChoice = 1 + rand.nextInt(3);

                switch (convertedUserChoice) {
                    case 1:
                        switch (computerChoice) {
                            case 1:
                                JOptionPane.showMessageDialog(null, "You and the computer both chose rock. It's a tie!");
                                break;
                            case 2:
                                computerTempScore += 1;
                                JOptionPane.showMessageDialog(null, "The computer chose paper. You lost!"
                                        + "\nYour score is " + userTempScore + "/2"
                                        + "\nThe computer's score is " + computerTempScore + "/2");
                                break;
                            case 3:
                                userTempScore += 1;
                                JOptionPane.showMessageDialog(null, "The computer chose scissors. You won!"
                                        + "\nYour score is " + userTempScore + "/2"
                                        + "\nThe computer's score is " + computerTempScore + "/2");
                                break;
                        }
                        break;
                    case 2:
                        switch (computerChoice) {
                            case 1:
                                userTempScore += 1;
                                JOptionPane.showMessageDialog(null, "The computer chose rock. You won!"
                                        + "\nYour score is " + userTempScore + "/2"
                                        + "\nThe computer's score is " + computerTempScore + "/2");
                                break;
                            case 2:
                                JOptionPane.showMessageDialog(null, "You and the computer both chose paper. It's a tie!");
                                break;
                            case 3:
                                computerTempScore += 1;
                                JOptionPane.showMessageDialog(null, "The computer chose scissors. You lost!"
                                        + "\nYour score is " + userTempScore + "/2"
                                        + "\nThe computer's score is " + computerTempScore + "/2");
                                break;
                        }
                        break;
                    case 3:
                        switch (computerChoice) {
                            case 1:
                                computerTempScore += 1;
                                JOptionPane.showMessageDialog(null, "The computer chose rock. You lost!"
                                        + "\nYour score is " + userTempScore + "/2"
                                        + "\nThe computer's score is " + computerTempScore + "/2");
                                break;
                            case 2:
                                userTempScore += 1;
                                JOptionPane.showMessageDialog(null, "The computer chose paper. You won!"
                                        + "\nYour score is " + userTempScore + "/2"
                                        + "\nThe computer's score is " + computerTempScore + "/2");
                                break;
                            case 3:
                                JOptionPane.showMessageDialog(null, "You and the computer both chose scissors. It's a tie!");
                                break;
                        }
                        break;
                }
            }

            // determine our winner, store their overall score


            // reset our scores
            userTempScore = 0;
            computerTempScore = 0;

            if (i == (numOfRounds-1)) {
                JOptionPane.showMessageDialog(null, "Game over!");
            } else {
                JOptionPane.showMessageDialog(null, "Moving on to round " + (i+2) + "!");
            }
        }
    }
}
