package com.sabel.koenig;

/**
 * @author Koenig
 */

import javax.swing.*;
import javax.swing.border.TitledBorder;

public class Scheibe extends JPanel {

    private JRadioButton[] jRadioButtons;

    public Scheibe(String artDesSchiessens) {
        jRadioButtons = new JRadioButton[5];
        for (int i = 0; i < 5; i++) {
            jRadioButtons[i] = new JRadioButton();
            jRadioButtons[i].setSelected(true);
            this.add(jRadioButtons[i]);
        }
        this.setBorder(new TitledBorder(artDesSchiessens));
        //this.setSize(150,50);
    }

    public int anzahlFehler() {
        int anzahl = 0;
        for (int i = 0; i < 5; i++) {
            if (jRadioButtons[i].isSelected()) {
                anzahl++;
            }
            jRadioButtons[i].setEnabled(false);
        }
        //System.out.println(anzahl);
        return anzahl;
    }
}
