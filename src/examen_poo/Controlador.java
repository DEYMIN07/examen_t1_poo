/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen_poo;

import java.util.ArrayList;

/**
 *
 * @author deymi
 */
public class Controlador {
     
    private ArrayList<Alumno> lista_Alumnos = new ArrayList<>();
    public boolean agregarAlumno(Alumno nuevo) {
        for (Alumno a : lista_Alumnos) {
            if (a.getNumerodocumento().equals(nuevo.getNumerodocumento())) {
                System.out.println("ERROR: Ya existe un alumno con ese documento");
                return false;
            }
        }
        lista_Alumnos.add(nuevo);
        System.out.println(" Alumno registrado correctamente");
        return true;
    }
    public void listar_Alumnos() {
        System.out.println("Los alumnos de la lista son: ");
       Alumno actual;

     for (int i = 0; i < lista_Alumnos.size(); i++) {
     actual = lista_Alumnos.get(i);
     actual.ver_datos();
       
        }
    }
}
