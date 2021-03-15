/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.istloja.modelo;

import java.sql.Date;

/**
 *
 * @author Ordenador
 */
public class Proveedores {

    private int idProveedores;
    private String ruc;
    private String razonSocial;
    private String tipoActividad;
    private String nombreRepresentanteLegal;
    private String ApellidosRepresentanteLegal;
    private String telefono;
    private String correo;
    private String direccion;
    private Date fecharegistro;

    public Proveedores(int idProveedores, String ruc, String razonSocial, String tipoActividad, String nombreRepresentanteLegal, String ApellidosRepresentanteLegal, String telefono, String correo, String direccion, Date fecharegistro) {
        this.idProveedores = idProveedores;
        this.ruc = ruc;
        this.razonSocial = razonSocial;
        this.tipoActividad = tipoActividad;
        this.nombreRepresentanteLegal = nombreRepresentanteLegal;
        this.ApellidosRepresentanteLegal = ApellidosRepresentanteLegal;
        this.telefono = telefono;
        this.correo = correo;
        this.direccion = direccion;
        this.fecharegistro = fecharegistro;
    }

    public Date fechaderegistro() {
        fecharegistro = new Date(fecharegistro.getYear(), fecharegistro.getMonth(), fecharegistro.getDay());
        return fecharegistro;
    }

    public Proveedores() {
    }

    public int getIdProveedores() {
        return idProveedores;
    }

    public void setIdProveedores(int idProveedores) {
        this.idProveedores = idProveedores;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getTipoActividad() {
        return tipoActividad;
    }

    public void setTipoActividad(String tipoActividad) {
        this.tipoActividad = tipoActividad;
    }

    public String getNombreRepresentanteLegal() {
        return nombreRepresentanteLegal;
    }

    public void setNombreRepresentanteLegal(String nombreRepresentanteLegal) {
        this.nombreRepresentanteLegal = nombreRepresentanteLegal;
    }

    public String getApellidosRepresentanteLegal() {
        return ApellidosRepresentanteLegal;
    }

    public void setApellidosRepresentanteLegal(String ApellidosRepresentanteLegal) {
        this.ApellidosRepresentanteLegal = ApellidosRepresentanteLegal;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Date getFecharegistro() {
        return fecharegistro;
    }

    public void setFecharegistro(Date fecharegistro) {
        this.fecharegistro = fecharegistro;
    }

    @Override
    public String toString() {
        return "Proveedores{" + "idProveedores=" + idProveedores + ", ruc=" + ruc + ", razonSocial=" + razonSocial + ", tipoActividad=" + tipoActividad + ", nombreRepresentanteLegal=" + nombreRepresentanteLegal + ", ApellidosRepresentanteLegal=" + ApellidosRepresentanteLegal + ", telefono=" + telefono + ", correo=" + correo + ", direccion=" + direccion + ", fecharegistro=" + fecharegistro + '}';
    }

}
