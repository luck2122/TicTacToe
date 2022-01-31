package TicTacToe.panels;

import TicTacToe.configuration.Config;
import TicTacToe.jframes.ErrorFrame;
import TicTacToe.jframes.InfoFrame;
import TicTacToe.jframes.MenuWindow;
import TicTacToe.jframes.OpenWindow;

import javax.swing.*;
import java.awt.*;
import java.io.FileNotFoundException;

public class MenuButtonPanel extends JPanel {

    MenuWindow window;
    TextFieldPanel textFieldPanel;
    JCheckBox botActiveCheckBox,
    randomPlayercheckBox;

    public MenuButtonPanel(MenuWindow window, TextFieldPanel textFieldPanel, JCheckBox randomPlayercheckBox, JCheckBox botActiveCheckBox){
        this.window = window;
        this.textFieldPanel = textFieldPanel;
        this.randomPlayercheckBox = randomPlayercheckBox;
        this.botActiveCheckBox = botActiveCheckBox;

        drawMenuButtonPanel();
    }

    public void drawMenuButtonPanel(){

        GridLayout gridLayout = new GridLayout(1,1);
        this.setLayout(gridLayout);
        JButton startButton = new JButton("Starten");
        startButton.addActionListener(e -> {
            window.dispose();
            new OpenWindow(textFieldPanel.zeichenSP1, textFieldPanel.nameSP1, textFieldPanel.zeichenSP2,textFieldPanel.nameSP2, randomPlayercheckBox, botActiveCheckBox);
        });
        this.add(startButton);

        JButton infoButton = new JButton("Infos");
        infoButton.addActionListener(e ->{
            Config config = new Config();

            try {
                new InfoFrame(config.readInfos());
            } catch (FileNotFoundException fileNotFoundException) {
                new ErrorFrame();
            }
        });
        this.add(infoButton);
    }
}
