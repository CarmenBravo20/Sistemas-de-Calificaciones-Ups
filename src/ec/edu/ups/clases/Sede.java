/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

import java.util.ArrayList;
import java.util.List;

/**
 * @since 2019
 * @version 2.0
 * @author Carmen Bravo
 */
//Nombre de la clase
public class Sede {

    /**
     * Atributos de la clase Sede
     */
    private int codigo;
    private String nombre;
    private String direccion;
    private String telefono;
    private List<Carrera> carreras;

    //constructor
    public Sede(int codigo, String nombre, String direccion, String telefono) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        carreras = new ArrayList<>();
    }

    
    public Sede(){
      carreras = new ArrayList<>();
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
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
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
     * Establece la informacion con respecto al telefono
     *
     * @param telefono
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * Establece la informacion con respecto a la carrera
     *
     * @param carreras
     */
    public void setCarreras(List<Carrera> carreras) {
        this.carreras = carreras;
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
     * Consige la informacion con respecto a la direccion
     *
     * @return string
     */
    public String getDireccion() {
        return direccion;
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
     * Consige la informacion con respecto a la lista de carreras
     *
     * @return list
     */
    public List<Carrera> getCarreras() {
        return carreras;
    }
    
    public void agregarCarrera(Carrera carrera){
        carreras.add(carrera);
    }

    /**
     * Aqui se resume toda la informacion conseguida y se muestra en una sola
     * linea
     *
     * @return (String) informacion resumida
     */
    @Override
    public String toString() {
        return "Sede{" + "codigo=" + codigo + ", nombre=" + nombre + ", direccion=" + direccion + ", telefono=" + telefono + ", carreras=" + carreras + '}';
    }

}
