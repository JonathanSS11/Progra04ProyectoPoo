/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progra04proyectopoo;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Progra04ProyectoPoo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //objeto 0001
        Cuenta cuenta001 = new Cuenta("Jonathan", "Salgado", 10, 1000.0);
        
        //objeto 002
        Cuenta cuenta002 = new Cuenta();
        cuenta002.setApellido("Salgado");
        cuenta002.setNombre("Jonathan");
        cuenta002.setEdad(19);
        cuenta002.setCantidad(456.89);
        
        System.out.println(cuenta002.getNombre());
        System.out.println(cuenta002.getApellido());
        System.out.println(cuenta002.getEdad());
        System.out.println(cuenta002.getCantidad());
    }
    
}
