package TicTacToe.panels;

import TicTacToe.actionlistener.RestartButtonListener;
import TicTacToe.configuration.Config;
import TicTacToe.jframes.ErrorFrame;
import TicTacToe.jframes.OpenWindow;

import javax.swing.*;
import java.awt.*;
import java.io.FileNotFoundException;
import java.util.Random;

public class ButtonPanel extends JPanel {



    private JButton[][] buttons = new JButton[3][3];
    private OpenWindow window;
    private JLabel label;
    private Random random;
    private Font buttonFont = new Font("Arial", Font.PLAIN, 50);

    public ButtonPanel(JLabel label, OpenWindow window) {
        this.window = window;
        this.label = label;
        random = new Random();
        addButtons();
    }

    private void addButtons() {
        GridLayout gridLayout = new GridLayout(3, 3);
        this.setLayout(gridLayout);
        for (int i = 0; i < gridLayout.getRows(); i++) {
            for (int j = 0; j < gridLayout.getColumns(); j++) {
                JButton button = new JButton("");

                this.buttons[i][j] = button;
                button.addActionListener(e -> {
                    JButton currentButton = (JButton) e.getSource();
                   setButtonListeners(currentButton);
                });
                this.add(button);
            }
        }
    }

    private void checkGameEnding() {
        if (buttons[0][0].getText().equalsIgnoreCase(window.ZEICHENX) && buttons[0][1].getText().equalsIgnoreCase(window.ZEICHENX) && buttons[0][2].getText().equalsIgnoreCase(window.ZEICHENX)) {
            showWinner("Der Sieger ist " + window.nameSP1);
        } else if (buttons[1][0].getText().equalsIgnoreCase(window.ZEICHENX) && buttons[1][1].getText().equalsIgnoreCase(window.ZEICHENX) && buttons[1][2].getText().equalsIgnoreCase(window.ZEICHENX)) {
            showWinner("Der Sieger ist " + window.nameSP1);
        } else if (buttons[2][0].getText().equalsIgnoreCase(window.ZEICHENX) && buttons[2][1].getText().equalsIgnoreCase(window.ZEICHENX) && buttons[2][2].getText().equalsIgnoreCase(window.ZEICHENX)) {
            showWinner("Der Sieger ist " + window.nameSP1);
        } else if (buttons[0][0].getText().equalsIgnoreCase(window.ZEICEHNO) && buttons[0][1].getText().equalsIgnoreCase(window.ZEICEHNO) && buttons[0][2].getText().equalsIgnoreCase(window.ZEICEHNO)) {
            showWinner("Der Sieger ist " + window.nameSP2);
        } else if (buttons[1][0].getText().equalsIgnoreCase(window.ZEICEHNO) && buttons[1][1].getText().equalsIgnoreCase(window.ZEICEHNO) && buttons[1][2].getText().equalsIgnoreCase(window.ZEICEHNO)) {
            showWinner("Der Sieger ist " + window.nameSP2);
        } else if (buttons[2][0].getText().equalsIgnoreCase(window.ZEICEHNO) && buttons[2][1].getText().equalsIgnoreCase(window.ZEICEHNO) && buttons[2][2].getText().equalsIgnoreCase(window.ZEICEHNO)) {
            showWinner("Der Sieger ist " + window.nameSP2);
        } else if (buttons[0][0].getText().equalsIgnoreCase(window.ZEICEHNO) && buttons[1][1].getText().equalsIgnoreCase(window.ZEICEHNO) && buttons[2][2].getText().equalsIgnoreCase(window.ZEICEHNO)) {
            showWinner("Der Sieger ist " + window.nameSP2);
        } else if (buttons[0][2].getText().equalsIgnoreCase(window.ZEICHENX) && buttons[1][1].getText().equalsIgnoreCase(window.ZEICHENX) && buttons[2][0].getText().equalsIgnoreCase(window.ZEICHENX)) {
            showWinner("Der Sieger ist " + window.nameSP1);
        } else if (buttons[0][0].getText().equalsIgnoreCase(window.ZEICHENX) && buttons[1][1].getText().equalsIgnoreCase(window.ZEICHENX) && buttons[2][2].getText().equalsIgnoreCase(window.ZEICHENX)) {
            showWinner("Der Sieger ist " + window.nameSP1);
        } else if (buttons[0][2].getText().equalsIgnoreCase(window.ZEICEHNO) && buttons[1][1].getText().equalsIgnoreCase(window.ZEICEHNO) && buttons[2][0].getText().equalsIgnoreCase(window.ZEICEHNO)) {
            showWinner("Der Sieger ist " + window.nameSP2);
        } else if (buttons[0][2].getText().equalsIgnoreCase(window.ZEICEHNO) && buttons[1][2].getText().equalsIgnoreCase(window.ZEICEHNO) && buttons[2][2].getText().equalsIgnoreCase(window.ZEICEHNO)) {
            showWinner("Der Sieger ist " + window.nameSP2);
        } else if (buttons[0][2].getText().equalsIgnoreCase(window.ZEICHENX) && buttons[1][2].getText().equalsIgnoreCase(window.ZEICHENX) && buttons[2][2].getText().equalsIgnoreCase(window.ZEICHENX)) {
            showWinner("Der Sieger ist " + window.nameSP1);
        } else if (buttons[0][1].getText().equalsIgnoreCase(window.ZEICHENX) && buttons[1][1].getText().equalsIgnoreCase(window.ZEICHENX) && buttons[2][1].getText().equalsIgnoreCase(window.ZEICHENX)) {
            showWinner("Der Sieger ist " + window.nameSP1);
        } else if (buttons[0][0].getText().equalsIgnoreCase(window.ZEICHENX) && buttons[1][0].getText().equalsIgnoreCase(window.ZEICHENX) && buttons[2][0].getText().equalsIgnoreCase(window.ZEICHENX)) {
            showWinner("Der Sieger ist " + window.nameSP1);
        } else if (buttons[0][2].getText().equalsIgnoreCase(window.ZEICEHNO) && buttons[1][2].getText().equalsIgnoreCase(window.ZEICEHNO) && buttons[2][2].getText().equalsIgnoreCase(window.ZEICEHNO)) {
            showWinner("Der Sieger ist " + window.nameSP1);
        } else if (buttons[0][1].getText().equalsIgnoreCase(window.ZEICEHNO) && buttons[1][1].getText().equalsIgnoreCase(window.ZEICEHNO) && buttons[2][1].getText().equalsIgnoreCase(window.ZEICEHNO)) {
            showWinner("Der Sieger ist " + window.nameSP1);
        } else if (buttons[0][0].getText().equalsIgnoreCase(window.ZEICEHNO) && buttons[1][0].getText().equalsIgnoreCase(window.ZEICEHNO) && buttons[2][0].getText().equalsIgnoreCase(window.ZEICEHNO)) {
            showWinner("Der Sieger ist " + window.nameSP1);

        } else {
            for (Component currentComponent : window.buttonPanel.getComponents()) {
                if (currentComponent instanceof JButton) {
                    JButton currentButton = (JButton) currentComponent;
                    if (currentButton.getText().equalsIgnoreCase("")) {
                        return;
                    }
                }
            }
            showDraw();
        }
    }

