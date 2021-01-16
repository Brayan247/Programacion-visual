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
//a

/**
 *
 * @author Ordenador
 */
public class personabd {

    public boolean crearpersona(Persona persona) {
        boolean registrar = false;
        Statement stm = null;
        Connection con = null;
        String sql = "INSERT INTO `bdejercicio1`.`persona` (`idpersona`, `cedula`, `nombre`, `apellido`, `direccion`, `telefono`, `correo`) VALUES ('" + String.valueOf(persona.getIdpersona()) + "', '" + persona.getCedula() + "', '" + persona.getNombre() + "', '" + persona.getApellido() + "', '" + persona.getDireccion() + "', '" + persona.getTelefono() + "', '" + persona.getCorreo() + "');";
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

    public boolean eliminarpersona(Persona persona) {
        boolean eliminar = false;
        Statement stm = null;
        Connection con = null;
        String sql = "DELETE  FROM `bdejercicio1` . `persona` where `idpersona`= "+String.valueOf(persona.getIdpersona()) +"";
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

    public boolean editarpersona(Persona persona) {
        boolean editar = false;
        Statement stm = null;
        Connection con = null;
        String sql = "DELETE  FROM `bdejercicio1` . `persona` WHERE (`idpersona`= '"+String.valueOf(persona.getIdpersona())+"');";
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
    
     public boolean actualizarpersona(Persona persona) {
        boolean actualizar = false;
        Statement stm = null;
        Connection con = null;
        String sql = "UPDATE `bdejercicio1`.`persona` SET `cedula = '" +persona.getCedula()+ "', `nombre` = '" + persona.getNombre() + "', `apellido = '" + persona.getApellido() + "',`dirreccion` = '" + persona.getDireccion() + "', `telefono` = '" + persona.getTelefono() + "' WHERE `(idpersona` ='"  + String.valueOf(persona.getIdpersona()) +  " ')";
        try {
            Conexion1 conexion = new Conexion1();
            con = conexion.ConexionMysql();
            stm = con.createStatement();
            stm.execute(sql);
            actualizar = true;
            stm.close();
            return actualizar;
        } catch (Exception e) {
            System.out.println("hubo algun error" + e.getMessage());

        }
        return false;
    }

}
