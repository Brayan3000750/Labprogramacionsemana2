
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class Ejercicio2 {
    public static void main(String[] args){
    
        double montoPrestamo,interesMes,comisionporCuota,porcentajeSeguromes,interesalMes;
        int plazoMeses = 0;
        
        Scanner datos=new Scanner (System.in);        
        
        System.out.println("*****Cuotas Mensuales*****");
        
        System.out.println("Ingrese el monto del prestamo ");
        montoPrestamo=datos.nextDouble();
        
        System.out.println("En cuantos meses desea pagarlo?");
        plazoMeses=datos.nextInt();
        
        System.out.println("Ingrese el interes al mes");
       interesMes=datos.nextDouble()/100;
       
       System.out.println("Ingrese comision por cuota");
       comisionporCuota=datos.nextDouble()/100;
       
       System.out.println("Ingrese el seguro mensual ");
       porcentajeSeguromes=datos.nextDouble()/100;
       
       
       
    double interesmensual=(montoPrestamo*interesMes);
    double cuotaBasica=(montoPrestamo/plazoMeses) + interesmensual;
    double cuotacomision=(cuotaBasica+comisionporCuota);
    double seguromes=cuotacomision*porcentajeSeguromes;
    double cuotatotalMes=cuotacomision+seguromes;
    double totalPagar=cuotatotalMes*plazoMeses;

    System.out.println("Cuota de pago mensual es: Lps " +String.format("%.2f", cuotatotalMes));
    System.out.println("Su total a pagar es: Lps " +String.format("%.2f", totalPagar));
    
    
    
    
    
    }
    

}

