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
public class Profesor extends Persona{

    /**
     * Atributos de la clase Profesor
     */
    private String titulo;
    private double salario;
    private String cargo;
    
    public Profesor(){
    

    }

    public Profesor(int codigo) {
        super(codigo);
    }

    public Profesor(int codigo, String nombre, String cedula) {
        super(codigo, nombre, cedula);
    }
    
//es un  constructor con todos los datos de la clase padre que en este caso seria Persona mas los datos  de la clase profesor

    public Profesor(String titulo, double salario, String cargo, int codigo, String nombre, String cedula, String telefono, String direccion, String correo, Sede sede) {
        super(codigo, nombre, cedula, telefono, direccion, correo, sede);
        this.titulo = titulo;
        this.salario = salario;
        this.cargo = cargo;
    }
    
    
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

    /**
     * Aqui se resume toda la informacion conseguida y se muestra en una sola
     * linea
     *
     * @return (String) informacion resumida
     */
    @Override
    public String toString() {
        return "Profesor{" + "titulo=" + titulo + ", salario=" + salario + ", cargo=" + cargo + '}';
    }

}
