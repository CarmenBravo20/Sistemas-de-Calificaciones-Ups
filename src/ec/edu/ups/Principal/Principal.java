/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.Principal;

import ec.edu.ups.clases.Estudiante;

/**
 * 
 * @author Carmen Bravo
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Estudiante estudiante=new Estudiante();
        estudiante.setCodigo(1);
        estudiante.setNombre("Alexandra");
        estudiante.setCedula("0107593873");
        estudiante.setTelefono("3014167");
        estudiante.setDireccion("Av. pasaje y Carlos Molina");
        estudiante.setCorreo("alexandra5620000@gmail.com");
        
    }
    
    
}
