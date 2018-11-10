package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.TimeUnit;

public class Results extends JFrame {
    private JPanel panel;
    public JLabel userChoice;
    public JLabel opponentChoice;
    private ImageIcon rock = new ImageIcon("rock.jpg");
    private ImageIcon paper = new ImageIcon("paper.jpg");
    private ImageIcon scissors = new ImageIcon("scissors.jpg");
    public boolean userReady;
    public boolean opponentReady;
    public static boolean gameInProgress = false;


    public Results()
    {
        setupImages();
        setTitle("RPC");
        setVisible(true);
        setSize(1200,800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(panel);
        validate();

    }

    public void setupImages()
    {
        Image rockImage1 = rock.getImage();
        Image rockImage2 = rockImage1.getScaledInstance(300, 400,  java.awt.Image.SCALE_SMOOTH);
        rock = new ImageIcon(rockImage2);

        Image paperImage1 = paper.getImage();
        Image paperImage2 = paperImage1.getScaledInstance(300, 400,  java.awt.Image.SCALE_SMOOTH);
        paper = new ImageIcon(paperImage2);

        Image scissorsImage1 = scissors.getImage();
        Image scissorsImage2 = scissorsImage1.getScaledInstance(300, 400,  java.awt.Image.SCALE_SMOOTH);
        scissors = new ImageIcon(scissorsImage2);
    }

    public void displayUserChoice(int convertedUserChoice)
    {
        switch(convertedUserChoice) {
            case 1:
                userChoice.setIcon(rock);
                break;
            case 2:
                userChoice.setIcon(paper);
                break;
            case 3:
                userChoice.setIcon(scissors);
                break;
        }
        userReady = true;

    }
    public void displayOpponentChoice(int convertedOpponentChoice)
    {
        switch(convertedOpponentChoice) {
            case 1:
                opponentChoice.setIcon(rock);
                break;
            case 2:
                opponentChoice.setIcon(paper);
                break;
            case 3:
                opponentChoice.setIcon(scissors);
                break;
        }
        opponentReady = true;
    }

    public void playRound()
    {
        userReady = false;
        opponentReady = false;
        userChoice.setVisible(false);
        opponentChoice.setVisible(false);
    }

}
