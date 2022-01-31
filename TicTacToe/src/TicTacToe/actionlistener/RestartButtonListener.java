package TicTacToe.actionlistener;

import TicTacToe.jframes.MenuWindow;
import TicTacToe.jframes.OpenWindow;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RestartButtonListener implements ActionListener {

    OpenWindow window;

    public RestartButtonListener(OpenWindow window) {
        this.window = window;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        window.dispose();
        new MenuWindow();

        /* for(Component component : window.buttonPanel.getComponents()){
           if(component instanceof JButton){
               JButton button = (JButton) component;
               button.setText("");
           }
       }
       window.label.setText(window.SPIELER_EINS_TEXT + " ist am Zug");
       window.setZeichen(window.zeichenSP1);
       window.ZEICHENX = window.zeichenSP1;
       window.ZEICEHNO = window.zeichenSP2;*/
    }
}
