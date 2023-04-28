/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labalgoritmos_20_4_2023;

import org.w3c.dom.Node;

import java.util.Scanner;

/**
 *
 * @author LabB
 */
public class Metodos{

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
       while(opcion<=0 || opcion >11) {
           System.out.println("Ingrese la opción");
           opcion = entrada.nextInt();
           if(opcion>0 || opcion <=11){
                   switch (opcion) {
                       case 1:
                           System.out.println("1");
                           opcion=0;
                           break;
                       case 2:
                           System.out.println("2");
                           opcion=0;
                           break;
                       case 3:
                           System.out.println("3");
                           opcion=0;
                           break;
                       case 4:
                           System.out.println("Todos los datos");
                           opcion=0;
                           break;
                       case 5:
                           System.out.println("5");
                           opcion=0;
                           break;
                       case 6:
                           System.out.println("6");
                           opcion=0;
                           break;
                       case 7:
                           System.out.println("7");
                           System.out.println("Ingrese la posición en la que está el estudiante que quiere modificar");
                           int posicionEstudiante = entrada.nextInt();
                           System.out.println("Ingrese la nueva edad");
                           int nuevaEdad = entrada.nextInt();
                           intercambioDatoStudent(nuevaEdad, posicionEstudiante);
                           opcion=0;
                           break;
                       case 8:
                           System.out.println("8");
                           opcion=0;
                           break;
                       case 9:
                           System.out.println("9");
                           opcion=0;
                           break;
                       case 10:
                           System.out.println("10");
                           opcion=0;
                           break;
                       case 11:
                           break;
                   }
           }
       }
   }

    // intercambiar un dato del estudiante

    public void intercambioDatoStudent(int nuevaEdad, int posicionEstudiante){
        int contPosicionNodo = 0;
        if(head == null){
            System.out.println("Esta lista se encuentra vacía");
        }else {
            Estudiante auxiliar = head;
            while(auxiliar != null){
            //if que evalua si la posicion del estudiante que brindo el usuario es igual a la posicion que ocupa
                // en la lista el nodo actual.
                if(posicionEstudiante == contPosicionNodo){
                    Estudiante.edad = nuevaEdad;
                    System.out.println(auxiliar.toString());
                    auxiliar = null;
                }
                contPosicionNodo++;
            }
        }
    }



}
