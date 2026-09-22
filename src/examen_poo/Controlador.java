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
     
    private ArrayList<Alumno> lista_alumnos;

    public boolean agregarAlumno(Alumno nuevo) {
        // Verificar si ya existe por documento
        for (Alumno a : lista_alumnos) {
            if (a.getNumerodocumento().equals(nuevo.getNumerodocumento())) {
                System.out.println("ERROR: Ya existe un alumno con ese documento");
                return false;
            }
        }
        lista_alumnos.add(nuevo);
        System.out.println("✅ Alumno registrado correctamente");
        return true;
    }
    public void listarAlumnos() {
        if (lista_alumnos.isEmpty()) {
            System.out.println(" No hay alumnos registrados");
            return;
        }
        
        System.out.println("\n===== LISTA DE ALUMNOS =====");
        for (Alumno a : lista_alumnos) {
            a.ver_datos();
        }
        System.out.println("============================\n");
    }
    
    // ========== Obtener cantidad ==========
    public int cantidadAlumnos() {
        return lista_alumnos.size();
    }
}
