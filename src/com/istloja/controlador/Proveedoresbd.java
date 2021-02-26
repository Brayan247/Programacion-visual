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
/**
 *
 * @author Ordenador
 */
public class Proveedoresbd {
    
        public boolean RegistrarProveedor(Proveedores proveedor) {
        boolean registrar = false;
        Statement stm = null;
        Connection con = null;
        String sql ="INSERT INTO `bdejercicio1`.`proveedores` (`ruc`, `razon_social`, `tipo_actividad`, `nombre_representante_legal`, `apellido_representante_legal`, `telefono`, `correo`) VALUES ('"+proveedor.getRuc()+"', '"+proveedor.getRazonSocial()+"', '"+proveedor.getTipoActividad()+"', '"+proveedor.getNombreRepresentanteLegal()+"', '"+proveedor.getApellidosRepresentanteLegal()+"', '"+proveedor.getTelefono()+"', '"+proveedor.getCorreo()+"');";
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
        public boolean ActualizarProveedor(Proveedores proveedor) {
        boolean editar = false;
        Statement stm = null;
        Connection con = null;
        String sql = "UPDATE `bdejercicio1`.`proveedores` SET `ruc` = '"+proveedor.getRuc()+"', `razon_social` = '"+proveedor.getRazonSocial()+"', `tipo_actividad` = '"+proveedor.getTipoActividad()+"', `nombre_representante_legal` = '"+proveedor.getNombreRepresentanteLegal()+"', `apellido_representante_legal` = '"+proveedor.getApellidosRepresentanteLegal()+"', `telefono` = '"+proveedor.getTelefono()+"', `correo` = '"+proveedor.getCorreo()+"' WHERE (`id_proveedores` = '"+proveedor.getIdProveedores()+"');";
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
        public boolean eliminarProveedores(Proveedores proveedor) {
        Connection connect = null;
        Statement stm = null;
        boolean eliminar = false;
        String sql = "DELETE FROM `bdejercicio1`.`proveedores` WHERE (`id_proveedores` = '"+proveedor.getIdProveedores()+"');";
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
        public List<Proveedores> obtenerProveedores() {
        Connection co = null;
        Statement stm = null;
        //Sentencia de JDBC para obtener valores de la base de datos.
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
                listaProveedores.add(c);
            }
            stm.close();
            rs.close();
            co.close();
        } catch (SQLException e) {
            System.out.println("Error:"+ e.getMessage());
        }

        return listaProveedores;
    }
}
