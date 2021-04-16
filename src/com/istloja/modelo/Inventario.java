
package com.istloja.modelo;

import java.util.Date;

/**
 *
 * @author Ordenador
 */
public class Inventario {
    private int idInventario;
    private String codigoProducto ;
    private String descripcion;
    private String cantidadProductos;
    private Date fechaRegistro;
    private Date fechaActualizacion;
    private Date fechaCaducidad;
    private double precioCompraSinIVA;
    private double PrecioCompraConIV;
    private double precioMayorista;
    private double precioClienteFijo;
    private double precioClienteNormal;
    
    //Atrubuto temporal
    private int cantidadProductoenVenta;

    public int getCantidadProductoenVenta() {
        return cantidadProductoenVenta;
    }

    public void setCantidadProductoenVenta(int cantidadProductoenVenta) {
        this.cantidadProductoenVenta = cantidadProductoenVenta;
    }

    public Inventario(int idInventario, String codigoProducto, String descripcion, String cantidadProductos, Date fechaRegistro, Date fechaActualizacion, Date fechaCaducidad, double precioCompraSinIVA, double PrecioCompraConIV, double precioMayorista, double precioClienteFijo, double precioClienteNormal) {
        this.idInventario = idInventario;
        this.codigoProducto = codigoProducto;
        this.descripcion = descripcion;
        this.cantidadProductos = cantidadProductos;
        this.fechaRegistro = fechaRegistro;
        this.fechaActualizacion = fechaActualizacion;
        this.fechaCaducidad = fechaCaducidad;
        this.precioCompraSinIVA = precioCompraSinIVA;
        this.PrecioCompraConIV = PrecioCompraConIV;
        this.precioMayorista = precioMayorista;
        this.precioClienteFijo = precioClienteFijo;
        this.precioClienteNormal = precioClienteNormal;
    }

    
    public Inventario() {
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

    public String getCantidadProductos() {
        return cantidadProductos;
    }

    public void setCantidadProductos(String cantidadProductos) {
        this.cantidadProductos = cantidadProductos;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Date getFechaActualizacion() {
        return fechaActualizacion;
    }

    public void setFechaActualizacion(Date fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
    }

    public Date getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(Date fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public double getPrecioCompraSinIVA() {
        return precioCompraSinIVA;
    }

    public void setPrecioCompraSinIVA(double precioCompraSinIVA) {
        this.precioCompraSinIVA = precioCompraSinIVA;
    }

    public double getPrecioCompraConIV() {
        return PrecioCompraConIV;
    }

    public void setPrecioCompraConIV(double PrecioCompraConIV) {
        this.PrecioCompraConIV = PrecioCompraConIV;
    }

    public double getPrecioMayorista() {
        return precioMayorista;
    }

    public void setPrecioMayorista(double precioMayorista) {
        this.precioMayorista = precioMayorista;
    }

    public double getPrecioClienteFijo() {
        return precioClienteFijo;
    }

    public void setPrecioClienteFijo(double precioClienteFijo) {
        this.precioClienteFijo = precioClienteFijo;
    }

    public double getPrecioClienteNormal() {
        return precioClienteNormal;
    }

    public void setPrecioClienteNormal(double precioClienteNormal) {
        this.precioClienteNormal = precioClienteNormal;
    }

    @Override
    public String toString() {
        return "Inventario{" + "idInventario=" + idInventario + ", codigoProducto=" + codigoProducto + ", descripcion=" + descripcion + ", cantidadProductos=" + cantidadProductos + ", fechaRegistro=" + fechaRegistro + ", fechaActualizacion=" + fechaActualizacion + ", fechaCaducidad=" + fechaCaducidad + ", precioCompraSinIVA=" + precioCompraSinIVA + ", PrecioCompraConIV=" + PrecioCompraConIV + ", precioMayorista=" + precioMayorista + ", precioClienteFijo=" + precioClienteFijo + ", precioClienteNormal=" + precioClienteNormal + '}';
    }
    
}
