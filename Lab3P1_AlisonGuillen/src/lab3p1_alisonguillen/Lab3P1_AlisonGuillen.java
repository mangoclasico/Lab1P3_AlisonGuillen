/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3p1_alisonguillen;

import java.util.Scanner;

/**
 *
 * @author Dell i7
 */
public class Lab3P1_AlisonGuillen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    
    int Respuesta = 1;
        
            while (Respuesta != 3) {
            System.out.println("\nMenu");
            System.out.println("1. Serie Euclidiana");
            System.out.println("2. Pokebola pucha");
            System.out.println("3. !Ok Boomer!");
            System.out.println("4. Adios");
    int opcion = leer.nextInt();
    switch (opcion) {
            case 1: {
        System.out.print("Ingrese la cantidad de puntos: ");
        int n = leer.nextInt();
        
        // Pedir las coordenadas de cada punto
        double[] x = new double[n];
        double[] y = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el valor de X del punto " + (i+1) + ": ");
            x[i] = leer.nextDouble();
            System.out.print("Ingrese el valor de Y del punto " + (i+1) + ": ");
            y[i] = leer.nextDouble();
        }
        
        // Calcular la distancia euclidiana
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += Math.pow(x[i] - y[i], 2);
        }
        double distance = Math.sqrt(sum);
        
        // Imprimir el resultado
        System.out.printf("La distancia euclidiana es: %.4f", distance);
    }
            break;
    case 2:
 System.out.print("Ingrese un numero: ");
 int ast = leer.nextInt();
 System.out.println(" N = " + ast);
 while(ast<= 0){
     System.out.println("No broder, otro size");
     ast = leer.nextInt();
 }
    for (int i = 0; i < ast; i++ )
    {
      for (int j = 0 ; j < ast; j++ )
      {
        if (i == 0 || i == ast - 1 || j == 0 || j == ast - 1)
        {
          System.out.print("*"+" ");
        }
        else {

          System.out.print("*"+ " ");
        }
      }
      System.out.println();
    } 
         System.out.print("\n Lo siento jiji");

    break;
       case 3: {
        System.out.println("Ingrese su año de nacimiento pls: ");
        int yr = leer.nextInt();
         while(yr<= 1900){
     System.out.println("Sospechoso, ingrese otro año");
     yr = leer.nextInt();
 }     
        if (yr > 1945&&yr < 1960){
            System.out.println("Usted es de la generacion baby boomer :/");
        }else if (yr > 1959&&yr < 1975){
            System.out.println("Felicidades usted es Generacion X! ");
        } else if (yr > 1974&&yr < 1980){
        System.out.println("Felicidades usted es de la generacion Xennials! ");
        } else if (yr > 1979&&yr < 1990){
           System.out.println("Felicidades usted es Millenial! ");
        } else if (yr > 1989&&yr < 2013){
            System.out.println("Felicidades usted es Gen Z! 8)");
        } else if (yr > 2012&&yr < 2026){
            System.out.println("Felicidades usted es Gen Alpha");
            } else{ 
            System.out.println("Usted ta loco");
                    }  
                }
        break;


    case 4:
         Respuesta = 3;
    }


    }

     
        }       


        // TODO code application logic here
    }
    
            
    


            
            
            
        