package TicTacToe.jframes;

import javax.swing.*;
import java.awt.*;

public class ErrorFrame extends JFrame {

    public ErrorFrame(){
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label = new JLabel("Etwas ist schief gelaufen");
        this.add(label, BorderLayout.PAGE_START);
        JButton okButton = new JButton("Ok");
        okButton.addActionListener(e ->{
            this.dispose();
        });
        this.add(okButton, BorderLayout.PAGE_END);
        this.setLocationRelativeTo(null);
        this.pack();
    }
}
