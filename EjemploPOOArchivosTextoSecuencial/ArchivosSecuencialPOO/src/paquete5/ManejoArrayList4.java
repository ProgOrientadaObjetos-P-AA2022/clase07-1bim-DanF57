/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

import java.util.ArrayList;
import paquete1.Empresa;

/**
 *
 * @author reroes
 */
public class ManejoArrayList4 {
    //Copia del 1

    public static void main(String[] args) {
        Empresa e1 = new Empresa("ILE", "Loja");
        Empresa e2 = new Empresa("Situ", "Quito");
        Empresa e3 = new Empresa("Wilco", "Zamora");
        
        ArrayList<Empresa> ep = new ArrayList<>();
        ep.add(e1);
        ep.add(e2);
        ep.add(e3);
        
        for (int i = 0; i < ep.size(); i++) {
            Empresa e = ep.get(i);
            System.out.printf("%s - %s\n", e.obtenerNombre(), 
                    e.obtenerCiudad());
        }
    }
}
