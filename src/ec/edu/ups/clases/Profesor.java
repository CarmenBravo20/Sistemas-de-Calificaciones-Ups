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
public class Profesor {

    /**
     * Atributos de la clase Profesor
     */

    private String titulo;
    private double salario;
    private String cargo;

    /**
     * Establece la informacion con respecto al titulo
     *
     * @param titulo
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Establece la informacion con respecto al salario
     *
     * @param salario
     */

    public void setSalario(double salario) {
        this.salario = salario;
    }

    /**
     * Establece la informacion con respecto al cargo
     *
     * @param cargo
     */

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    /**
     * Consige la informacion con respecto al titulo
     *
     * @return String
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Consige la informacion con respecto al salario
     *
     * @return double
     */

    public double getSalario() {
        return salario;
    }

    /**
     * Consige la informacion con respecto al cargo
     *
     * @return String
     */

    public String getCargo() {
        return cargo;
    }

}
