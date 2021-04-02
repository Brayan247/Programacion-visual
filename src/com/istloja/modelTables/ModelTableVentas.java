/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.istloja.modelTables;

import com.istloja.modelo.Inventario;
import com.istloja.vistas.GestionContable;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Ordenador
 */
public class ModelTableVentas extends AbstractTableModel {
        //Arreglo con el nombre de las columnas
    public String[] m_colNames = {"CANTIDAD", "DESCRIPCION", "SUB TOTAL", "TOTAL"};

    public List<Inventario> inventario;

    private ComunicacionVistaModelosTablas comunicacionPersona;
    private GestionContable gestionContable;
    public ModelTableVentas(List<Inventario> inventario,GestionContable gestionContable) {
        this.inventario = inventario;
        this.gestionContable = gestionContable;
    }

    @Override
    public int getRowCount() {
        return inventario.size();
    }

    @Override
    public int getColumnCount() {
       return m_colNames.length;
    }
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Inventario inventarios = inventario.get(rowIndex);
        switch (columnIndex){
            case 0:
                return gestionContable.cantidadproductoVenta();
            case 1:
                return inventarios.getDescripcion();
            case 2:
                return inventarios.getPrecioClienteNormal();
            case 3:
                return gestionContable.cantidadproductoVenta() * inventarios.getPrecioClienteNormal();            
        }
        return new String();
    }
     @Override
     public String getColumnName(int column){
    return m_colNames[column];
}
     @Override
     public boolean isCellEditable(int rowIndex, int columnIndex){
        gestionContable.clickInventario(inventario.get(rowIndex));
        return super.isCellEditable(rowIndex, columnIndex);
     }

    public List<Inventario> getInventario() {
        return inventario;
    }

    public void setInventario(List<Inventario> inventario) {
        this.inventario = inventario;
    }


     
}

