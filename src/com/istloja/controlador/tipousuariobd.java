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
import com.istloja.modelo.TipoUsuario;
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
public class tipousuariobd {

    public boolean GuardarUsuario(TipoUsuario tipousuario) {
        boolean registrar = false;
        Statement stm = null;
        Connection con = null;
        String sql = "INSERT INTO `bdejercicio1`.`tipo_usuario` (`idtipo_usuario`, `tipo_usuario_sistema`, `id_persona_sistema`, `contraseña`) VALUES ('"+String.valueOf(tipousuario.getIdTipoUsuario())+"', '"+tipousuario.getTipoUsuarioSistema()+"', '"+tipousuario.getIdPersonaSistema()+"', '"+tipousuario.getContraseña()+"');";
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

    public boolean EliminarUsuario(TipoUsuario tipousuario) {
        boolean eliminar = false;
        Statement stm = null;
        Connection con = null;
        String sql = "DELETE FROM `bdejercicio1`.`tipo_usuario` WHERE (`idtipo_usuario` = '"+String.valueOf(tipousuario.getIdTipoUsuario())+"');";
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

    public boolean EditarUsuario(TipoUsuario tipousuario) {
        boolean editar = false;
        Statement stm = null;
        Connection con = null;
        String sql = "UPDATE `bdejercicio1`.`tipo_usuario` SET `tipo_usuario_sistema` = '"+tipousuario.getTipoUsuarioSistema()+"', `contraseña` = '"+tipousuario.getContraseña()+"' WHERE (`idtipo_usuario` = '"+String.valueOf(tipousuario.getIdTipoUsuario())+"');";
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

    public List<TipoUsuario> ObtenerUsuarios() {
        Connection co = null;
        Statement stm = null;
        //Sentencia de JDBC para obtener valores de la base de datos.
        ResultSet rs = null;
        String sql = "select * from bdejercicio1.tipo_usuario;";
        List<TipoUsuario> listaPersonas = new ArrayList<TipoUsuario>();
        try {
            co = new Conexion1().ConexionMysql();
            stm = co.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                TipoUsuario c = new TipoUsuario();
                c.setIdTipoUsuario(rs.getInt(1));
                c.setTipoUsuarioSistema(rs.getInt(2));
                c.setIdPersonaSistema(rs.getInt(3));
                c.setContraseña(rs.getString(4));
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

    

}
