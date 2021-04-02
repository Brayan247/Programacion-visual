/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.istloja.modelo;

import java.sql.Date;
import java.time.format.DateTimeFormatter;

public class Persona {

    private int idpersona;
    private String cedula;
    private String nombre;
    private String apellido;
    private String direccion;
    private String telefono;
    private String correo;
    private Date fecharegistro;
    private int genero;
    private Date fechaactualizacion;
    private Date fechanacimiento;

   
    
    public DateTimeFormatter fechaderegistro() {
       DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
       return dtf;
    }

    public Persona() {
    }

    public int getIdpersona() {
        return idpersona;
    }

    public void setIdpersona(int id_persona) {
        this.idpersona = idpersona;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Date getFecharegistro() {
        return fecharegistro;
    }

    public void setFecharegistro(Date fecharegistro) {
        this.fecharegistro = fecharegistro;
    }

    public int getGenero() {
        return genero;
    }

    public void setGenero(int genero) {
        this.genero = genero;
    }

    public Date getFechaactualizacion() {
        return fechaactualizacion;
    }

    public void setFechaactualizacion(Date fechaactualizacion) {
        this.fechaactualizacion = fechaactualizacion;
    }

    public Date getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(Date fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    @Override
    public String toString() {
        return "Persona{" + "idpersona=" + idpersona + ", cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido + ", direccion=" + direccion + ", telefono=" + telefono + ", correo=" + correo + ", fecharegistro=" + fecharegistro + ", genero=" + genero + ", fechaactualizacion=" + fechaactualizacion + ", fechanacimiento=" + fechanacimiento + '}';
    }

    

}
