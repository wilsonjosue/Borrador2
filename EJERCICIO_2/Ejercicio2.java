package trabajo1.team23_10c;

import java.util.*;
public class Ejercicio2 {

    
    public static void main(String[] args) {
        
        Scanner dar=new Scanner(System.in);
        
        //definimos nuestro vector array y lo inicalizamos con valores 
        // aleatorios de 1 al 11
        
        System.out.println("Ingrese el tamaño del arreglo");
        int cant=dar.nextInt();
        int[] arregloDeValores=new int[cant];
        numAletorios(arregloDeValores);
      
        
    }
    public static void numAletorios(int[] array){
        int i=0;
        //Para establecer un rango de valores aleatorios utilizamos clase 
        //(Math.random()*(final - inicial +1)+ inicial)
        while(i<array.length){
            int num=(int)(Math.random()*11+1);
            array[i]=num;
        }
        
    }

    public static int busquedaMenor(int[] arrayLleno){
        int i;
        int menor=arrayLleno[0];
        for(i=1;i<arrayLleno.length;i++){
            if(arrayLleno[i]<menor)
               menor=arrayLleno[i];
        }
        return menor;
    }
}