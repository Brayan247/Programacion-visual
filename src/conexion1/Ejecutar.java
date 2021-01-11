/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion1;

import com.istloja.conexionbd.Conexion1;
import com.istloja.controlador.personabd;
import com.istloja.modelo.Persona;

/**
 *
 * @author Ordenador
 */
public class Ejecutar {

    public static void main(String[] args) {
        personabd personabd = new personabd();
        Persona persona = new Persona();
        persona.setIdpersona(7);
        persona.setCedula("1900681667");
        persona.setNombre("Brayan");
        persona.setApellido("Chamico");
        persona.setDireccion("El Pangui");
        persona.setCorreo("Brayan@gmail.com");
        persona.setTelefono("0969736083");
//            CREAR
//        if (personabd.crearpersona(persona)) {
//            System.out.println("Persona guardada");
//        } else {
//            System.out.println("Error al guardar");
//        }
//            ELIMINAR
        if (personabd.eliminarpersona(persona)) {
            System.out.println("pudo eliminar con exito");
        } else {
            System.out.println("no pudo eliminar");
        }
    }
}
