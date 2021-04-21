/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad.pkg2;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Actividad2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Programa de Horario del dia Lunes
        
        Scanner hora = new Scanner(System.in);
        
        System.out.println("Introduzca la hora del dia del 0 al 24");
        int hour = hora.nextInt();
        
        switch (hour){
            case 0, 1, 2, 3, 4, 5 -> System.out.println("Durmiendo");
            case 6 -> System.out.println("Levandose y Desayunando");
            case 7 -> System.out.println("En clase de Administración General");
            case 8 -> System.out.println("Saliendo de Administración General y entrando a Org. Computacional ");
            case 9 -> System.out.println("En clase de Org. Computacional");
            case 10 -> System.out.println("Saliendo de Org. Computacional y entrando a Física");
            case 11 -> System.out.println("En clase de Física");
            case 12 -> System.out.println("Saliendo de Física y entrando en Herramientas de la Computación");
            case 13 -> System.out.println("Saliendo de Herramientas de la Computación");
            case 14, 15, 17, 18, 19, 20, 21, 23 -> System.out.println("Tiempo Libre");
            case 16 -> System.out.println("Almorzando");
            case 22 -> System.out.println("Cenando");
            case 24 -> System.out.println("Llendo a dormir :)");
            default -> System.out.println("Esta hora del dia NO existe >:C");
        }
        
        // Programa de día Habil
        
        Scanner dia = new Scanner(System.in);
        
        System.out.println("Introduzca el día de la semana (ej. Lunes = 1)");
        int day = dia.nextInt();
        
        switch (day){
            case 1 -> System.out.println("Hoy es Lunes");
            case 2 -> System.out.println("Hoy es Martes");
            case 3 -> System.out.println("Hoy es Miercoles");
            case 4 -> System.out.println("Hoy es Jueves");
            case 5 -> System.out.println("Hoy es Viernes");
            case 6 -> System.out.println("Hoy es Sabado");
            case 7 -> System.out.println("Hoy es Domingo");
            default -> System.out.println("Ese día NO existe en la semana >:C");
        }
        if ( day >= 1 && day <= 5 ){
            System.out.println("¡Un día habil!");
        }else if (day == 6 || day == 7 ){
            System.out.println("¡Un fin de semana!");
        }
        
        // Programa para encontrar el trimestre del año
        
        Scanner trimestre = new Scanner(System.in);
        
        System.out.println("Introduzca el mes actual (ej. Enero = 1)");
        int mes = trimestre.nextInt();
        
        switch (mes){
            case 1 -> System.out.println("Es Enero");
            case 2 -> System.out.println("Es Febrero");
            case 3 -> System.out.println("Es Marzo");
            case 4 -> System.out.println("Es Abril");
            case 5 -> System.out.println("Es Mayo");
            case 6 -> System.out.println("Es Junio");
            case 7 -> System.out.println("Es Julio");
            case 8 -> System.out.println("Es Agosto");
            case 9 -> System.out.println("Es Septiembre");
            case 10 -> System.out.println("Es Octubre");
            case 11 -> System.out.println("Es Noviembre");
            case 12 -> System.out.println("Es Diciembre");
            default -> System.out.println("No existe ese mes ...");
        }            
        if ( mes >= 1 && mes <= 3 ){
            System.out.println("Por lo que estamos en el primer trimestre del año");
        }else if ( mes >= 4 && mes <= 6 ){
            System.out.println("Por lo que estamos en el segundo trimestre del año");
        }else if ( mes >= 7 && mes <= 9 ){
            System.out.println("Por lo que estamos en el tercer trimestre del año");
        }else if ( mes >= 10 && mes <= 12 ){
            System.out.println("Por lo que estamos en el cuarto trimestre del año");
        }
    }
}