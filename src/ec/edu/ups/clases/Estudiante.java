/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

import java.util.ArrayList;
import java.util.List;

/**
 * @since 2019
 * @version 2.0
 * @author Carmen Bravo
 */
// Nombre de la clase
public class Estudiante extends Persona{
    ////////////////////////////////////////////////////////////////////////////////
    //Declaracion de metodos// 

    private Carrera carrera;
    private List<HistorialCalificacionEstudiante>calificacion;

    
   

          
    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }
    
    public void agregarCalificacion(HistorialCalificacionEstudiante calificacion){
         this.calificacion.add(calificacion);
    }

    public Estudiante(int codigo) {
        super(codigo);
    }

    public Estudiante(int codigo, String nombre, String cedula) {
        super(codigo, nombre, cedula);
    }

    public Estudiante(int codigo, String nombre, String cedula, String telefono, String direccion, String correo) {
        super(codigo, nombre, cedula, telefono, direccion, correo);
        this.carrera = carrera;
        calificacion = new ArrayList<>();
    }
    
    
     @Override
    public String toString() {
        return "Estudiante: " + "\n Nombre: "+ this.getNombre() + "\n Cedula: " + this.getCedula() + "\n Codigo: " + this.getCodigo() + "\n Direccion: " 
                + this.getDireccion()+ "\n Telefono: " + this.getTelefono() +"\n Carrera: " + carrera + "\n calificaciones: " + calificacion ;
    }
}

    
  
    
    
   

    
    
   

    

    

