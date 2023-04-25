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
    Scanner entrada = new Scanner(System.in);
/**
    public Metodos(String nombre, String ID, String telefono, char sexo, int edad) {
        super(nombre, ID, telefono, sexo, edad);
    }
*/
   public StringBuilder menuImprimir(){
       StringBuilder sB = new StringBuilder("Menu Principal").append("\n Seleccione una opción").append(" \n Opción 1: Agregar estudiante " +
               "\n Opción 2: Mostrar todos los estudiantes por ID \n Opción 3: Mostar todos los estudiantes por nombre " +
               "\n Opción 4: Mostrar los datos de todos los estudiantes \n Opción 5: Mostrar estudiante por ID \n Opción 6: Mostrar estudiante por nombre" +
               "\n Opción 7: Mostrar estudiante por pocisión de lista \n Opción 8: Modificar estudiante \n Opción 9: Eliminar estudiante " +
               "\n Opción 10: Cantidad de estudiantes \n Opción 11: Salir");

       return sB;
   }

   public

    
    
}
