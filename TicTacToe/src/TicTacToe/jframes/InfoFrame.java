package TicTacToe.jframes;

import javax.swing.*;
import java.awt.*;

public class InfoFrame extends JFrame {

    private String infos;

    public InfoFrame(String infos){
        this.infos = infos;
        drawInfoPanel();
    }

    private void drawInfoPanel(){
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label = new JLabel(infos);
        this.add(label, BorderLayout.CENTER);
        JButton closeButton = new JButton("Schließen");
        closeButton.addActionListener(e ->{
            this.dispose();
        });
        this.add(closeButton, BorderLayout.PAGE_END);
        this.setLocationRelativeTo(null);
        this.pack();
    }
}
