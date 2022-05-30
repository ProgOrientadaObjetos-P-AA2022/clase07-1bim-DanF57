/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;


public class Ejecutor2 {

    public static void main(String[] args) {

        // nombre del archivo
        String nombreArchivo = "hospitales.data";
        String nombre_buscar = "UTPL";
        Hospital hospital_buscar;
        LecturaArchivoSecuencial lectura = 
                new LecturaArchivoSecuencial(nombreArchivo);
        lectura.establecerIdentificador(nombre_buscar);
        lectura.establecerHospitalBuscado();
        hospital_buscar = lectura.obtenerProfesorBuscado();
        if(hospital_buscar!=null){
            System.out.println(hospital_buscar);
        }else{
            System.out.println("Hospital no encontrado");
        }
        
    }
}
