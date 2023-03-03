/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio_14;

import java.util.Scanner;

public class Ejercicio_14 {

    public static void main(String[] args) {
  Scanner leerporteclado = new Scanner(System.in);
  
    double x, cuadrado, cubo;
      System.out.println("Ingrese el valor de x");
      x = leerporteclado.nextInt();
      
      cuadrado = Math.pow(x, 2);
      cubo = Math.pow(x, 3);
      
      System.out.println("El cuadrado de "+x+" es: "+cuadrado);
      System.out.println("El cubo de "+x+" es: "+cubo);
      

    }
}
