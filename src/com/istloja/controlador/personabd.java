/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.istloja.controlador;

import com.istloja.modelo.Persona;
import java.sql.Connection;
import java.sql.Statement;
import com.istloja.conexionbd.Conexion1;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import java.sql.Date;

/**
 *
 * @author Ordenador
 */
public class personabd {

    public boolean Guardarpersona(Persona persona) {
        boolean registrar = false;
        Statement stm = null;
        Connection con = null;
        String sql = "INSERT INTO `bdejercicio1`.`persona` (`idpersona`, `cedula`, `nombre`, `apellido`, `direccion`, `telefono`, `correo`, `fecha_registro`, `genero`) VALUES ('"+String.valueOf(persona.getIdpersona())+"', '"+persona.getCedula()+"', '"+persona.getNombre()+"', '"+persona.getApellido()+"', '"+persona.getDireccion()+"', '"+persona.getTelefono()+"', '"+persona.getCorreo()+"', '"+persona.fechaderegistro()+"', '"+persona.getGenero()+"');";
        try {
            Conexion1 conexion = new Conexion1();
            con = conexion.ConexionMysql();
            stm = con.createStatement();
            stm.execute(sql);
            registrar = true;
            stm.close();
            return registrar;
        } catch (Exception e) {
            System.out.println("hubo algun error" + e.getMessage());

        }
        return false;
    }

    public boolean Eliminarpersona(Persona persona) {
        boolean eliminar = false;
        Statement stm = null;
        Connection con = null;
        String sql = "DELETE FROM `bdejercicio1`.`persona` WHERE (`idpersona` = '"+String.valueOf(persona.getIdpersona())+"');";
        try {
            Conexion1 conexion = new Conexion1();
            con = conexion.ConexionMysql();
            stm = con.createStatement();
            stm.executeUpdate(sql);
            eliminar = true;
            stm.close();
            return eliminar;
        } catch (Exception e) {
            System.out.println("hubo algun error" + e.getMessage());

        }
        return false;
    }

    public boolean Editarpersona(Persona persona) {
        boolean editar = false;
        Statement stm = null;
        Connection con = null;
        String sql = "UPDATE `bdejercicio1`.`persona` SET `cedula` = '"+persona.getCedula()+"', `nombre` = '"+persona.getNombre()+"', `apellido` = '"+persona.getApellido()+"', `direccion` = '"+persona.getDireccion()+"', `telefono` = '"+persona.getTelefono()+"', `correo` = '"+persona.getCorreo()+"' WHERE (`idpersona` = '"+String.valueOf(persona.getIdpersona())+"');";
        try {
            Conexion1 conexion = new Conexion1();
            con = conexion.ConexionMysql();
            stm = con.createStatement();
            stm.executeUpdate(sql);
            editar = true;
            stm.close();
            return editar;
        } catch (Exception e) {
            System.out.println("hubo algun error" + e.getMessage());
        }
        return false;
    }

    public List<Persona> Obtenerpersonas() {
        Connection co = null;
        Statement stm = null;
        //Sentencia de JDBC para obtener valores de la base de datos.
        ResultSet rs = null;
        String sql = "SELECT * FROM bdejercicio1.persona;";
        List<Persona> listaPersonas = new ArrayList<>();
        try {
            co = new Conexion1().ConexionMysql();
            stm = co.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                Persona c = new Persona();
                c.setIdpersona(rs.getInt(1));
                c.setCedula(rs.getString(2));
                c.setNombre(rs.getString(3));
                c.setApellido(rs.getString(4));
                c.setDireccion(rs.getString(5));
                c.setCorreo(rs.getString(6));
                c.setTelefono(rs.getString(7));
                c.setFecharegistro(rs.getDate(8));
                c.setGenero(rs.getInt(9));
                listaPersonas.add(c);
            }
            stm.close();
            rs.close();
            co.close();
        } catch (SQLException e) {
            System.out.println("Error:" + e.getMessage());
        }

        return listaPersonas;
    }

    public List<Persona> getPersonaCedulaLista(String cedula) {
        Connection co = null;
        Statement stm = null;
        //Sentencia de JDBC para obtener valores de la base de datos.
        ResultSet rs = null;
        List<Persona> personasEncontradas = new ArrayList<>();
        String sql = "SELECT * FROM bdejercicio1.persona where cedula like '%" + cedula + "%';";
        try {
            co = new Conexion1().ConexionMysql();
            stm = co.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                Persona c = new Persona();
                c.setIdpersona(rs.getInt(1));
                c.setCedula(rs.getString(2));
                c.setNombre(rs.getString(3));
                c.setApellido(rs.getString(4));
                c.setDireccion(rs.getString(5));
                c.setCorreo(rs.getString(6));
                c.setTelefono(rs.getString(7));
                c.setFecharegistro(rs.getDate(8));
                c.setGenero(rs.getInt(9));
                personasEncontradas.add(c);
            }
            stm.close();
            rs.close();
            co.close();
        } catch (SQLException e) {
            System.out.println("Error:" + e.getMessage());
        }
        return personasEncontradas;
    }

    public List<Persona> getPersonaTelefonoLista(String telefono) {
        Connection co = null;
        Statement stm = null;
        //Sentencia de JDBC para obtener valores de la base de datos.
        ResultSet rs = null;
        List<Persona> personasEncontradas = new ArrayList<>();
        String sql = "SELECT * FROM bdejercicio1.persona where telefono like '%" + telefono + "%';";
        try {
            co = new Conexion1().ConexionMysql();
            stm = co.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                Persona c = new Persona();
                c.setIdpersona(rs.getInt(1));
                c.setCedula(rs.getString(2));
                c.setNombre(rs.getString(3));
                c.setApellido(rs.getString(4));
                c.setDireccion(rs.getString(5));
                c.setCorreo(rs.getString(6));
                c.setTelefono(rs.getString(7));
                c.setFecharegistro(rs.getDate(8));
                c.setGenero(rs.getInt(9));
                personasEncontradas.add(c);
            }
            stm.close();
            rs.close();
            co.close();
        } catch (SQLException e) {
            System.out.println("Error:" + e.getMessage());
        }
        return personasEncontradas;
    }

}
