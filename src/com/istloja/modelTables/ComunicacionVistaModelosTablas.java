/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.istloja.modelTables;
import com.istloja.modelo.Inventario;
import com.istloja.modelo.Persona;
import com.istloja.modelo.Proveedores;
import com.istloja.modelo.TipoUsuario;
/**
 *
 * @author Ordenador
 */
public interface ComunicacionVistaModelosTablas {
    void clickPersona(Persona p);
    void clickInventario(Inventario p);
    void clickProveedores(Proveedores p);
    void clickTipoUsuario(TipoUsuario p);
}
