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

//Nombre de la clase
public class HistorialCalificacion {
    
    /**
     * Atributos de la clase HistorialCalificacion
     */
    private Materia materia;
    private Estudiante estudiante;
    private int aprovechamiento;
    private int examen1;
    private int aprovechamiento2;
    private int examen2;

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public void setAprovechamiento(int aprovechamiento) {
        this.aprovechamiento = aprovechamiento;
    }

    public void setExamen1(int examen1) {
        this.examen1 = examen1;
    }

    public void setAprovechamiento2(int aprovechamiento2) {
        this.aprovechamiento2 = aprovechamiento2;
    }

    public void setExamen2(int examen2) {
        this.examen2 = examen2;
    }

    public Materia getMateria() {
        return materia;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public int getAprovechamiento() {
        return aprovechamiento;
    }

    public int getExamen1() {
        return examen1;
    }

    public int getAprovechamiento2() {
        return aprovechamiento2;
    }

    public int getExamen2() {
        return examen2;
    }
            
    
    
    
}
