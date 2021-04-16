    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.istloja.modelo;


public class ProductoNotaVenta {
    private int cantidadProducto;
    private String descripcion;
    private double subtotal;
    private double total;

    public ProductoNotaVenta() {
    }

    public ProductoNotaVenta(int cantidadProducto, String descripcion, double subtotal, double total) {
        this.cantidadProducto = cantidadProducto;
        this.descripcion = descripcion;
        this.subtotal = subtotal;
        this.total = total;
    }

    public int getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "ProductoNotaVenta{" + "cantidadProducto=" + cantidadProducto + ", descripcion=" + descripcion + ", subtotal=" + subtotal + ", total=" + total + '}';
    }

   
      
}
