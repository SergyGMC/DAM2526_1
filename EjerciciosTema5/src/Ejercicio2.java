/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sergio.garcoc
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        int tabla[] = new int[10];
        
        int referenciaTabla1[] = tabla;
        int referenciaTabla2[] = tabla;
        
        System.out.println("Referencia 1: " + tabla);
        System.out.println("Referencia 2: " + referenciaTabla1);
        System.out.println("Referencia 3: " + referenciaTabla2);
    }
}
