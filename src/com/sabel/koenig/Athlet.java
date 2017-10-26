package com.sabel.koenig;

/**
 * @author Koenig
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Athlet extends JPanel {

    private Scheibe scheibeAthletLiegend;
    private Scheibe scheibeAthletStehend;
    private JLabel lblZeile;
    private JLabel lblErgebnis;
    private JButton jButton;
    private int athletNr;


    public Athlet(int athletNr) {
        this.athletNr = athletNr;
        initComponents();
        initEvents();
    }

    public int anzahlFehler() {
        return scheibeAthletLiegend.anzahlFehler() + scheibeAthletStehend.anzahlFehler();
    }

    private void initEvents() {
        this.jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblErgebnis.setText( anzahlFehler() + " Fehler");
            }

        });
    }

    private void initComponents() {

        lblZeile = new JLabel("Athlet " + athletNr);
        scheibeAthletLiegend = new Scheibe("liegend");
        scheibeAthletStehend = new Scheibe("stehend");
        jButton = new JButton("Fehler ermitteln");
        lblErgebnis = new JLabel("Fehler");

        this.add(lblZeile);
        this.add(scheibeAthletLiegend);
        this.add(scheibeAthletStehend);
        this.add(jButton);
        this.add(lblErgebnis);
    }
}
