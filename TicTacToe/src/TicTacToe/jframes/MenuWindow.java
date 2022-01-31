package TicTacToe.jframes;

import TicTacToe.panels.MenuButtonPanel;
import TicTacToe.panels.MenuCheckBoxPanel;
import TicTacToe.panels.TextFieldPanel;

import javax.swing.*;
import java.awt.*;

public class MenuWindow extends JFrame{

    public MenuWindow(){
        TextFieldPanel textFieldPanel = new TextFieldPanel();
        this.setTitle("Menu");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setPreferredSize(new Dimension(800, 800));


        JLabel label = new JLabel("Tic Tac Toe");
        label.setSize(new Dimension(600, 200));
        label.setFont(new Font("Joker", Font.PLAIN, 70));
        this.add(label, BorderLayout.PAGE_START);
        this.add(textFieldPanel, BorderLayout.CENTER);



        MenuCheckBoxPanel menuCheckBoxPanel = new MenuCheckBoxPanel();

        this.add(menuCheckBoxPanel, BorderLayout.WEST);


        this.add(new MenuButtonPanel(this, textFieldPanel, menuCheckBoxPanel.randomPlayercheckBox, menuCheckBoxPanel.botActiveCheckBox), BorderLayout.PAGE_END);

        this.setVisible(true);
        this.setPreferredSize(new Dimension(400, 400));
        this.setLocationRelativeTo(null);
        this.pack();
    }

}
