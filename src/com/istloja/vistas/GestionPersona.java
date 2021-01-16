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

public class GestionPersona extends JFrame {

    private JPanel panel = new JPanel();
    private JPanel paneltitulo = new JPanel();

    public void GestionPersona() {
        this.show();
        this.setTitle("Formulario");
        this.setSize(400, 600);
        panel.setLayout(new FlowLayout());
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
        paneltitulo.setLayout(new FlowLayout());

//        panel.setLayout(new FlowLayout());
        panel.setLayout(new GridLayout(8, 2));
        panel.add(new JLabel("Cedula:"));
        panel.add(new JTextField(10));
        panel.add(new JLabel("Nombre:"));
        panel.add(new JTextField(10));
        panel.add(new JLabel("Apellido:"));
        panel.add(new JTextField(10));
        panel.add(new JLabel("Direccion:"));
        panel.add(new JTextField(10));
        panel.add(new JLabel("Telefono:"));
        panel.add(new JTextField(10));
        panel.add(new JLabel("Correo:"));
        panel.add(new JTextField(10));
        this.add(panel);

        JButton buttonAgregar = new JButton("Agregar");
        JButton buttonEditar = new JButton("Editar");
        JButton buttonEliminar = new JButton("Eliminar");
        JButton buttonRegistrar = new JButton("Registrar");    
        panel.add(buttonAgregar);
        panel.add(buttonEditar);
        panel.add(buttonEliminar);
        panel.add(buttonRegistrar);

        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
