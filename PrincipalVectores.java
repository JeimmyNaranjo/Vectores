
import java.util.Scanner;
import java.util.LinkedList;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;
/**
 * Problema de vectores  * 
 * @author Jeimmy Naranjo
 * @version 1
 */
public class PrincipalVectores  //Declaracion de la clase Principal
{
    public static void main(String[] args) 
    {
        // 1. Definicion de variables
        // Datos de entrada
        int TamañoN, TamañoP;
    
       
       
        // Necesito acceso al teclado
        Scanner teclado = new Scanner(System.in);
        // Preguntar datos de entrada
        System.out.printf("Ingrese el tamaño del vector A\n");
        TamañoN = teclado.nextInt();
        System.out.printf("Ingrese el tamaño del vector B\n");
        TamañoP = teclado.nextInt();
        
        List<Integer> ListaA,ListaB,ListaC,ListaD;
        ListaA = new LinkedList();
        ListaB = new LinkedList();
        ListaC = new LinkedList();
        ListaD = new LinkedList();
       
        
       
        for (int contadorA = 0; contadorA < TamañoN; contadorA++)
            {     
                  System.out.printf("Ingrese el valor # "+ (contadorA +1) +" del Vector A\n");
                  int numA = teclado.nextInt();
                  ListaA.add(numA);
            }    
            
        for (int contadorB = 0; contadorB < TamañoP; contadorB++)
            {     
                  System.out.printf("Ingrese el valor # "+ (contadorB +1) +" del Vector B\n");
                  int numB = teclado.nextInt();
                  ListaB.add(numB);
            } 
         
        System.out.println("El vector A es: " + ListaA);
        System.out.println("El vector B es: " + ListaB);
        
        ///////////////////////Recoleccion de datos/////////////////////////////////////////  
        ListaC.addAll(ListaA);
        ListaC.addAll(ListaB);
        
        for (int i = 0; i < ListaC.size(); i++)
        {
             for (int j = 0; j < ListaC.size() && !ListaD.contains(ListaC.get(i));j++)
             {
                  if (ListaC.get(i)  != (ListaC.get(j)))
                  {
                       ListaD.add(ListaA.get(i));
                       ListaD.add(ListaB.get(j));
                       
                  }
                  
                  
             }
        }
        System.out.println("El vector C es: " + ListaD);
        
        
        //System.out.println("El vector C es: " + ListaD);
        
        
  } //Fin de la clase principal
}