/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.istloja.vistas;

import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 *
 * @author Ordenador
 */
public class GestionPersona extends JFrame {

    private JPanel panel = new JPanel();
    private JPanel panelcampos = new JPanel();
    private JPanel paneltitulo = new JPanel();
    private JPanel panelbotones = new JPanel();

    public void GestionPersona() {
        this.show();
        this.setTitle("Formulario");
        this.setSize(450, 250);
        this.setLocationRelativeTo(null);
        panel.setLayout(new FlowLayout());
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
        paneltitulo.setLayout(new FlowLayout());

        JLabel laber = new JLabel("Registro de Personas");
        paneltitulo.add(laber);
        panel.add(paneltitulo);

        panelcampos.setLayout(new GridLayout(6, 2));
        panelcampos.add(new JLabel("Cedula:", SwingConstants.CENTER));
        panelcampos.add(new JTextField("..."));
        panelcampos.add(new JLabel("Nombre:", SwingConstants.CENTER));
        panelcampos.add(new JTextField("..."));
        panelcampos.add(new JLabel("Apellido:", SwingConstants.CENTER));
        panelcampos.add(new JTextField("..."));
        panelcampos.add(new JLabel("Direccion:", SwingConstants.CENTER));
        panelcampos.add(new JTextField("..."));
        panelcampos.add(new JLabel("Telefono:", SwingConstants.CENTER));
        panelcampos.add(new JTextField("..."));
        panelcampos.add(new JLabel("Correo:", SwingConstants.CENTER));
        panelcampos.add(new JTextField("..."));
        panel.add(panelcampos);
        
        panelbotones = new JPanel(new FlowLayout(FlowLayout.CENTER));
        panelbotones.add(new JButton("Agregar"));
        panelbotones.add(new JButton("Editar"));
        panelbotones.add(new JButton("Eliminar"));
        panelbotones.add(new JButton("Registrar"));
        panel.add(panelbotones);
        this.add(panel);

        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
