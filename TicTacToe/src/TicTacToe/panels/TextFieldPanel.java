package TicTacToe.panels;

import javax.swing.*;
import java.awt.*;

public class TextFieldPanel extends JPanel {

    public JTextField zeichenSP1,
    nameSP1, zeichenSP2, nameSP2;

    public TextFieldPanel(){
        GridLayout gridLayout = new GridLayout(10, 2);
        this.add(new Component() {
        });
        this.add(new Component() {
        });

        zeichenSP1 = new JTextField();
        zeichenSP1.setText("X");
        zeichenSP1.setSize(new Dimension(400, 50));
        this.add(zeichenSP1, BorderLayout.CENTER);
        this.add(new Component() {
        });
        nameSP1 = new JTextField();
        nameSP1.setSize(new Dimension(400, 50));
        nameSP1.setText("Spieler 1");
        this.add(nameSP1, BorderLayout.CENTER);

        this.add(new Component() {
        });


        zeichenSP2 = new JTextField();
        zeichenSP2.setText("O");
        zeichenSP2.setSize(new Dimension(400, 50));
        this.add(zeichenSP2, BorderLayout.CENTER);

        this.add(new Component() {
        });

        nameSP2 = new JTextField();
        nameSP2.setText("Spieler 2");
        nameSP2.setSize(new Dimension(400, 50));
        this.add(nameSP2, BorderLayout.CENTER);

        this.add(new Component() {
        });

        this.setLayout(gridLayout);
    }
}
