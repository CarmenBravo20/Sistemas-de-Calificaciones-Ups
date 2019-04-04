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
public class Estudiante {

    /**
     * Atributos de la clase Estudiante
     */
    private Carrera carrera;

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
