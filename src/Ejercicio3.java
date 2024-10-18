
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class Ejercicio3 {

    public static void main(String[] args){
    
        Scanner datos=new Scanner(System.in);
   
    double precio60 = 0.30;
        double precio100 = 0.25;
        double precio20 = 0.80;
    
    System.out.print("Ingrese el numero de clics con un precio de $0.30 cada uno: ");
        int clics60 = datos.nextInt();
        System.out.print("Ingrese el numero de clics con un precio de $0.25 cada uno: ");
        int clics100 = datos.nextInt();
        System.out.print("Ingrese el numero de clics con un precio de $0.80 cada uno: ");
        int clics20 = datos.nextInt();
        
    int clicsTotales= clics60 + clics100 + clics20;
    double precioTotal=(clics60 * precio60) + (clics100 * precio100) + (clics20 * precio20);
    
    double precioPromedio=precioTotal / clicsTotales;
    
    double isv=precioTotal*0.16;
    double totalISV=precioTotal*isv;
    
    System.out.println(String.format("El costo promedio por clic es: lps %.2f", precioPromedio));
    System.out.println(String.format("El total sin usar ISV es: lps %.2f", precioTotal));
    System.out.println(String.format("El total usando isv es: lps %.2f", totalISV));
    
    
    
    }
    }

