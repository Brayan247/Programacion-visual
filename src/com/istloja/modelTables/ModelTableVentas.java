/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.istloja.modelTables;
import com.istloja.vistas.GestionContable;
import com.istloja.modelo.ProductoNotaVenta;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Ordenador
 */
public class ModelTableVentas extends AbstractTableModel {
        //Arreglo con el nombre de las columnas
    public String[] m_colNames = {"CANTIDAD", "DESCRIPCION", "SUB TOTAL", "TOTAL"};

    public List<ProductoNotaVenta> productov;

    private ComunicacionVistaModelosTablas comunicacionPersona;
    private GestionContable gestionContable;
    public ModelTableVentas(List<ProductoNotaVenta> productosv,GestionContable gestionContable) {
        this.productov = productosv;
        this.gestionContable = gestionContable;
    }

    @Override
    public int getRowCount() {
        return productov.size();
    }

    @Override
    public int getColumnCount() {
       return m_colNames.length;
    }
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        ProductoNotaVenta productos = productov.get(rowIndex);
        switch (columnIndex){
            case 0:
                return productos.getCantidadProducto();
            case 1:
                return productos.getDescripcion();
            case 2:
                return productos.getSubtotal();
            case 3:
                return productos.getTotal();
        }
        return new String();
    }
     @Override
     public String getColumnName(int column){
    return m_colNames[column];
}
     @Override
     public boolean isCellEditable(int rowIndex, int columnIndex){
        gestionContable.clickProductoVentas(productov.get(rowIndex));
        return super.isCellEditable(rowIndex, columnIndex);
     }

    public List<ProductoNotaVenta> getProductov() {
        return productov;
    }

    public void setProductov(List<ProductoNotaVenta> productov) {
        this.productov = productov;
    }



     
}

