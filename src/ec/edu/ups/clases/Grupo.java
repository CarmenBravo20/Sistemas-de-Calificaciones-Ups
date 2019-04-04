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
public class Grupo {

    /**
     * Atributos de la clase Grupo
     */
    private int codigo;
    private String nombre;
    private int cupo;

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
     * Establece la informacion con respecto al cupo
     *
     * @param cupo
     */
    public void setCupo(int cupo) {
        this.cupo = cupo;
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
     * Consige la informacion con respecto al cupo
     *
     * @return int
     */
    public int getCupo() {
        return cupo;
    }

    /**
     * Aqui se resume toda la informacion conseguida y se muestra en una sola
     * linea
     *
     * @return (String) informacion resumida
     */
    @Override
    public String toString() {
        return "Grupo{" + "codigo=" + codigo + ", nombre=" + nombre + ", cupo=" + cupo + '}';
    }

}
