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
public class Metodos //extends Estudiante
{


/**
    public Metodos(String nombre, String ID, String telefono, String sexo, String edad) {
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
       while(opcion<=0 || opcion >11) {
           System.out.println("Ingrese la opción");
           opcion = entrada.nextInt();
           if(opcion>0 || opcion <=11){
               if(opcion != 11) {
                   switch (opcion) {
                       case 1:
                           System.out.println("1");
                           listaEnlazada Estudiantes = new listaEnlazada();
                           Estudiantes.agregarPruebas("Jesús;C21845;6333 8045; M; 20");
                           Estudiantes.agregarPruebas("Pedro;C01235;6933 8142; M; 19");
                           Estudiantes.agregarPruebas("Andrea;C23485;6003 8489; F; 20");
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
                           // Nodo head = new Nodo("Jesús;C21845;6333 8045; M; 20", Estudiante2);
                           // Nodo Estudiante2 = new Nodo("Pedro;C01235;6933 8142; M; 19",Estudiante3);
                           // Nodo Estudiante3 = new Nodo("Andrea;C23485;6003 8489; F; 20", null);
                           listaEnlazada EstudiantesTodosLosDatos = new listaEnlazada();
                           EstudiantesTodosLosDatos.agregarPruebas("Jesús;C21845;6333 8045; M; 20");
                           EstudiantesTodosLosDatos.agregarPruebas("Pedro;C01235;6933 8142; M; 19");
                           EstudiantesTodosLosDatos.agregarPruebas("Andrea;C23485;6003 8489; F; 20");
                           EstudiantesTodosLosDatos.recorrerLista();
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
                   }
               }else
                   opcion=11;
           }
       }
   }

}
