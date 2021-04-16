package com.istloja.controlador;

import com.istloja.conexionbd.Conexion1;
import com.istloja.modelo.Inventario;
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
public class Inventariobd {
    
    public Utilidades utilidades;

    public Inventariobd() {
        utilidades = new Utilidades();
    }

    public boolean GuardarInventario(Inventario producto) {
        boolean registrar = false;
        Statement stm = null;
        Connection con = null;
        String sql = "INSERT INTO `bdejercicio1`.`inventario` (`Id_Inventario`, `codigo_prod`, `descripcion`, `can_productos`, `fecha_registro`, `fecha_actualizacion`, `fecha_caducidad`, `precio_compra_sin_iva`, `precio_compra_con_iva`, `precio_mayorista`, `precio_cliente_fijo`, `precio_cliente_normal`) VALUES ('"+String.valueOf(producto.getIdInventario())+"', '"+producto.getCodigoProducto()+"', '"+producto.getDescripcion()+"', '"+producto.getCantidadProductos()+"', '"+utilidades.devolverFecha(producto.getFechaRegistro())+"', '"+utilidades.devolverFecha(producto.getFechaActualizacion())+"', '"+utilidades.devolverFecha(producto.getFechaCaducidad())+"', '"+producto.getPrecioCompraSinIVA()+"', '"+producto.getPrecioCompraConIV()+"', '"+producto.getPrecioMayorista()+"', '"+producto.getPrecioClienteFijo()+"', '"+producto.getPrecioClienteNormal()+"');";
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
        String sql = "DELETE FROM `bdejercicio1`.`inventario` WHERE (`Id_Inventario` = '"+String.valueOf(producto.getIdInventario())+"');";
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
        String sql = "UPDATE `bdejercicio1`.`inventario` SET `descripcion` = '"+producto.getDescripcion()+"', `can_productos` = '"+producto.getCantidadProductos()+"', `fecha_actualizacion` = '"+utilidades.devolverFecha(producto.getFechaActualizacion())+"', `precio_compra_sin_iva` = '"+producto.getPrecioCompraSinIVA()+"', `precio_compra_con_iva` = '"+producto.getPrecioCompraConIV()+"', `precio_mayorista` = '"+producto.getPrecioMayorista()+"', `precio_cliente_fijo` = '"+producto.getPrecioClienteFijo()+"', `precio_cliente_normal` = '"+producto.getPrecioClienteNormal()+"' WHERE (`Id_Inventario` = '"+String.valueOf(producto.getIdInventario())+"');";
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
                c.setCantidadProductos(rs.getString(4));
                c.setFechaRegistro(rs.getDate(5));
                c.setFechaActualizacion(rs.getDate(6));
                c.setFechaCaducidad(rs.getDate(7));
                c.setPrecioCompraSinIVA(rs.getDouble(8));
                c.setPrecioCompraConIV(rs.getDouble(9));
                c.setPrecioMayorista(rs.getDouble(10));
                c.setPrecioClienteFijo(rs.getDouble(11));
                c.setPrecioClienteNormal(rs.getDouble(12));
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
                c.setCantidadProductos(rs.getString(4));
                c.setFechaRegistro(rs.getDate(5));
                c.setFechaActualizacion(rs.getDate(6));
                c.setFechaCaducidad(rs.getDate(7));
                c.setPrecioCompraSinIVA(rs.getDouble(8));
                c.setPrecioCompraConIV(rs.getDouble(9));
                c.setPrecioMayorista(rs.getDouble(10));
                c.setPrecioClienteFijo(rs.getDouble(11));
                c.setPrecioClienteNormal(rs.getDouble(12));
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
                c.setCantidadProductos(rs.getString(4));
                c.setFechaRegistro(rs.getDate(5));
                c.setFechaActualizacion(rs.getDate(6));
                c.setFechaCaducidad(rs.getDate(7));
                c.setPrecioCompraSinIVA(rs.getDouble(8));
                c.setPrecioCompraConIV(rs.getDouble(9));
                c.setPrecioMayorista(rs.getDouble(10));
                c.setPrecioClienteFijo(rs.getDouble(11));
                c.setPrecioClienteNormal(rs.getDouble(12));
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
    public Inventario ObtenerInventarioconcodigo(String codigo) {
        Connection co = null;
        Statement stm = null;
        //Sentencia de JDBC para obtener valores de la base de datos.
        ResultSet rs = null;
        Inventario c = null;
        String sql = "SELECT * FROM bdejercicio1.inventario where codigo_prod like '%" + codigo + "%';";
        try {
            co = new Conexion1().ConexionMysql();
            stm = co.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                c = new Inventario();
                c.setIdInventario(rs.getInt(1));
                c.setCodigoProducto(rs.getString(2));
                c.setDescripcion(rs.getString(3));
                c.setCantidadProductos(rs.getString(4));
                c.setFechaRegistro(rs.getDate(5));
                c.setFechaActualizacion(rs.getDate(6));
                c.setFechaCaducidad(rs.getDate(7));
                c.setPrecioCompraSinIVA(rs.getDouble(8));
                c.setPrecioCompraConIV(rs.getDouble(9));
                c.setPrecioMayorista(rs.getDouble(10));
                c.setPrecioClienteFijo(rs.getDouble(11));
                c.setPrecioClienteNormal(rs.getDouble(12));
            }
            stm.close();
            rs.close();
            co.close();
        } catch (SQLException e) {
            System.out.println("Error:" + e.getMessage());
        }
        return c;
    }
    
    public List<Inventario> ObtenerInventarioDescripcionLista(String Descripcion) {
        Connection co = null;
        Statement stm = null;
        //Sentencia de JDBC para obtener valores de la base de datos.
        ResultSet rs = null;
        String sql = "SELECT * FROM bdejercicio1.inventario where descripcion like '%" + Descripcion + "%';";
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
                c.setCantidadProductos(rs.getString(4));
                c.setFechaRegistro(rs.getDate(5));
                c.setFechaActualizacion(rs.getDate(6));
                c.setFechaCaducidad(rs.getDate(7));
                c.setPrecioCompraSinIVA(rs.getDouble(8));
                c.setPrecioCompraConIV(rs.getDouble(9));
                c.setPrecioMayorista(rs.getDouble(10));
                c.setPrecioClienteFijo(rs.getDouble(11));
                c.setPrecioClienteNormal(rs.getDouble(12));
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

}