    private void setButtonListeners(JButton currentButton){
        if (currentButton.getText().equals("")) {
            currentButton.setFont(buttonFont);
            if (window.getZeichen().equalsIgnoreCase(window.ZEICHENX)) {
                currentButton.setText(window.getZeichen());
                label.setText(window.SPIELER_ZWEI_TEXT + window.EXTRA_TEXT);
                window.setZeichen(window.ZEICEHNO);
            } else if (window.getZeichen().equalsIgnoreCase(window.ZEICEHNO)) {
                currentButton.setText(window.getZeichen());
                label.setText(window.SPIELER_EINS_TEXT + window.EXTRA_TEXT);
                window.setZeichen(window.ZEICHENX);
            }

            if(window.botActiveCheckBox.isSelected()){
                int randomRow = random.nextInt(3);
                int randomColoumn = random.nextInt(3);
                if(buttons[randomRow][randomColoumn].getText().equalsIgnoreCase("")){
                    buttons[randomRow][randomColoumn].setFont(buttonFont);
                    buttons[randomRow][randomColoumn].setText(window.getZeichen());
                    label.setText(window.SPIELER_EINS_TEXT + window.EXTRA_TEXT);
                    window.setZeichen(window.ZEICHENX);
                }else{
                    for(Component component : window.buttonPanel.getComponents()){
                        if(component instanceof JButton){
                            JButton botButton = (JButton) component;
                            if(botButton.getText().equalsIgnoreCase("")){
                                botButton.setFont(buttonFont);
                                botButton.setText(window.getZeichen());
                                label.setText(window.SPIELER_EINS_TEXT + window.EXTRA_TEXT);
                                window.setZeichen(window.ZEICHENX);
                                break;
                            }
                        }
                    }
                }
            }
            checkGameEnding();
        }
    }

    private void showDraw() {
        disableButtons();

        JFrame jFrame = new JFrame("Draw");
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton restartButton = new JButton("Ok");
        restartButton.addActionListener(e -> {
            new RestartButtonListener(window);
            resetButtons();
            jFrame.dispose();
            window.setZeichen(window.zeichenSP1);
            label.setText(window.SPIELER_EINS_TEXT + window.EXTRA_TEXT);
        });
        jFrame.add(restartButton, BorderLayout.PAGE_END);

        JLabel label = new JLabel("Unentschieden", SwingConstants.CENTER);
        jFrame.add(label, BorderLayout.CENTER);

        jFrame.setPreferredSize(new Dimension(200, 200));
        jFrame.setLocationRelativeTo(null);
        jFrame.pack();
    }

    private void showWinner(String winner) {
        disableButtons();

        JFrame jFrame = new JFrame("Winner");
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        try{
            Config config = new Config(winner, 1);
            config.wirteWin();
        } catch (FileNotFoundException e) {
           new ErrorFrame();
        }

        JButton restartButton = new JButton("Ok");
        restartButton.addActionListener(e -> {
            new RestartButtonListener(window);
            resetButtons();
            jFrame.dispose();
            window.setZeichen(window.zeichenSP1);
            label.setText(window.SPIELER_EINS_TEXT + window.EXTRA_TEXT);
        });
        jFrame.add(restartButton, BorderLayout.PAGE_END);

        JLabel label = new JLabel(winner, SwingConstants.CENTER);
        jFrame.add(label, BorderLayout.CENTER);

        jFrame.setPreferredSize(new Dimension(200, 200));
        jFrame.setLocationRelativeTo(null);
        jFrame.pack();
    }

    private void disableButtons(){
        for(int i = 0; i < 3; i++){
            for(int j = 0; j <3; j++){
                buttons[i][j].setEnabled(false);
            }
        }
    }

    public void resetButtons(){
        for(int i = 0; i < 3; i++){
            for(int j = 0; j <3; j++){
                buttons[i][j].setText("");
                buttons[i][j].setEnabled(true);
            }
        }
    }
}
