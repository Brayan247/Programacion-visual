/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion1;

import com.istloja.conexionbd.Conexion1;
import com.istloja.controlador.personabd;
import com.istloja.modelo.Persona;
import com.istloja.vistas.GestionPersona;

/**
 *
 * @author Ordenador
 */
public class Ejecutar {

    public static void main(String[] args) {
        personabd personabd = new personabd();
        GestionPersona gpersona = new GestionPersona();
        gpersona.GestionPersona();
//        Persona persona = new Persona();
//        persona.setIdpersona(3);
//        persona.setCedula("1900681667");
//        persona.setNombre("Brayan Bladimir");
//        persona.setApellido("medina");
//        persona.setDireccion("El Pangui");
//        persona.setCorreo("Brayan@gmail.com");
//        persona.setTelefono("0968736083");
//        personabd.actualizarpersona(persona);
//
//        if (personabd.actualizarpersona(persona)) {
//            System.out.println("SE edito con exito");
//        } else {
//            System.out.println("No se pudo editar");
//        }
////    
//    }
    }
}
