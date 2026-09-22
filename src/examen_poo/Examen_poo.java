/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen_poo;

import java.util.Scanner;

/**
 *
 * @author deymi
 */
public class Examen_poo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
         Controlador control = new Controlador();
         int op;
         
         do {
             System.out.println("\n1.Registrar | 2.Listar | 3.Salir");
             System.out.print("Opción: ");
             op = sc.nextInt(); sc.nextLine();
             
             if (op == 1) {
                 Alumno a = new Alumno();
                 boolean aux;
                 
                 System.out.print("Nombre: ");
                 aux = a.setNombre(sc.nextLine());
                 while (!aux) { System.out.print("Repite: "); aux = a.setNombre(sc.nextLine()); }
                 
                 System.out.print("Tipo doc: ");
                 aux = a.setTipodocumento(sc.nextLine());
                 while (!aux) { System.out.print("Repite: "); aux = a.setTipodocumento(sc.nextLine()); }
                 
                 System.out.print("Número: ");
                 aux = a.setNumerodocumento(sc.nextLine());
                 while (!aux) { System.out.print("Repite: "); aux = a.setNumerodocumento(sc.nextLine()); }
                 
                 System.out.print("Nivel A/B/C: ");
                 aux = a.setNivelsocioeconomico(sc.nextLine().charAt(0));
                 while (!aux) { System.out.print("Repite: "); aux = a.setNivelsocioeconomico(sc.nextLine().charAt(0)); }
                 
                 System.out.print("Beca: ");
                 aux = a.setTipobeca(sc.nextLine());
                 while (!aux) { System.out.print("Repite: "); aux = a.setTipobeca(sc.nextLine()); }
                 
                 control.agregarAlumno(a);
             }
             else if (op == 2) control.listar_Alumnos();
             
         } while (op != 3);
         
         System.out.println("Fin");
         sc.close();
     } 
}
