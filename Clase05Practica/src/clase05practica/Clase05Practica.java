
package clase05practica;

import java.util.Scanner;

public class Clase05Practica {

   public static void main(String[] args) {
        /*
       1- Realizar un programa que permita la carga de 15 números en un vector. 
          Una vez cargados,se necesita que el programa cuente e informe cuantas 
          veces se cargo el numero 3.
       */
        
        //Array de numeros 
        int[] numeros = new int[15];
        //El objeto Scanner
        Scanner sc = new Scanner(System.in);
        //Variable contador para contar las apariciones del numero 3
        int contadorTres = 0;
        
        //Cargar y Cuento las apariciones
        for(int i=0; i<numeros.length; i++){
            System.out.println("Ingresa el numero : ");
            numeros[i] = sc.nextInt();
            
            if(numeros[i] == 3){
                contadorTres = contadorTres + 1;
            }
        }
        
        System.out.println("El numero 3 se ingreso : " + contadorTres);
        
    }
    
}
