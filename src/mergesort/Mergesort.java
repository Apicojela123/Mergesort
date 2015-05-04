/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mergesort;

import java.util.Random;
import java.util.Scanner;

public class Mergesort
{
   
   public static void main(String[ ] args)
   {
      final String salida = "  "; 
      int i;                      
      //int[ ] data = { 4, 5, 3, 2, 1, 8, 6, 2, 9 };
      
      
              Scanner leer=new Scanner(System.in);
       System.out.println("Ingrese cantidad de elementos");
        int elementos=leer.nextInt();
        
    int data[]=new int[elementos];

      
      System.out.println(" Este es el Array Original : ");
      
      for (i = 0; i < data.length; i++)
      System.out.print(data[i] + salida);
      System.out.println( "\n" );

      System.out.println("Busqueda del numero Original \" 6 \": " + BusquedaDes(data, 6)+"\n");
      
      // Sort the numbers, and print the result with two blanks after each number.
       
      
      mergesort(data, 0, data.length);
   
       for (i = 0; i < data.length; i++)
         System.out.print(data[i] + salida);
      System.out.println("\n" );
      
        System.out.println("Busqueda del numero Ordenado \" 90\": " + Busqueda(data, 90));
      
   }
    
   
       public void datos(int vector[]){
       Scanner leer=new Scanner(System.in);
       Random rdm=new Random();
        System.out.println("Ingrese maximo del aleatorio");
        int aleatorio=leer.nextInt();
  
        for (int i=0;i<vector.length;i++){
            
            int contenido=rdm.nextInt(aleatorio);
            vector[i]=contenido;
            
        }
    }
   
   public static void mergesort(int[ ] data, int first, int n)
   {
      int n1; 
      int n2; 
      if (n > 1)
      {
         // Compute sizes of the two halves
         n1 = n / 2;
         n2 = n - n1;
         mergesort(data, first, n1);      // Sort data[first] through data[first+n1-1]
         mergesort(data, first + n1, n2); // Sort data[first+n1] to the end
         // Merge the two sorted halves.
         merge(data, first, n1, n2);
      }
      
      
      
      
   } 
  
   private static void merge(int[ ] data, int first, int n1, int n2)
   
   {
      int[ ] temp = new int[n1+n2]; // Allocate the temporary array
      int copied  = 0; // Number of elements copied from data to temp
      int copied1 = 0; // Number copied from the first half of data
      int copied2 = 0; // Number copied from the second half of data
      int i;           // Array index to copy from temp back into data
      //int part=0;
                       // Merge elements, copying from two halves of data to the temporary array.
      while ((copied1 < n1) && (copied2 < n2))
             
      {
         if (data[first + copied1] < data[first + n1 + copied2])
            temp[copied++] = data[first + (copied1++)];
         else
            temp[copied++] = data[first + n1 + (copied2++)];
      
    //             part++;
      }

      // Copy any remaining entries in the left and right subarrays.
      while (copied1 < n1)
         temp[copied++] = data[first + (copied1++)];
  //    part++;
      while (copied2 < n2)
         temp[copied++] = data[first + n1 + (copied2++)];
//part++;
      // Copy from temp back to the data array.
      for (i = 0; i < n1+n2; i++)
         data[first + i] = temp[i];
       
      //System.out.println(" Movimiento " + part);
   }
    
   
    static boolean Busqueda(int[] data, int dato) {
         int cont=0;
        for (int i = 0 ; i < data.length ; i++) {
           
            cont++;
            
            if (data[i] == dato) {
                System.out.println("Posicion Ordenado "+cont);
                return true;
                
            }
        }
 
        return false;
    }
    
       static boolean BusquedaDes(int[] data, int dato) {
      
        int cont=0;
        for (int i = 0 ; i < data.length ; i++) {
           
            cont++;
            
            if (data[i] == dato) {
                System.out.println("Posicion Ordenado "+cont);
                return true;
                
            }
        }
 
        return false;
    }
}


