/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.segundomodulo;

import java.util.Scanner;

/**
 *
 * @author cloud
 */
public class SegundoModulo {

    public static void main(String[] args) {
      
        //numero 1;
        mostrar();
       
        //numero 2;
        
        int[] arreglo =array();
        //numero 3
        recorrer(arreglo);
        //numero 4
        mayor();
        //numero 5
        System.out.println("Ingrese un numero del 1 al 10");
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        calificacion(numero);

//        
//        int otroArray[]=new int[5];
//        int vuelta = 0;
//          while(vuelta<5){
//           System.out.print("Ingrese el numero "+(vuelta+1));
//           numero = sc.nextInt();
//           otroArray[vuelta] = numero;
//           vuelta ++;
//       }
//          repetidos(otroArray[]);
 
    }
    
    public  static void mostrar(){
        System.out.println("Ejercicios Java");
    }
    
    public static int[] array(){
       int vuelta = 0;
       Scanner sc = new Scanner(System.in);
       int numero = 0;
      int [] numeros= new int[10];
      
       while(vuelta<10){
           System.out.print("Ingrese el numero "+(vuelta+1)+": ");
           numero = sc.nextInt();
           numeros[vuelta] = numero;
           vuelta ++;
       }
       System.out.println("El vector creado es: ");
       for(int i:numeros){
        System.out.print(i+",");
       }
       return numeros;
    }
    public static void mayor(){
        int vuelta = 0;
       Scanner sc = new Scanner(System.in);
       int numero = 0;
      int [] numeros= new int[5];
      
       while(vuelta<5){
           System.out.print("Ingrese el numero "+(vuelta+1)+": ");
           numero = sc.nextInt();
           numeros[vuelta] = numero;
           vuelta ++;
       }
       System.out.println("Ingrese el numero de indice");
       int indice = sc.nextInt();
       int mayor =0;
       for(int i:numeros){
         if(i>mayor){
         mayor=i;
         }
       }
       if(mayor == numeros[indice]){
       System.out.println("Es mayor");
       }else{
       System.out.println("No es mayor");
       }
    }
   
    public static void recorrer(int array[]){
        int pares = 0;
           for(int i=0;i <10;i++ ){
           System.out.println(array[i]);
           if(array[i] %2 ==0){
           pares = pares +1;
           }System.out.println("la cantidad de pares es: "+pares);
       }
    }
    
    public static void calificacion(int numero){
     if(numero<2){
         System.out.println("Demasiado baja calificación");
     }else if(numero>1 && numero<4){
         System.out.println(" baja calificación");
    }else if(numero>3 && numero<6){
    System.out.println(" Aprobado");
    }else if(numero>5 && numero<8){
         System.out.println(" Alta calificación");
    } else if(numero>7 && numero<10){
         System.out.println(" Muy Alta calificación");
    }
}
    
    public static void repetidos(int otroArray[]){
    
        int repetidos = 0;
        int pos = 0;
        for(int i=0;i<5;i++){
            pos=otroArray[i];
          for(int j=0;j<5;j++){
            if(pos== otroArray[j] ){
              repetidos = repetidos + 1;
              
            }
        }
        }
    }
}


