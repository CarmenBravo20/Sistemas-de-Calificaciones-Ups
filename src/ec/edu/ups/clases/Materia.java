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
public class Materia {

    /**
     * Atributos de la clase Materia
     */
    private int codigo;
    private String nombre;
    private int numeroCreditos;
    private int numeroHoras;
    private int nivel;
    private Grupo grupo;
    private Profesor profesor;

    /**
     * Establece la informacion con respecto al codigo
     *
     * @param codigo
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * Establece la informacion con respecto al nombre
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Establece la informacion con respecto al numero de creditos
     *
     * @param numeroCreditos
     */
    public void setNumeroCreditos(int numeroCreditos) {
        this.numeroCreditos = numeroCreditos;
    }

    /**
     * Establece la informacion con respecto al numero de horas
     *
     * @param numeroHoras
     */
    public void setNumeroHoras(int numeroHoras) {
        this.numeroHoras = numeroHoras;
    }

    /**
     * Establece la informacion con respecto al nivel
     *
     * @param nivel
     */
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    /**
     * Establece la informacion con respecto al grupo
     *
     * @param grupo
     */
    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    /**
     * Establece la informacion con respecto al profesor
     *
     * @param profesor
     */
    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    /**
     * Consige la informacion con respecto al codigo
     *
     * @return int
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * Consige la informacion con respecto al nombre
     *
     * @return string
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Consige la informacion con respecto al numero de creditos
     *
     * @return int
     */
    public int getNumeroCreditos() {
        return numeroCreditos;
    }

    /**
     * Consige la informacion con respecto al numero de horas
     *
     * @return int
     */
    public int getNumeroHoras() {
        return numeroHoras;
    }

    /**
     * Consige la informacion con respecto al nivel
     *
     * @return int
     */
    public int getNivel() {
        return nivel;
    }

    /**
     * Consige la informacion con respecto al grupo
     *
     * @return grupo
     */
    public Grupo getGrupo() {
        return grupo;
    }

    /**
     * Consige la informacion con respecto al profesor
     *
     * @return profesor
     */
    public Profesor getProfesor() {
        return profesor;
    }

    /**
     * Aqui se resume toda la informacion conseguida y se muestra en una sola
     * linea
     *
     * @return (String) informacion resumida
     */
    @Override
    public String toString() {
        return "Materia{" + "codigo=" + codigo + ", nombre=" + nombre + ", numeroCreditos=" + numeroCreditos + ", numeroHoras=" + numeroHoras + ", nivel=" + nivel + ", grupo=" + grupo + ", profesor=" + profesor + '}';
    }

}
