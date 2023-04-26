/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labalgoritmos_20_4_2023;

import java.util.Scanner;

/**
 *
 * @author LabB
 */
public class Metodos //extends Estudiante
{


/**
    public Metodos(String nombre, String ID, String telefono, char sexo, int edad) {
        super(nombre, ID, telefono, sexo, edad);
    }
*/
   public StringBuilder menuImprimir(){
       StringBuilder sB = new StringBuilder("Menu Principal").append(" \n Opción 1: Agregar estudiante " +
               "\n Opción 2: Mostrar todos los estudiantes por ID \n Opción 3: Mostar todos los estudiantes por nombre " +
               "\n Opción 4: Mostrar los datos de todos los estudiantes \n Opción 5: Mostrar estudiante por ID \n Opción 6: Mostrar estudiante por nombre" +
               "\n Opción 7: Mostrar estudiante por pocisión de lista \n Opción 8: Modificar estudiante \n Opción 9: Eliminar estudiante " +
               "\n Opción 10: Cantidad de estudiantes \n Opción 11: Salir");

       return sB;
   }

   public void entradaOpcion(){
       int opcion =0;
       Scanner entrada = new Scanner(System.in);
       while(opcion<=0 || opcion >11){
           System.out.println("Ingrese la opción");
           opcion = entrada.nextInt();
       }
       switch(opcion){
           case 1:
               System.out.println("1");
               break;
           case 2:
               System.out.println("2");
               break;
           case 3:
               System.out.println("3");
               break;
           case 4:
               System.out.println("4");
               break;
           case 5:
               System.out.println("5");
               break;
           case 6:
               System.out.println("6");
               break;
           case 7:
               System.out.println("7");
               break;
           case 8:
               System.out.println("8");
               break;
           case 9:
               System.out.println("9");
               break;
           case 10:
               System.out.println("10");
               break;
           case 11:
               break;
       }
   }



}
