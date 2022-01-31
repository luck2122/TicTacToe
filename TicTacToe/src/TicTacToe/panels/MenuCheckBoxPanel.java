package TicTacToe.panels;

import javax.swing.*;
import java.awt.*;

public class MenuCheckBoxPanel extends JPanel {

    public JCheckBox randomPlayercheckBox;
    public JCheckBox botActiveCheckBox;

    public MenuCheckBoxPanel(){
        drawheckBoxes();
    }

    public void drawheckBoxes(){

        GridLayout gridLayout = new GridLayout(1,2);


        randomPlayercheckBox = new JCheckBox("Zufalläiger anfänger");
        randomPlayercheckBox.setSize(new Dimension(10, 10));
        this.add(randomPlayercheckBox, BorderLayout.LINE_START);

        botActiveCheckBox = new JCheckBox("Gegen KI");
        botActiveCheckBox.setSize(new Dimension(10, 10));
        this.add(botActiveCheckBox, BorderLayout.LINE_END);

        this.setLayout(gridLayout);
    }
}
