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
public class Persona {

    /**
     * Atributos de la clase Persona
     */
    private int codigo;
    private String nombre;
    private String cedula;
    private String telefono;
    private String direccion;
    private String correo;
    //private Sede sede;

    
    
    // son constructores
    public Persona(){
        
    }

    public Persona(int codigo, String nombre, String cedula) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.cedula = cedula;
    }
    
    

    public Persona(int codigo) {
        this.codigo = codigo;
    }

    //constructor de todos  atributos del padre
    public Persona(int codigo, String nombre, String cedula, String telefono, String direccion, String correo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.cedula = cedula;
        this.telefono = telefono;
        this.direccion = direccion;
        this.correo = correo;
    }
    
    

   
    
    
    
    
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
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Establece la informacion con respecto a la cedula
     *
     * @param cedula
     */
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    /**
     * Establece la informacion con respecto al telefono
     *
     * @param telefono
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * Establece la informacion con respecto a la direccion
     *
     * @param direccion
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Establece la informacion con respecto al correo
     *
     * @param correo
     */
    public void setCorreo(String correo) {
        this.correo = correo;
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
     * Consige la informacion con respecto al cedula
     *
     * @return cedula
     */
    public String getCedula() {
        return cedula;
    }

    /**
     * Consige la informacion con respecto al telefono
     *
     * @return string
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Consige la informacion con respecto al correo
     *
     * @return string
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Consige la informacion con respecto al correo
     *
     * @return string
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * Aqui se resume toda la informacion conseguida y se muestra en una sola
     * linea
     *
     * @return (String) informacion resumida
     */
    @Override
    public String toString() {
        return "Persona{" + "codigo=" + codigo + ", nombre=" + nombre + ", cedula=" + cedula + ", telefono=" + telefono + ", direccion=" + direccion + ", correo=" + correo + '}';
    }

   
    
   

}
