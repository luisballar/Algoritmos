package labalgoritmos_20_4_2023;

import java.util.Scanner;

public class Metodos{
    Estudiante head;
    Scanner entrada = new Scanner(System.in);

    public Metodos() {
        this.head = null;
    }

    // menú principal con las opciones
    public void menuPrincipal(){
        StringBuilder sB = new StringBuilder("Menu Principal")
                .append("\n Elija una opción:")
                .append("\n Opción 1: Agregar estudiante ")
                .append("\n Opción 2: Mostrar todos los estudiantes por ID")
                .append("\n Opción 3: Mostar todos los estudiantes por nombre")
                .append("\n Opción 4: Mostrar los datos de todos los estudiantes")
                .append("\n Opción 5: Mostrar estudiante por ID")
                .append("\n Opción 6: Mostrar estudiante por nombre")
                .append("\n Opción 7: Mostrar estudiante por pocisión de lista")
                .append("\\n Opción 8 Modificar estudiante")
                .append("\n Opción 9: Eliminar estudiante ")
                .append("\n Opción 10: Cantidad de estudiantes")
                .append("\n Opción 11: Salir\n");

        System.out.println(sB.toString());
        entradaOpcion();


    }

    public void entradaOpcion(){

        int opcion = entrada.nextInt();

        switch (opcion){
            case 1:
                estudianteInfo();
                break;

            case 2:
                imprimirCarne();

            case 3:
                imprimirNombres();

            case 4:
                imprimirLista();
                break;

            case 5:
                // mostrar uno ID
                break;

            case 6:
                imprimirUno("");
                break;
            case 7:
                // mostrar x pos


                break;

            case 8:
                // modificar

            case 9:
                delete("");
                break;


        }
    }


    // Contiene la información del estudiante
    public void estudianteInfo(){

        System.out.println("Ingrese el nombre");
        String nombre = entrada.next();
        System.out.print("Nombre:" + nombre);
        entrada.next();

        System.out.println("\nIngrese el carné");
        String carne = entrada.next();
        System.out.print("Carné:" + carne);

        System.out.println("\nIngrese el teléfono");
        String telefono = entrada.nextLine();

        entrada.next();


        System.out.println("\nIngrese su edad");
        int edad = entrada.nextInt();

        System.out.println("\nIngrese su sexo");
        System.out.println("F: Femenino \nM: Masculino");
        char sexo = entrada.next().charAt(0);
        boolean bandera = false;

        if(sexo == 'f' || sexo == 'F')
            bandera = false;
        else if (sexo == 'm' || sexo == 'M')
            bandera = true;

        Estudiante student = new Estudiante(nombre, carne, telefono, edad, bandera);
        // llamamos al append
        append(student);

    }


    // añade un nuevoe studiante a la lista
    public void append(Estudiante nuevoEstudiante) {

        if (head == null) {
            head = nuevoEstudiante;
        } else {
            Estudiante inspector = head;
            while (inspector.siguiente != null) {
                inspector = inspector.siguiente;
            }
            inspector.siguiente = nuevoEstudiante;
        }
    }

    // borra el estudiante solicitado
    public void delete(String ID) {

        // si la lista esta vacía
        if (head == null) {
            System.out.println("La lista está vacía");
            return;
        }


        // si es el primer estudiante de la lista, entonces le damos el puesto al estudiante que le sigue
        if(head.getID().equalsIgnoreCase(ID)) {
            head = head.siguiente;
        }

        Estudiante inspector = head;
        while(inspector.siguiente != null){
            if(inspector.siguiente.getID() == ID){
                inspector.siguiente = inspector.siguiente.siguiente; // apunta al nodo siguiente del que estamos borrando
            }
            inspector = inspector.siguiente;
        }

    }

    public void imprimirLista(){
        if(head == null){
            System.out.println("Esta lista está vacía");
        }else{
            Estudiante inspector = head;
            while(inspector.siguiente != null){
                System.out.println(inspector.toString());
                inspector = inspector.siguiente;
            }
        }
    }

    // imprime los carne de los estudiantes en la lista
    public void imprimirCarne() {
        if (head == null) {
            System.out.println("Esta lista está vacía");
        } else {
            Estudiante inspector = head;
            while (inspector != null) {
                System.out.println(inspector.getID());
                inspector = inspector.siguiente;
            }
        }
    }

    // imprime los nombres de los estudiantes en la lista
    public void imprimirNombres(){
        if (head == null) {
            System.out.println("Esta lista está vacía");
        } else {
            Estudiante inspector = head;
            while (inspector.siguiente != null) {
                System.out.println(inspector.getNombre());
                inspector = inspector.siguiente;
            }
        }
    }

    // imprime el estudiante solicitado
    public void imprimirUno(String nombre){
        if (head == null) {
            System.out.println("Esta lista está vacía");
        }else{
            Estudiante inspector = head;
            while (inspector.siguiente != null) {
                if (inspector.siguiente.getNombre().equalsIgnoreCase(nombre)) {
                    System.out.println(inspector);
                }
                inspector = inspector.siguiente;
            }
        }
    }

}

