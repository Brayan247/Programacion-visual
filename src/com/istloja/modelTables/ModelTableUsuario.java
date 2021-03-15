/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.istloja.modelTables;

import com.istloja.modelo.Inventario;
import com.istloja.modelo.Persona;
import com.istloja.modelo.TipoUsuario;
import com.istloja.vistas.GestionContable;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Ordenador
 */
public class ModelTableUsuario extends AbstractTableModel {
        //Arreglo con el nombre de las columnas
     public String[] m_colNames = {"TIPO DE USUARIO", "ID DE PERSONA", "CONTRASEÑA"};

    public List<TipoUsuario> Usuario;

    private ComunicacionVistaModelosTablas comunicacionPersona;
    private GestionContable gestionContable;
    public ModelTableUsuario(List<TipoUsuario> usuarios,GestionContable gestionContable) {
        this.Usuario = usuarios;
        this.gestionContable = gestionContable;
    }

    @Override
    public int getRowCount() {
        return Usuario.size();
    }

    @Override
    public int getColumnCount() {
       return m_colNames.length;
    }
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        TipoUsuario i = Usuario.get(rowIndex);
        switch (columnIndex){
            case 0:
                return i.getTipoUsuarioSistema();
            case 1:
                return i.getIdPersonaSistema();
            case 2:
                return i.getContraseña();
        }
        return new String();
    }
     @Override
     public String getColumnName(int column){
    return m_colNames[column];
}
     @Override
     public boolean isCellEditable(int rowIndex, int columnIndex){
        gestionContable.clickTipoUsuario(Usuario.get(rowIndex));
        return super.isCellEditable(rowIndex, columnIndex);
     }

    public List<TipoUsuario> getInventario() {
        return Usuario;
    }

    public void setInventario(List<TipoUsuario> inventario) {
        this.Usuario = inventario;
    }




     
}

