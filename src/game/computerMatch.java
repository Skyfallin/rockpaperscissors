package game;

import javax.swing.*;
import java.util.Random;

public class computerMatch {

    public static void matchAgainstComputer() {

        String userChoice;
        int convertedUserChoice;
        int computerChoice;

        userChoice = JOptionPane.showInputDialog("Please select either rock (1), paper (2), or scissors (3).");
        convertedUserChoice = Integer.parseInt(userChoice);

        Random number = new Random();

        // bound that stuff
        computerChoice = 1 + number.nextInt(3);


        switch (convertedUserChoice) {

            case 1:
                switch (computerChoice) {
                    case 1:
                        JOptionPane.showMessageDialog(null, "You and the computer both chose rock. The game resulted in a tie.");
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, "The computer chose paper. You lost!");
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null, "The computer chose scissors. You won!");
                        break;
                }
                break;
            case 2:
                switch (computerChoice) {
                    case 1:
                        JOptionPane.showMessageDialog(null, "The computer chose rock. You won!");
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, "Both chose paper. It's a tie!");
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null, "The computer chose scissors. You lost!");
                        break;
                }
            case 3:
                switch (computerChoice) {
                    case 1:
                        JOptionPane.showMessageDialog(null, "Computer chose rock. You lost!");
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, "Computer chose paper. You won!");
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null, "Computer chose scissors. It's a tie!");
                        break;
                }
                break;
        }
    }
}
