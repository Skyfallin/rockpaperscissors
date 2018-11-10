package game;

import GUI.Results;

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

        int userOverall = 0;
        int computerOverall = 0;

        int numOfRounds;
        Results frame = new Results();

        // ask user to specify number of rounds
        String inputRounds = JOptionPane.showInputDialog("Please specify a number of rounds. (1-5)");
        numOfRounds = Integer.parseInt(inputRounds);

        // play the match until player or CPU gets 2 wins
        for (int i = 0; i < numOfRounds; i++) {
            while (userTempScore < 2 && computerTempScore < 2) {

                // display menu screen
                userChoice = JOptionPane.showInputDialog("Please select either rock (1), paper (2), or scissors (3).");
                convertedUserChoice = Integer.parseInt(userChoice);

                //sets up new round
                frame.playRound();

                // generate a random value
                Random rand = new Random();

                // bound that stuff, add '1' so it doesn't start at 0.
                computerChoice = 1 + rand.nextInt(3);

                //adds pictures for choices on GUI
                frame.displayUserChoice(convertedUserChoice);
                frame.displayOpponentChoice(computerChoice);
                frame.userChoice.setVisible(true);
                frame.opponentChoice.setVisible(true);

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
            if (userTempScore == 2) {
                userOverall++;
            } else {
                computerOverall++;
            }

            // reset our per-round scores
            userTempScore = 0;
            computerTempScore = 0;

            // if the user or the computer wins a majority of the rounds, stop the game
            if (userOverall > (.5*numOfRounds) || computerOverall > (.5*numOfRounds)) {
                JOptionPane.showMessageDialog(null, "Game over!");
                break;
            } else {
                JOptionPane.showMessageDialog(null, "Moving on to round " + (i + 2)
                        + "!\nYour overall score is " + userOverall + "/" + numOfRounds
                        + "\nThe computer's overall score is " + computerOverall + "/" + numOfRounds);
            }
        }

        // TODO: display match score after each round
        if (userOverall > computerOverall) {
            JOptionPane.showMessageDialog(null, "You beat the computer! :)");
        } else {
            JOptionPane.showMessageDialog(null, "The computer beat you! :(");
        }
    }
}
