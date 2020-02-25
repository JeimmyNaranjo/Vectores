
import java.lang.Integer;
import java.util.Scanner;
import java.util.ArrayList;
/**
 * Problema de vectores  * 
 * @author Mario Dorado, Santiago Velasquez y Jeimmy Naranjo
 * @version 2
 */
public class PrincipalVectores  //Declaracion de la clase Principal
{
    public static void main(String[] args) 
    {
        // 1. Definicion de variables
        // Datos de entrada
        int TamañoN, TamañoP;
        int num = 0;
    
       
       
        // Necesito acceso al teclado
        Scanner teclado = new Scanner(System.in);
        // Preguntar datos de entrada
        System.out.printf("Ingrese el tamaño del vector A\n");
        TamañoN = teclado.nextInt();
        System.out.printf("Ingrese el tamaño del vector B\n");
        TamañoP = teclado.nextInt();
        String[] ArrayA = new String[TamañoN];
        String[] ArrayB = new String[TamañoP];
        String[] ArrayC = new String[TamañoN + TamañoP];
        String[] ArrayD = new String[TamañoN + TamañoP];
        String[] ArrayE = new String[TamañoN + TamañoP];
       
       
        /////Recoleccion de datos///////
       
        for (int contadorA = 0; contadorA < TamañoN; contadorA++)
            {     
                  System.out.printf("Ingrese el valor # "+ (contadorA +1) +" del Vector A ");
                  ArrayA[contadorA]= teclado.next();
               
                  
            }    
            
        for (int contadorB = 0; contadorB < TamañoP; contadorB++)
            {     
                  System.out.printf("Ingrese el valor # "+ (contadorB +1) +" del Vector B ");
                  ArrayB[contadorB]= teclado.next();
                  
                  
            } 
         
        
     
       
        for (int i = 0; i < ArrayA.length; i++)
         {
            for (int j = 0; j < ArrayB.length; j++)
            {
                if(ArrayA[i].equals(ArrayB[j]))
                {
                    ArrayC[num] = ArrayA[i];
                    num = num +1;
                     
                 }
            }
         }
        
        num = 0;
        for (int i = 0; i < ArrayA.length; i++)
        {
            ArrayD[num] = ArrayA[i];
            num = num +1;
        }
        
        for (int i = 0; i < ArrayB.length; i++)
        {
            ArrayD[num] = ArrayB[i];
            num = num +1;
        }
        
        for (int i = 0; i < ArrayC.length; i++)
        {
            for (int j = 0; j < ArrayD.length; j++)
            {
                if (ArrayD[j].equals(ArrayC[i]))
                {
                    ArrayD[j] = "";
                }
            }
        }
        num = 0;
        
        for (int i = 0; i < ArrayD.length; i++)
        {
            if (!ArrayD[i].equals(""))
            {
                ArrayE[num] = ArrayD[i];
                num = num + 1;
            }
        }
        
        System.out.println("\nEl vector C es: "  );
        for (int p = 0; p < num; ++p)
        {
             System.out.print(ArrayE[p]);
              System.out.print( " , ");
            
        }
        
   } //Fin de la clase principal
}
