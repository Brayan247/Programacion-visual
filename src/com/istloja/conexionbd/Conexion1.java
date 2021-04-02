/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.istloja.conexionbd;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Ordenador
 */
public class Conexion1 {

 private static final String nbase = "bdejercicio1";
    private static final String usuario = "root";
    private static final String contrasenia = "luna00692";
    private static final String comando = "jdbc:mysql://localhost:3306/" + nbase +"?serverTimezone=UTC";
    
    public static void main(String[] args) {
        Conexion1 co = new Conexion1();
        co.ConexionMysql();
    }
    
private Connection conect = null;

    public Connection ConexionMysql() {
        
        try {
            conect = DriverManager.getConnection(comando, usuario, contrasenia);
            if (conect != null) {
                return conect;
            }
        } catch (Exception e) {
            System.out.println("No se pudo conectar" + e.getMessage());
        }
        return null;
    }
    
}
