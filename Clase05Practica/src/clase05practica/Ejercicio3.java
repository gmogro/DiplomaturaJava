
package clase05practica;

import java.util.Scanner;


public class Ejercicio3 {
    public static void main(String[] args) {
        /*
        3- Realizar un programa que permita la carga de 10 
           números en un vector. Una vez cargado se
           necesita que el programa determine cual es el mayor 
           y cual es el menor.
        */
        
        int[] numeros = new int[10];
        
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingrese el numero : ");
            numeros[i] = sc.nextInt();
        }
        
        int menor = numeros[0];
        int mayor = numeros[0];
        
        for (int i = 1; i < numeros.length; i++) {
            if(numeros[i]< menor){
                menor = numeros[i];
            }
            
            if(numeros[i]> mayor){
                mayor = numeros[i];
            }
        }
        
        System.out.println("El numero menor es : " + menor);
        System.out.println("El numero mayor es : " + mayor);
    }
}
