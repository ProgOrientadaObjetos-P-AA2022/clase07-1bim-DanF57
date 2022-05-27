/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

import java.util.ArrayList;
import paquete1.Profesor;
import paquete1.Calificacion;

/**
 *
 * @author reroes
 */
public class ManejoArrayList3 {
    //Copia del 1

    public static void main(String[] args) {
        
        Calificacion c1 = new Calificacion(10, "Matematica");
        Calificacion c2 = new Calificacion(8, "Fisica");

        Profesor prof1 = new Profesor("Joseph Jimenez", "facturado");
        Profesor prof2 = new Profesor("David Jones", "nombramiento");

        System.out.println("-----------------------------");

        // ArrayList
        ArrayList<Profesor> profesores2 = new ArrayList<>();
        profesores2.add(prof1);
        profesores2.add(prof2);

        c1.establecerProfesor(prof1);
        c2.establecerProfesor(prof2);

        // ArrayList
        ArrayList<Calificacion> califica = new ArrayList<>();
        califica.add(c1);
        califica.add(c2);

        for (int i = 0; i < califica.size(); i++) {
            //Nombre Profesor
            //Materia 
            //Nota
            //Profesor p = profesores2.get(i);
            /*
            Calificacion c = califica.get(i);
            System.out.printf("%s\n%s - %s\n", c.obtenerProfesor(), 
                    c.obtenerNombreMateria(),
                    c.obtenerNota());
            */
            System.out.printf("%s - %s - (%.2f)\n", califica.get(i).obtenerProfesor().obtenerNombre()
                            ,califica.get(i).obtenerNombreMateria(), califica.get(i).obtenerNota());
        }

    }
}
