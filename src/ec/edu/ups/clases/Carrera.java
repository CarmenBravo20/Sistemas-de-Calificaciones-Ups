/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

import java.util.List;

/**
 *
 * @author Carmen Bravo
 */
//Nombre de la clase
public class Carrera {

    /**
     * Atributos de la clase Carrera
     */
    private int codigo;
    private String nombre;
    private List<Materia> materias;
    private int numeroSemestres;
    private int numeroEstudiantes;
    private String titulo;

    /**
     * Establece la informacion con respecto a codigo
     *
     * @param codigo
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * Establece la informacion con respecto a nombre
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Establece la informacion con respecto a la materia
     *
     * @param materias
     */
    public void setMaterias(List<Materia> materias) {
        this.materias = materias;
    }

    /**
     * Establece la informacion con respecto al numero de semestres
     *
     * @param numeroSemestres
     */
    public void setNumeroSemestres(int numeroSemestres) {
        this.numeroSemestres = numeroSemestres;
    }

    /**
     * Establece la informacion con respecto al numero de estudiantes
     *
     * @param numeroEstudiantes
     */
    public void setNumeroEstudiantes(int numeroEstudiantes) {
        this.numeroEstudiantes = numeroEstudiantes;
    }

    /**
     * Establece Consige la informacion con respecto al titulo
     *
     * @param titulo
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Consige la informacion con respecto al titulo
     *
     * @return string
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
     * Consige la informacion con respecto a la materia
     *
     * @return list
     */
    public List<Materia> getMaterias() {
        return materias;
    }

    /**
     * Consige la informacion con respecto al numero de semestre
     *
     * @return int
     */
    public int getNumeroSemestres() {
        return numeroSemestres;
    }

    /**
     * Consige la informacion con respectol numero de estudiantesz
     *
     * @return int
     */
    public int getNumeroEstudiantes() {
        return numeroEstudiantes;
    }

    /**
     * Consige la informacion con respecto al titulo
     *
     * @return string
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Aqui se resume toda la informacion conseguida y se muestra en una sola
     * linea
     *
     * @return (String) informacion resumida
     */
    @Override
    public String toString() {
        return "Carrera{" + "codigo=" + codigo + ", nombre=" + nombre + ", materias=" + materias + ", numeroSemestres=" + numeroSemestres + ", numeroEstudiantes=" + numeroEstudiantes + ", titulo=" + titulo + '}';
    }

}
