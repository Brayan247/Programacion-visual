/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.istloja.modelTables;

import com.istloja.modelo.Persona;
import com.istloja.vistas.GestionContable;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Ordenador
 */
public class ModelTablePersona extends AbstractTableModel {
        //Arreglo con el nombre de las columnas
     public String[] m_colNames = {"CÉDULA", "NOMBRE", "APELLIDO", "DIRECCIÓN", "TELEFONO", "CORREO","FECHA REGISTRO", "GENERO", "FECHA NACIMIENTO"};

    public List<Persona> personas;

    private ComunicacionVistaModelosTablas comunicacionPersona;
    private GestionContable gestionContable;
    public ModelTablePersona(List<Persona> personas,GestionContable gestionContable) {
        this.personas = personas;
        this.gestionContable = gestionContable;
    }

    @Override
    public int getRowCount() {
        return personas.size();
    }

    @Override
    public int getColumnCount() {
       return m_colNames.length;
    }
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Persona persona = personas.get(rowIndex);
        switch (columnIndex){
            case 0:
                return persona.getCedula();
            case 1:
                return persona.getNombre();
            case 2:
                return persona.getApellido();
            case 3:
                return persona.getDireccion();
            case 4:
                return persona.getCorreo();
            case 5:
                return persona.getTelefono();
            case 6:
                return persona.getFecharegistro();
            case 7:
                return persona.getGenero();
            case 8:
                return persona.getFechanacimiento();
        }
        return new String();
    }
     @Override
     public String getColumnName(int column){
    return m_colNames[column];
}
     @Override
     public boolean isCellEditable(int rowIndex, int columnIndex){
        gestionContable.clickPersona(personas.get(rowIndex));
        return super.isCellEditable(rowIndex, columnIndex);
     }

    public List<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(List<Persona> personas) {
        this.personas = personas;
    }
     
}

