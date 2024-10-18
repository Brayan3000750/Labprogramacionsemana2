
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class Ejercicio4 {
    public static void main(String[] args){
    
    Scanner datos=new Scanner(System.in);
    
    System.out.print("Ingrese el primer numerado: ");
        double num1 = datos.nextDouble();
        
        System.out.print("Ingrese el segundo denominador: ");
        double denominador1 = datos.nextDouble();
        
        System.out.print("Ingrese el segundo numerador: ");
        double num2 = datos.nextDouble();
        
        System.out.print("Ingrese el segundo denominador: ");
        double denom2 = datos.nextDouble();
        
        
        double resultado = (num1 / denominador1) + (num2 / denom2);
        System.out.println(String.format("El resultado es: %.2f", resultado));

    
    
    
    
    }
    

}
