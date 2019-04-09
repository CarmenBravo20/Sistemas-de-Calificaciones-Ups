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
public class HistorialCalificacionEstudiante {
    //crear una lista  para cada estudiante crear una lista  de historialcCALIFICACION 
    //agregar materia de programacion  y poner las calificaciones  se usa el set, se hace 

    /**
     * Atributos de la clase HistorialCalificacion
     */
    //private Materia materia;
   // private Estudiante estudiante;
    private int aprovechamiento1;
    private int examen1;
    private int aprovechamiento2;
    private int examen2;

    public HistorialCalificacionEstudiante(int aprovechamiento1, int examen1, int aprovechamiento2, int examen2) {
        this.aprovechamiento1 = aprovechamiento1;
        this.examen1 = examen1;
        this.aprovechamiento2 = aprovechamiento2;
        this.examen2 = examen2;
    }

 
    

    /**
     * Establece la informacion con respecto al aprovechamiento1
     *
     * @param aprovechamiento
     */
    public void setAprovechamiento1(int aprovechamiento1) {
        this.aprovechamiento1 = aprovechamiento1;
    }

    /**
     * Establece la informacion con respecto al examen1
     *
     * @param examen1
     */
    public void setExamen1(int examen1) {
        this.examen1 = examen1;
    }

    /**
     * Establece la informacion con respecto al aprovechamiento2
     *
     * @param aprovechamiento2
     */
    public void setAprovechamiento2(int aprovechamiento2) {
        this.aprovechamiento2 = aprovechamiento2;
    }

    /**
     * Establece la informacion con respecto al examen2
     *
     * @param examen2
     */
    public void setExamen2(int examen2) {
        this.examen2 = examen2;
    }

    /**
     * Consige la informacion con respecto al aprovechamiento1
     *
     * @return int
     */
    public int getAprovechamiento1() {
        return aprovechamiento1;
    }

    /**
     * Consige la informacion con respecto al examen1
     *
     * @return int
     */
    public int getExamen1() {
        return examen1;
    }

    /**
     * Consige la informacion con respecto al aprovechamiento2
     *
     * @return int
     */
    public int getAprovechamiento2() {
        return aprovechamiento2;
    }

    /**
     * Consige la informacion con respecto al examen2
     *
     * @return int
     */
    public int getExamen2() {
        return examen2;
    }
       /**
     * Aqui se resume toda la informacion conseguida y se muestra en una sola
     * linea
     *
     * @return (String) informacion resumida
     */
    

    @Override
    public String toString() {
        return "HistorialCalificacionEstudiante{" + "aprovechamiento1=" + aprovechamiento1 + ", examen1=" + examen1 + ", aprovechamiento2=" + aprovechamiento2 + ", examen2=" + examen2 + '}';
    }

   
 
    

}
