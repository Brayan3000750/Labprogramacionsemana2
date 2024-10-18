
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class Ejercicio1 {
   public static void main(String[] args){
   
      String nombre;
      double horaTrabajo, tarifaMensual;
       Scanner datos=new Scanner(System.in);
      
      
      System.out.println("******Boleta de Empleado******");
       
      System.out.println("Ingrese el nombre del empleado");
      nombre=datos.next();
      
      System.out.println("Ingrese la hora de trabajo mensual");
      horaTrabajo=datos.nextDouble();
      
      System.out.println("Ingrese la tarifa por hora");
      tarifaMensual=datos.nextDouble();
      
      double salariosemanas=(horaTrabajo/4)*(tarifaMensual);
      
      System.out.println("El empleado se llama: " +nombre);
      System.out.println("Las horas trabajadas son: Lps " +horaTrabajo);
   System.out.println("La tarifa por cada hora es: Lps " +tarifaMensual);
   System.out.println("El salario del empleado por semana es: Lps " +salariosemanas);
   
   
   
   
   }





}
