/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author sergio.garcoc
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tabla[] = new int[6];
        
        
        System.out.print("Introduzca 6 números enteros: ");
        
        for (int i = 0; i < tabla.length; i++) {
            tabla[i] = scan.nextInt();
        }
        
        for (int i = 0; i < tabla.length; i++) {
            System.out.println("Elemento " + (i + 1) + ": " + tabla[i]);
        }
    }
}
