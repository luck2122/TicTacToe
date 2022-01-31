package TicTacToe.jframes;

import TicTacToe.actionlistener.RestartButtonListener;
import TicTacToe.panels.ButtonPanel;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class OpenWindow extends JFrame{
    public static String SPIELER_EINS_TEXT = "Spieler 1",
                               SPIELER_ZWEI_TEXT = "Spieler 2",
                                ZEICHENX = "X",
                                ZEICEHNO = "O";
    public static final String EXTRA_TEXT = " ist am Zug";

    String zeichen;
    public JLabel label;
    public ButtonPanel buttonPanel;
    public String zeichenSP1,
    nameSP1, zeichenSP2, nameSP2;
    public JCheckBox randomPlayercheckBox,
            botActiveCheckBox;

    public OpenWindow(JTextField zeichenSP1, JTextField nameSP1, JTextField zeichenSP2, JTextField nameSP2, JCheckBox randomPlayercheckBox, JCheckBox botActiveCheckBox){
        this.zeichenSP1 = zeichenSP1.getText();
        this.nameSP1 = nameSP1.getText();
        this.zeichenSP2 = zeichenSP2.getText();
        this.nameSP2 = nameSP2.getText();
        this.randomPlayercheckBox = randomPlayercheckBox;
        this.botActiveCheckBox = botActiveCheckBox;
        setPlayerTexts();


        drawWindow();
        chooseRandomPlayer();
    }

    private void drawWindow(){


        RestartButtonListener restartButtonListener = new RestartButtonListener(this);
        this.setTitle("Tac-Tac-Toe");
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        label = new JLabel(SPIELER_EINS_TEXT + " " + EXTRA_TEXT, SwingConstants.CENTER);

        label.setSize(new Dimension(200,200));
        this.add(label, BorderLayout.PAGE_START);
        buttonPanel = new ButtonPanel(label, this);
        this.add(buttonPanel, BorderLayout.CENTER);
        JButton restartButton = new JButton("Game Restart");
        restartButton.addActionListener(restartButtonListener);
        this.add(restartButton, BorderLayout.PAGE_END);
        this.setPreferredSize(new Dimension(400,400));
        this.setLocationRelativeTo(null);
        this.pack();
    }

    private void setPlayerTexts(){
        if(zeichenSP2.equalsIgnoreCase(""))
            zeichenSP2 = ZEICEHNO;
        if(zeichenSP1.equalsIgnoreCase(""))
            zeichenSP1 = ZEICHENX;
        if(zeichenSP1.equalsIgnoreCase(zeichenSP2) || zeichenSP2.equalsIgnoreCase(zeichenSP1)){
            zeichenSP1 = ZEICHENX;
            zeichenSP2 = ZEICEHNO;
        }

        if(!(zeichenSP1.equalsIgnoreCase(ZEICHENX))){
            ZEICHENX = zeichenSP1;
            zeichen = ZEICHENX;
        }else{
            zeichen = zeichenSP1;
        }

        if(!(nameSP1.equalsIgnoreCase(SPIELER_EINS_TEXT)))
            SPIELER_EINS_TEXT = nameSP1;
        if(!(zeichenSP2.equalsIgnoreCase(ZEICEHNO)))
            ZEICEHNO = zeichenSP2;
        if(!(nameSP2.equalsIgnoreCase(SPIELER_ZWEI_TEXT)))
            SPIELER_ZWEI_TEXT = nameSP2;
    }

    private void chooseRandomPlayer(){
        if(randomPlayercheckBox.isSelected()){
            Random random = new Random();
            if(random.nextDouble() < 0.5){
                setZeichen(ZEICEHNO);
                label.setText(SPIELER_ZWEI_TEXT + EXTRA_TEXT);
            }else{
                setZeichen(ZEICHENX);
                label.setText(SPIELER_EINS_TEXT + EXTRA_TEXT);
            }

        }

    }

    public void setZeichen(String zeichen){
        this.zeichen = zeichen;
    }

    public String getZeichen(){
        return zeichen;
    }
}
