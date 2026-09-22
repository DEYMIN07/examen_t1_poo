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
        Scanner sc = new  Scanner(System.in);
          Alumno a1 = new Alumno();
         
         System.out.print("Ingresa el nombre del alumno: ");
         boolean aux = a1.setNombre(sc.nextLine());
         while (aux == false) {
             System.out.print("Vuelve a ingresar el nombre: ");
             aux = a1.setNombre(sc.nextLine());
         }
         
         System.out.print("Ingresa tipo de documento (DNI / CarnéResidencia): ");
         aux = a1.setTipodocumento(sc.nextLine());
         while (aux == false) {
             System.out.print("Vuelve a ingresar tipo de documento: ");
             aux = a1.setTipodocumento(sc.nextLine());
         }

         System.out.print("Ingresa número de documento: ");
         aux = a1.setNumerodocumento(sc.nextLine());
         while (aux == false) {
             System.out.print("Vuelve a ingresar número: ");
             aux = a1.setNumerodocumento(sc.nextLine());
         }
    }
    
}
