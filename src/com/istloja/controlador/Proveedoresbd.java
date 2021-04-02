/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.istloja.controlador;

import com.istloja.conexionbd.Conexion1;
import com.istloja.modelo.Proveedores;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.istloja.utilidad.Utilidades;

/**
 *
 * @author Ordenador
 */
public class Proveedoresbd {
    
    public Utilidades utilidades;
    
    public Proveedoresbd(){
        utilidades = new Utilidades();
    }

    public boolean GuardarProveedor(Proveedores proveedor) {
        boolean registrar = false;
        Statement stm = null;
        Connection con = null;
        String sql = "INSERT INTO `bdejercicio1`.`proveedores` (`idProveedores`, `ruc`, `razonsocial`, `tipoActividad`, `nombreRepresentanteLegal`, `ApellidosRepresentanteLegal`, `telefono`, `correo`, `direccion`, `fecha_registro`, 'fecha_vencimiento_deuda) VALUES ('"+String.valueOf(proveedor.getIdProveedores())+"', '"+proveedor.getRuc()+"', '"+proveedor.getRazonSocial()+"', '"+proveedor.getTipoActividad()+"', '"+proveedor.getNombreRepresentanteLegal()+"', '"+proveedor.getApellidosRepresentanteLegal()+"', '"+proveedor.getTelefono()+"', '"+proveedor.getCorreo()+"', '"+proveedor.getDireccion()+"', '"+utilidades.devolverFecha(proveedor.getFecharegistro())+"', '"+utilidades.devolverFecha(proveedor.getFechavencimientodeuda())+"'');";
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

    public boolean EditarProveedor(Proveedores proveedor) {
        boolean editar = false;
        Statement stm = null;
        Connection con = null;
        String sql = "UPDATE `bdejercicio1`.`proveedores` SET `ruc` = '"+proveedor.getRuc()+"', `razonsocial` = '"+proveedor.getRazonSocial()+"', `tipoActividad` = '"+proveedor.getTipoActividad()+"', `nombreRepresentanteLegal` = '"+proveedor.getNombreRepresentanteLegal()+"', `ApellidosRepresentanteLegal` = '"+proveedor.getApellidosRepresentanteLegal()+"', `telefono` = '"+proveedor.getTelefono()+"', `correo` = '"+proveedor.getCorreo()+"', `direccion` = '"+proveedor.getDireccion()+"',`fecha_registro` = '"+utilidades.devolverFecha(proveedor.getFecharegistro())+"', `fecha_vencimiento_deuda` = '"+utilidades.devolverFecha(proveedor.getFechavencimientodeuda())+"' WHERE (`idProveedores` = '"+String.valueOf(proveedor.getIdProveedores())+"');";
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

    public boolean EliminarProveedores(Proveedores proveedor) {
        Connection connect = null;
        Statement stm = null;
        boolean eliminar = false;
        String sql = "DELETE FROM `bdejercicio1`.`proveedores` WHERE (`idProveedores` = '"+String.valueOf(proveedor.getIdProveedores())+"');";
        try {
            connect = new Conexion1().ConexionMysql();
            stm = connect.createStatement();
            stm.execute(sql);
            eliminar = true;
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return eliminar;
    }

    public List<Proveedores> ObtenerProveedoresRucLista(String ruc) {
        Connection co = null;
        Statement stm = null;
        //Sentencia de JDBC para obtener valores de la base de datos.
        ResultSet rs = null;
        String sql = "SELECT * FROM bdejercicio1.proveedores where ruc like '%" + ruc + "%';";
        List<Proveedores> listaProveedores = new ArrayList<>();
        try {
            co = new Conexion1().ConexionMysql();
            stm = co.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                Proveedores c = new Proveedores();
                c.setIdProveedores(rs.getInt(1));
                c.setRuc(rs.getString(2));
                c.setRazonSocial(rs.getString(3));
                c.setTipoActividad(rs.getString(4));
                c.setNombreRepresentanteLegal(rs.getString(5));
                c.setApellidosRepresentanteLegal(rs.getString(6));
                c.setTelefono(rs.getString(7));
                c.setCorreo(rs.getString(8));
                c.setDireccion(rs.getString(9));
                c.setFecharegistro(rs.getDate(10));
                c.setFechavencimientodeuda(rs.getDate(11));
                listaProveedores.add(c);
            }
            stm.close();
            rs.close();
            co.close();
        } catch (SQLException e) {
            System.out.println("Error:" + e.getMessage());
        }

        return listaProveedores;
    }

    public List<Proveedores> ObtenerProveedoresTelefono(String telefono) {
        Connection co = null;
        Statement stm = null;
        //Sentencia de JDBC para obtener valores de la base de datos.
        ResultSet rs = null;
        String sql = "SELECT * FROM bdejercicio1.proveedores where telefono like '%" + telefono + "%';";
        List<Proveedores> listaProveedores = new ArrayList<>();
        try {
            co = new Conexion1().ConexionMysql();
            stm = co.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                Proveedores c = new Proveedores();
                c.setIdProveedores(rs.getInt(1));
                c.setRuc(rs.getString(2));
                c.setRazonSocial(rs.getString(3));
                c.setTipoActividad(rs.getString(4));
                c.setNombreRepresentanteLegal(rs.getString(5));
                c.setApellidosRepresentanteLegal(rs.getString(6));
                c.setTelefono(rs.getString(7));
                c.setCorreo(rs.getString(8));
                c.setDireccion(rs.getString(9));
                c.setFecharegistro(rs.getDate(10));
                c.setFechavencimientodeuda(rs.getDate(11));
                listaProveedores.add(c);
            }
            stm.close();
            rs.close();
            co.close();
        } catch (SQLException e) {
            System.out.println("Error:" + e.getMessage());
        }

        return listaProveedores;
    }

    public List<Proveedores> obtenerProveedores() {
        Connection co = null;
        Statement stm = null;
        ResultSet rs = null;
        String sql = "SELECT * FROM bdejercicio1.proveedores;";
        List<Proveedores> listaProveedores = new ArrayList<Proveedores>();
        try {
            co = new Conexion1().ConexionMysql();
            stm = co.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                Proveedores c = new Proveedores();
                c.setIdProveedores(rs.getInt(1));
                c.setRuc(rs.getString(2));
                c.setRazonSocial(rs.getString(3));
                c.setTipoActividad(rs.getString(4));
                c.setNombreRepresentanteLegal(rs.getString(5));
                c.setApellidosRepresentanteLegal(rs.getString(6));
                c.setTelefono(rs.getString(7));
                c.setCorreo(rs.getString(8));
                c.setDireccion(rs.getString(9));
                c.setFecharegistro(rs.getDate(10));
                c.setFechavencimientodeuda(rs.getDate(11));
                listaProveedores.add(c);
            }
            stm.close();
            rs.close();
            co.close();
        } catch (SQLException e) {
            System.out.println("Error:" + e.getMessage());
        }

        return listaProveedores;
    }
}
