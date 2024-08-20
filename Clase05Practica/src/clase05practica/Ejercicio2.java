package clase05practica;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        /*
        2-Un empleado desea almacenar en un vector sus 12 sueldos del año. 
          A partir de esto necesita un programa que determine y muestre 
          por pantalla la suma total de sus 12 sueldos y el promedio de sueldo 
          que tuvo en el año.
        */
        
        double[] sueldos = new double[12];
        String[] meses = {"Enero","Febrero","Marzo","Abril","Mayo","Junio",
                           "Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
        Scanner sc = new Scanner(System.in);
        
        //Acumulador 
        double sumaTotal = 0;
        
        for (int i = 0; i < sueldos.length; i++) {
            System.out.println("Ingrese el sueldo " + meses[i] + " :");
            sueldos[i] = sc.nextInt();
            
            sumaTotal = sumaTotal + sueldos[i];
        }
        
        double promedioAnual =  sumaTotal / sueldos.length;
        
        System.out.println("La suma total de tu sueldo : " + sumaTotal);
        System.out.println("El promedio de tu sueldo : " + promedioAnual);
    }
}
