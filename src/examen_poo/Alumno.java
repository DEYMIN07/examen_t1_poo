/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen_poo;

/**
 *
 * @author deymi
 */
public class Alumno {
    private String nombre;
    private String tipodocumento;
    private String numerodocumento;
    private char nivelsocioeconomico;
    private String tipobeca;

    public Alumno() {
    }

    public Alumno(String nombre, String tipodocumento, String numerodocumento, char nivelsocioeconomico, String tipobeca) {
        this.nombre = nombre;
        this.tipodocumento = tipodocumento;
        this.numerodocumento = numerodocumento;
        this.nivelsocioeconomico = nivelsocioeconomico;
        this.tipobeca = tipobeca;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean setNombre(String nombre) {
        if(nombre.length()>0){
            this.nombre = nombre;
            return true;
        }else{
            System.out.println("el nombre no puede estar vacio");
            return false;
        }   

    }

    public String getTipodocumento() {
        return tipodocumento;
    }

    public boolean setTipodocumento(String tipodocumento) {
        if(tipodocumento.equals("DNI")||tipodocumento.equals("carnet de rsidencia")){
            this.tipodocumento = tipodocumento;
            return true;
        }else{
            System.out.println("tipo de documento invalido");
            return true;
        }      
    }


    public String getNumerodocumento() {
        return numerodocumento;
    }

    public boolean setNumerodocumento(String numerodocumento) {
         if(numerodocumento.length() == 8){
            this.numerodocumento = numerodocumento;
            return true;
        }else{
            System.out.println("ERROR cantidad de caracteres inválido"); 
            return false;
        }
    }


    public char getNivelsocioeconomico() {
        return nivelsocioeconomico;
    }

    public boolean setNivelsocioeconomico(char nivelsocioeconomico) {
        char auxillar = Character.toUpperCase(nivelsocioeconomico);
        if(auxillar=='A' || auxillar=='B'|| auxillar=='C'){
            this.nivelsocioeconomico=auxillar;
            return true;
        }else{
            System.out.println("Error nivel socioeconomico invalido. solo A, B, C");
            return false;
        }
    }


    public String getTipobeca() {
        return tipobeca;
    }

    public boolean setTipobeca(String tipobeca) {
        if(tipobeca.equals("ninguna")||tipobeca.equals("parcial")||tipobeca.equals("total")){
            this.tipobeca = tipobeca;
            return true;
        }else{
            System.out.println("Error. eliga un  tipo de beca valido. ninguna, parcial, total");
            return false;
        }
    }
}

    

