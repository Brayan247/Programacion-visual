/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.istloja.modelo;

/**
 *
 * @author Ordenador
 */
public class TipoUsuario {
    private int idTipoUsuario;
    private int TipoUsuarioSistema;
    private int IdPersonaSistema;
    private String contraseña;

    public TipoUsuario(int idTipoUsuario, int TipoUsuarioSistema, int IdPersonaSistema, String contraseña) {
        this.idTipoUsuario = idTipoUsuario;
        this.TipoUsuarioSistema = TipoUsuarioSistema;
        this.IdPersonaSistema = IdPersonaSistema;
        this.contraseña = contraseña;
    }

    public TipoUsuario() {
    }

    public int getIdTipoUsuario() {
        return idTipoUsuario;
    }

    public void setIdTipoUsuario(int idTipoUsuario) {
        this.idTipoUsuario = idTipoUsuario;
    }

    public int getTipoUsuarioSistema() {
        return TipoUsuarioSistema;
    }

    public void setTipoUsuarioSistema(int TipoUsuarioSistema) {
        this.TipoUsuarioSistema = TipoUsuarioSistema;
    }

    public int getIdPersonaSistema() {
        return IdPersonaSistema;
    }

    public void setIdPersonaSistema(int IdPersonaSistema) {
        this.IdPersonaSistema = IdPersonaSistema;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public String toString() {
        return "TipoUsuario{" + "idTipoUsuario=" + idTipoUsuario + ", TipoUsuarioSistema=" + TipoUsuarioSistema + ", IdPersonaSistema=" + IdPersonaSistema + ", contrase\u00f1a=" + contraseña + '}';
    }
    
    
}
