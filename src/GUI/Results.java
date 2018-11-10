package GUI;

import javax.swing.*;

public class Results extends JFrame {
    private JPanel panel;
    private JLabel userChoice;
    private JLabel cpuChoice;

    public static void main(String[] args)
    {
        Results frame = new Results(1, 1);
    }

    public Results(int user, int cpu)
    {
        switch(user)
        {
            case 1:
                userChoice.setIcon(new ImageIcon("C:\\Users\\braed\\IdeaProjects\\rockpaperscissors\\src\\GUI\\rock.png"));
                break;
            case 2:
                userChoice.setIcon(new ImageIcon());
                break;
            case 3:
                userChoice.setIcon(new ImageIcon());
                break;
        }
        switch(cpu)
        {
            case 1:
                cpuChoice.setIcon(new ImageIcon("C:\\Users\\braed\\IdeaProjects\\rockpaperscissors\\src\\GUI\\rock.png"));
                break;
            case 2:
                cpuChoice.setIcon(new ImageIcon());
                break;
            case 3:
                cpuChoice.setIcon(new ImageIcon());
                break;
        }

        setTitle("Results");
        setVisible(true);
        setSize(1000,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(panel);
        validate();
    }


}
