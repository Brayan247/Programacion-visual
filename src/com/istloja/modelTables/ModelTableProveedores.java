/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.istloja.modelTables;

import com.istloja.modelo.Inventario;
import com.istloja.modelo.Persona;
import com.istloja.modelo.Proveedores;
import com.istloja.vistas.GestionContable;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Ordenador
 */
public class ModelTableProveedores extends AbstractTableModel {
        //Arreglo con el nombre de las columnas
     public String[] m_colNames = {"RUC", "RAZON SOCIAL", "TIPO ACTIVIDAD", "NOMBRE REPRESENTANTE LEGAL", "APELLIDO REPRESENTANTE LEGAL", "TELEFONO", "CORREO"};

    public List<Proveedores> provedores;

    private ComunicacionVistaModelosTablas comunicacionPersona;
    private GestionContable gestionContable;
    public ModelTableProveedores(List<Proveedores> proveedores,GestionContable gestionContable) {
        this.provedores = proveedores;
        this.gestionContable = gestionContable;
    }

    @Override
    public int getRowCount() {
        return provedores.size();
    }

    @Override
    public int getColumnCount() {
       return m_colNames.length;
    }
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Proveedores provedor = provedores.get(rowIndex);
        switch (columnIndex){
            case 0:
                return provedor.getRuc();
            case 1:
                return provedor.getRazonSocial();
            case 2:
                return provedor.getTipoActividad();
            case 3:
                return provedor.getNombreRepresentanteLegal();
            case 4:
                return provedor.getApellidosRepresentanteLegal();
            case 5:
                return provedor.getTelefono();
            case 6:
                return provedor.getCorreo();
        }
        return new String();
    }
     @Override
     public String getColumnName(int column){
    return m_colNames[column];
}
     @Override
     public boolean isCellEditable(int rowIndex, int columnIndex){
        gestionContable.clickProveedores(provedores.get(rowIndex));
        return super.isCellEditable(rowIndex, columnIndex);
     }

    public List<Proveedores> getProvedores() {
        return provedores;
    }

    public void setProvedores(List<Proveedores> provedores) {
        this.provedores = provedores;
    }




     
}

