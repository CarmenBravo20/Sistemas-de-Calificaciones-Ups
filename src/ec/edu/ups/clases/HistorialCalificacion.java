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
    private int aprovechamiento1;
    private int examen1;
    private int aprovechamiento2;
    private int examen2;

    /**
     * Establece la informacion con respecto a la materia
     *
     * @param materia
     */
    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    /**
     * Establece la informacion con respecto al estudiante
     *
     * @param estudiante
     */
    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
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
     * Consige la informacion con respecto a la materia
     *
     * @return materia
     */
    public Materia getMateria() {
        return materia;
    }

    /**
     * Consige la informacion con respecto al estudiante
     *
     * @return estudiante
     */
    public Estudiante getEstudiante() {
        return estudiante;
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
        return "HistorialCalificacion{" + "materia=" + materia + ", estudiante=" + estudiante + ", aprovechamiento1=" + aprovechamiento1 + ", examen1=" + examen1 + ", aprovechamiento2=" + aprovechamiento2 + ", examen2=" + examen2 + '}';
    }

}
