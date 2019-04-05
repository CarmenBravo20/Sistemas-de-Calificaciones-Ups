/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

/**
 * @since 2019
 * @version 2.0
 * @author Carmen Bravo
 */
// Nombre de la clase
public class Estudiante extends Persona{

    /**
     * Atributos de la clase Estudiante
     */
    private Carrera carrera;
    
    
    public Estudiante (){
        
    
}  
    
    
    public Estudiante(int codigo){
        super(codigo);
        
    }
    // constructor de la clase estudiante
    public Estudiante(int codigo, String nombre, String cedula){
        // hace referencia a los atributosde mi padre y le pasa al constructor con esoso atributos
        super(codigo, nombre, cedula);
    }

    //es un constructor con todos  los datos de la clase padre persona y  mas los de la clase Estudiante
    public Estudiante(Carrera carrera, int codigo, String nombre, String cedula, String telefono, String direccion, String correo, Sede sede) {
        super(codigo, nombre, cedula, telefono, direccion, correo, sede);
        this.carrera = carrera;
    }
    
    
   

    /**
     * Consige la informacion con respecto a carrera
     *
     * @param carrera
     */
    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

    /**
     * establecela informacion con respecto a carrera
     *
     * @return Carrera
     */
    public Carrera getCarrera() {
        return carrera;
    }
    
    /**
     * Aqui se resume toda la informacion conseguida y se muestra en una sola
     * linea
     *
     * @return (String) informacion resumida
     */

    @Override
    public String toString() {
        return "Estudiante{" + "carrera=" + carrera + '}';
    }

    
}
