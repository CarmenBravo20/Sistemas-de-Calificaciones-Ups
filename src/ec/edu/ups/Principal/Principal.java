/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.Principal;

import ec.edu.ups.clases.Carrera;
import ec.edu.ups.clases.Estudiante;
import ec.edu.ups.clases.Grupo;
import ec.edu.ups.clases.HistorialCalificacionEstudiante;
import ec.edu.ups.clases.Materia;
import ec.edu.ups.clases.Profesor;
import ec.edu.ups.clases.Sede;

/**
 *
 * @author Carmen Bravo
 */
public class Principal {
    //crear 2 profesores 4 estudiantes  y dos grupos
    //hacer las listas 
    //instancias las listas en todos los constructores
    //anadir dos materias a cada carrera
    //a cada materia agregar un grupo y un profesor con los setters
    //22 prueba

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // es instanciar mediante un constructor y ya no es necesario setear

        //sedecuenca.agregarCarrera(carreraComputacion);
      
        Carrera carreraComputacion = new Carrera(2, "Computacion", 10, 30, "Ingenieria en ciencias de la computacion");
        Carrera carreraTelematica = new Carrera(3, "Telematica", 10, 40, "Ingenieria en Telematica");
        Carrera carreraMecatronica = new Carrera(4, "Mecatronica", 10, 35, "Ingenieria en Mecatronica");

        Materia materiaAntropologia = new Materia(10, "Antropologia", 80, 2, 1);
        Materia materiaAlgebra = new Materia(12, "Algebra", 200, 8, 1);

        Materia materiaCalculo = new Materia(13, "Calculo de una Variable", 240, 8, 2);
        Materia materiaFisica = new Materia(14, "Fisica", 180, 6, 2);

        Materia materiaCalculo1 = new Materia(15, "Calculo de dos Variables", 240, 8, 2);
        Materia materiaQuimica = new Materia(16, "Quimica", 180, 6, 1);

        Profesor profesorCalculo = new Profesor("Ingenierio de Sistemas", 900, "Profesor", 20, "Pablo ", "0107593873", "3012092", "Av. Las Americas", "pablo23@ups.edu.ec");
        Profesor profesorprogramacion = new Profesor("Ingenierio de Sistemas", 900, "Profesor", 20, "Ig. Gabriel Leon ", "0107593883", "3014092", "Av. Heroes de Verdeloma", "gleon@ups.edu.ec");

        Estudiante dennys = new Estudiante(1, "Dennys Figueroa", "0107596382", "3012065", "Av. Las americas", "dfigueroa@est.ups.edu.ec");
        dennys.setCarrera(carreraTelematica);
        Estudiante carlos = new Estudiante(2, "Carlos Prado", "0107596382", "3012065", "Av. Las americas", "cprado2@est.ups.edu.ec");
        carlos.setCarrera(carreraMecatronica);
        Estudiante katherine = new Estudiante(3, "Katherine Barrera", "0107596382", "3012065", "Av. Las americas", "kbarrera@est.ups.edu.ec");
        katherine.setCarrera(carreraComputacion);
        Estudiante fany = new Estudiante(4, "Fany Lucero", "0107596382", "3012065", "Av. Las americas", "flucero@est.ups.edu.ec");
        fany.setCarrera(carreraTelematica);
        
      
        Grupo grupo1 = new Grupo(15, "Grupo 1", 40);
        Grupo grupo2 = new Grupo(16, "Grupo 5", 40);

        Sede sedeCuenca = new Sede(1, "Sede de Cuenca", "calle Vieja 12-30", "3012092");
        sedeCuenca.agregarCarrera(carreraTelematica);
        sedeCuenca.agregarCarrera(carreraMecatronica);
        sedeCuenca.agregarCarrera(carreraComputacion);
        sedeCuenca.agregarCarrera(carreraTelematica);

        HistorialCalificacionEstudiante calificacionAlegraFany = new HistorialCalificacionEstudiante(10, 8, 7, 8);
        HistorialCalificacionEstudiante calificacionFisicaCarlos = new HistorialCalificacionEstudiante(10, 7, 9, 8);
        HistorialCalificacionEstudiante calificacionQuimicaDennys = new HistorialCalificacionEstudiante(7, 8, 7, 9);
        HistorialCalificacionEstudiante calificacionCalculoKatherine = new HistorialCalificacionEstudiante(10, 6, 9, 8);
        HistorialCalificacionEstudiante calificacionCalculoUnaVariableCarlos = new HistorialCalificacionEstudiante(7, 9, 6, 8);
        HistorialCalificacionEstudiante calificacionAntropologiaDennys = new HistorialCalificacionEstudiante(10, 9, 9, 7);

        carreraComputacion.agregarMateria(materiaFisica);
        carreraMecatronica.agregarMateria(materiaAntropologia);
        carreraTelematica.agregarMateria(materiaAlgebra);

        carlos.agregarCalificacion(calificacionFisicaCarlos);
        dennys.agregarCalificacion(calificacionAntropologiaDennys);
        fany.agregarCalificacion(calificacionAlegraFany);
        dennys.agregarCalificacion(calificacionQuimicaDennys);
        katherine.agregarCalificacion(calificacionCalculoKatherine);

        System.out.println(sedeCuenca);
        System.out.println(carlos);
        System.out.println(dennys);
        System.out.println(katherine);
        System.out.println(fany);

    }

}
