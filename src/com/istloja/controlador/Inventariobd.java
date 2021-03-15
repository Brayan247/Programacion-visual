package com.istloja.controlador;

import com.istloja.conexionbd.Conexion1;
import com.istloja.modelo.Inventario;
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
public class Inventariobd {

    public boolean GuardarInventario(Inventario producto) {
        boolean registrar = false;
        Statement stm = null;
        Connection con = null;
        String sql = "INSERT INTO `bdejercicio1`.`inventario` (`Id_Inventario`, `codigo_prod`, `descripcion`, `Precios_compra`, `precio_venta`, `can_productos`) VALUES ('" + String.valueOf(producto.getIdInventario()) + "', '" + producto.getCodigoProducto() + "', '" + producto.getDescripcion() + "', '" + producto.getPrecioCompra() + "', '" + producto.getPrecioVenta() + "', '" + String.valueOf(producto.getCantidadProductos()) + "');";
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

    public boolean EliminarInventario(Inventario producto) {
        boolean eliminar = false;
        Statement stm = null;
        Connection con = null;
        String sql = "DELETE FROM `bdejercicio1`.`inventario` WHERE (`Id_Inventario` = '" + String.valueOf(producto.getIdInventario()) + "');";
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

    public boolean EditarInventario(Inventario producto) {
        boolean editar = false;
        Statement stm = null;
        Connection con = null;
        String sql = "UPDATE `bdejercicio1`.`inventario` SET  `codigo_prod` = '" + producto.getCodigoProducto() + "', `descripcion` = '" + producto.getDescripcion() + "', `Precios_compra` = '" + producto.getPrecioCompra() + "', `precio_venta` = '" + producto.getPrecioVenta() + "', `can_productos` = '" + producto.getCantidadProductos() + "' WHERE (`Id_Inventario` = '" + producto.getIdInventario() + "');";
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

    public List<Inventario> ObtenerInventario() {
        Connection co = null;
        Statement stm = null;
        //Sentencia de JDBC para obtener valores de la base de datos.
        ResultSet rs = null;
        String sql = "SELECT * FROM bdejercicio1.inventario;";
        List<Inventario> listaInventario = new ArrayList<Inventario>();
        try {
            co = new Conexion1().ConexionMysql();
            stm = co.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                Inventario c = new Inventario();
                c.setIdInventario(rs.getInt(1));
                c.setCodigoProducto(rs.getString(2));
                c.setDescripcion(rs.getString(3));
                c.setPrecioCompra(rs.getString(4));
                c.setPrecioVenta(rs.getString(5));
                c.setCantidadProductos(rs.getString(6));
                listaInventario.add(c);
            }
            stm.close();
            rs.close();
            co.close();
        } catch (SQLException e) {
            System.out.println("Error:" + e.getMessage());
        }
        return listaInventario;
    }

    public List<Inventario> ObtenerInventarioCodigoLista(String Codigo) {
        Connection co = null;
        Statement stm = null;
        //Sentencia de JDBC para obtener valores de la base de datos.
        ResultSet rs = null;
        String sql = "SELECT * FROM bdejercicio1.inventario where codigo_prod like '%" + Codigo + "%';";
        List<Inventario> listaInventario = new ArrayList<>();
        try {
            co = new Conexion1().ConexionMysql();
            stm = co.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                Inventario c = new Inventario();
                c.setIdInventario(rs.getInt(1));
                c.setCodigoProducto(rs.getString(2));
                c.setDescripcion(rs.getString(3));
                c.setPrecioCompra(rs.getString(4));
                c.setPrecioVenta(rs.getString(5));
                c.setCantidadProductos(rs.getString(6));
                listaInventario.add(c);
            }
            stm.close();
            rs.close();
            co.close();
        } catch (SQLException e) {
            System.out.println("Error:" + e.getMessage());
        }
        return listaInventario;
    }

    public List<Inventario> ObtenerInventarioCantidadLista(String Cantidad) {
        Connection co = null;
        Statement stm = null;
        //Sentencia de JDBC para obtener valores de la base de datos.
        ResultSet rs = null;
        String sql = "SELECT * FROM bdejercicio1.inventario where can_productos like '%" + Cantidad + "%';";
        List<Inventario> listaInventario = new ArrayList<>();
        try {
            co = new Conexion1().ConexionMysql();
            stm = co.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                Inventario c = new Inventario();
                c.setIdInventario(rs.getInt(1));
                c.setCodigoProducto(rs.getString(2));
                c.setDescripcion(rs.getString(3));
                c.setPrecioCompra(rs.getString(4));
                c.setPrecioVenta(rs.getString(5));
                c.setCantidadProductos(rs.getString(6));
                listaInventario.add(c);
            }
            stm.close();
            rs.close();
            co.close();
        } catch (SQLException e) {
            System.out.println("Error:" + e.getMessage());
        }
        return listaInventario;
    }

    public Inventario getInventarioCodigo(String codigo) {
        Connection co = null;
        Statement stm = null;
        //Sentencia de JDBC para obtener valores de la base de datos.
        ResultSet rs = null;
        Inventario c = null;
        String sql = "SELECT * FROM bdejercicio1.inventario where codigo_prod = " + codigo + ";";
        try {
            co = new Conexion1().ConexionMysql();
            stm = co.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                c = new Inventario();
                c.setIdInventario(rs.getInt(1));
                c.setCodigoProducto(rs.getString(2));
                c.setDescripcion(rs.getString(3));
                c.setPrecioCompra(rs.getString(4));
                c.setPrecioVenta(rs.getString(5));
                c.setCantidadProductos(rs.getString(6));
            }
            stm.close();
            rs.close();
            co.close();
        } catch (SQLException e) {
            System.out.println("Error:" + e.getMessage());
        }

        return c;
    }
}
