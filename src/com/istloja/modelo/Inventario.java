
package com.istloja.modelo;

/**
 *
 * @author Ordenador
 */
public class Inventario {
    private int idInventario;
    private String codigoProducto ;
    private String descripcion;
    private String precioCompra ;
    private String precioVenta;
    private String cantidadProductos;

    public Inventario() {
    }

    public Inventario(int idInventario, String codigoProducto, String descripcion, String precioCompra, String precioVenta, String cantidadProductos) {
        this.idInventario = idInventario;
        this.codigoProducto = codigoProducto;
        this.descripcion = descripcion;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        this.cantidadProductos = cantidadProductos;
    }

    public int getIdInventario() {
        return idInventario;
    }

    public void setIdInventario(int idInventario) {
        this.idInventario = idInventario;
    }

    public String getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(String precioCompra) {
        this.precioCompra = precioCompra;
    }

    public String getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(String precioVenta) {
        this.precioVenta = precioVenta;
    }

    public String getCantidadProductos() {
        return cantidadProductos;
    }

    public void setCantidadProductos(String cantidadProductos) {
        this.cantidadProductos = cantidadProductos;
    }

    

   
}
