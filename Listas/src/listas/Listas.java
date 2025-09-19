
package listas;

import java.util.Scanner; 
public class Listas {

public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int opcionprincipal,opcionMenus;
     int dato;
     
     ListasSimplementeLigadas lista1 = new ListaSimplementeLigada();
     
    do
    {
    System.out.println("Menú Listas");
    System.out.println("1. Listas simplemente ligadas");
    System.out.println("2. Listas simplemente ligadas Circular");
    System.out.println("3. Listas doblemente ligadas");
    System.out.println("4. Listas doblemente ligadas cicular");
    System.out.println("5. salir");
    System.out.print("Escriba la opción: ");
    

    
    opcionprincipal = sc.nextInt();
    
    switch (opciónprincipal)
        
    {
    
        case 1:
            do
            {
                system.out.println("Listas Simplemente ligadas");
            }
            System.out.println("opcion 1");
            ListasSimplementeLigadas Lista1 = new ListasSimplementeLigadas();
            Lista1.InsertarInicio(5);
            Lista1.MostrarDatos();
            break;
            
        case 2:
            System.out.println("opcion 2");
            break;    
            
           case 5:
            System.out.println("saliendo");
            break;    
            
           default:
            System.out.println("opcion por defecto");
            break;    
    }
    }while(opc!= 5);
    
    
}}
