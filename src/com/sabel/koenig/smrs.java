package com.sabel.koenig;

/**
 * @author Koenig
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class smrs extends JFrame {

    private JPanel jPanel;
    private Athlet athlet1;
    private Athlet athlet2;
    private JButton jButtonGesamtfehler;
    private JLabel lblGesamtfehler;
    private JPanel jPanelGesamtfehler;


    public smrs() {

        this.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        this.setSize(600, 200);
        this.initComponents();
        this.initEvents();
        this.setVisible(true);
    }

    private void initComponents() {
        jPanel = new JPanel();
        jPanel.setLayout(new BoxLayout(jPanel, BoxLayout.Y_AXIS));
        athlet1 = new Athlet(1);
        athlet2 = new Athlet(2);

        jPanelGesamtfehler = new JPanel();
        jButtonGesamtfehler = new JButton("Gesamtfehler");
        lblGesamtfehler = new JLabel("Gesamtfehler");
        jPanelGesamtfehler.add(jButtonGesamtfehler);
        jPanelGesamtfehler.add(lblGesamtfehler);

        jPanel.add(athlet1);
        jPanel.add(athlet2);
        jPanel.add(jPanelGesamtfehler);
        this.add(jPanel, BorderLayout.CENTER);
    }


    private void speichern() {

        if (true) {
            JOptionPane.showMessageDialog(this, "Anzahl dert Fehler ertfolgreich gespeichert!", "Programm wird beendet", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Fehler beim Speichern", "Programm wird beendet", JOptionPane.WARNING_MESSAGE);
        }

    }


    private void initEvents() {
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                speichern();
                System.exit(NORMAL);
            }
        });

        jButtonGesamtfehler.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblGesamtfehler.setText(athlet1.anzahlFehler() + athlet2.anzahlFehler() + " Fehler");
            }
        });
    }
}
