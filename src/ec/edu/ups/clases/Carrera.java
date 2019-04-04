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

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMaterias(List<Materia> materias) {
        this.materias = materias;
    }

    public void setNumeroSemestres(int numeroSemestres) {
        this.numeroSemestres = numeroSemestres;
    }

    public void setNumeroEstudiantes(int numeroEstudiantes) {
        this.numeroEstudiantes = numeroEstudiantes;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Materia> getMaterias() {
        return materias;
    }

    public int getNumeroSemestres() {
        return numeroSemestres;
    }

    public int getNumeroEstudiantes() {
        return numeroEstudiantes;
    }

    public String getTitulo() {
        return titulo;
    }

    
}