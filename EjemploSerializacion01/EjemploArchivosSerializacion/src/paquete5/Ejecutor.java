/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

import paquete5.Hospital;
import paquete5.EscrituraArchivoSecuencial;
import paquete5.LecturaArchivoSecuencial;

public class Ejecutor {

    public static void main(String[] args) {

        // nombre del archivo
        String nombreArchivo = "hospitales.data";
        
        Hospital h1 = new Hospital("Abendano", 100, 1570.00);
        Hospital h2 = new Hospital("Ayora", 80, 1500.00);
        Hospital h3 = new Hospital("UTPL", 70, 2448.00);
        
        Hospital[] lista = {h1, h2, h3};
        
        EscrituraArchivoSecuencial archivo = 
                new EscrituraArchivoSecuencial(nombreArchivo);
        
        for (int i = 0; i < lista.length; i++) {
            // establecer el valor del atributo registro
            archivo.establecerRegistro(lista[i]);
            // establecer en el archivo el atributo del registro
            archivo.establecerSalida();
        }
        archivo.cerrarArchivo();
        
        LecturaArchivoSecuencial lectura = 
                new LecturaArchivoSecuencial(nombreArchivo);
        lectura.establecerHospitales();
        System.out.println(lectura);
    }
}
