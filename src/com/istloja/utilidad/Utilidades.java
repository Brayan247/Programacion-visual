/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.istloja.utilidad;

import javax.swing.JOptionPane;


public class Utilidades {

    public boolean validadorDeCedula(String cedula) {
        boolean cedulaCorrecta = false;
        try {
            if (cedula.length() == 10) // ConstantesApp.LongitudCedula
            {
                int tercerDigito = Integer.parseInt(cedula.substring(2, 3));
                if (tercerDigito < 6) {
                    int[] coefValCedula = {2, 1, 2, 1, 2, 1, 2, 1, 2};
                    int verificador = Integer.parseInt(cedula.substring(9, 10));
                    int suma = 0;
                    int digito = 0;
                    for (int i = 0; i < (cedula.length() - 1); i++) {
                        digito = Integer.parseInt(cedula.substring(i, i + 1)) * coefValCedula[i];
                        suma += ((digito % 10) + (digito / 10));
                    }

                    if ((suma % 10 == 0) && (suma % 10 == verificador)) {
                        cedulaCorrecta = true;
                    } else if ((10 - (suma % 10)) == verificador) {
                        cedulaCorrecta = true;
                    } else {
                        cedulaCorrecta = false;
                    }
                } else {
                    cedulaCorrecta = false;
                }
            } else {
                cedulaCorrecta = false;
            }
        } catch (NumberFormatException nfe) {
            cedulaCorrecta = false;
        } catch (Exception err) {
            System.out.println("Una excepcion ocurrio en el proceso de validadcion");
            cedulaCorrecta = false;
        }
        if (!cedulaCorrecta) {
            System.out.println("La Cédula ingresada es Incorrecta");
        }
        return cedulaCorrecta;
    }

    public boolean validarNumeros(String numero) {
        if (numero.isEmpty()) {
            return false;
        } else if (numero.length() < 10) {
            return false;
        }
        try {
            int validarNumero = Integer.parseInt(numero);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean validarnumero(String telefono) {
        boolean verificador = false;
        if (telefono.charAt(0) == '0') {
            verificador = true;
            return verificador;
        }
        return false;
    }

    public boolean validarcorreo(String correo) {
        boolean verificador = false;
            for (int i = 0; i < correo.length(); i++) {
                if (correo.charAt(i) =='@') {
                    verificador = true;
                    return verificador;
                }
            }
        return false;
    }

    public static void main(String[] args) {
        Utilidades utilidad = new Utilidades();
        String correo = "brayanchamico2014gmail.com";
        String telefono = "969736083";
        if (!utilidad.validarcorreo(correo)) {
            System.out.println("El campo correo no tiene arroba");
        } else {
            System.out.println("tiene arroba");
        }
        if (!utilidad.validarnumero(telefono)) {
            System.out.println("El telefono no empieza con 0");
        } else {
            System.out.println("El telefono empieza con 0");
        }
    }

}
