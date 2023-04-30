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
                .append("\n Opción 8 Modificar estudiante")
                .append("\n Opción 9: Eliminar estudiante ")
                .append("\n Opción 10: Cantidad de estudiantes")
                .append("\n Opción 11: Salir\n");

        System.out.println(sB.toString());
        entradaOpcion();

    }

    public void entradaOpcion(){

        int opcion = entrada.nextInt();

        while(opcion>=1 || opcion<11){

            switch (opcion){

                case 1:
                    // ingresa un estudiante nuevo a la lista
                    System.out.println("INGRESAR ESTUDIANTE");
                    estudianteInfo();
                    break;
                case 2:
                    // imprime los carnets de los estudiantes de la lista
                    System.out.println("CARNETS DE LOS ESTUDIANTES");
                    imprimirCarnes();
                    break;
                case 3:
                    // imprime los nombres de los estudiantes de la lista
                    imprimirNombres();
                    break;
                case 4:
                    // imprime los estudiantes y sus datos
                    imprimirLista();
                    break;
                case 5:
                    // imprime un estudiante ingresando su carnet
                    System.out.println("INGRESE EL CARNÉ DEL ESTUDIANTE A BUSCAR");
                    String carneParam = entrada.next();
                    imprimirPorCarne(carneParam);
                    break;
                case 6:
                    // imprime un estudiante ingresando su nombre
                    entrada.nextLine(); // limpia el buffer de entrada
                    System.out.println("INGRESE EL NOMBRE DEL ESTUDIANTE A BUSCAR");
                    String nombreParam = entrada.nextLine();
                    imprimirPorNombre(nombreParam);
                    break;
                case 7:
                    // imprime un estudiante ingresando su posición
                    System.out.println("INGRESE LA POSICIÓN DEL ESTUDIANTE");
                    int posicion = entrada.nextInt();
                    imprimirPorPost(posicion);
                    break;
                case 8:
                    // edita los datos de un estudiante
                    System.out.println("Digite el ID del estudiante que desea actualizarle la edad");
                    String carnet = entrada.next();
                    System.out.println("Digite la nueva edad dele estudiante");
                    int nuevaEdad = entrada.nextInt();
                    intercambioDatoStudent(carnet, nuevaEdad);
                    break;
                case 9:
                    // borra un estudiante de la lista
                    System.out.println("INGRESE EL ID DEL ESTUDIANTE A BORRAR");
                    String IDestudianteBorrar = entrada.next();
                    delete(IDestudianteBorrar);
                    break;
                case 10:
                    imprimirCantidad();
                    break;
            }

            System.out.println("\n| | | INGRESE UNA OPCIÓN | | | ");
            opcion = entrada.nextInt();

            if (opcion == 11)
                System.out.println("HA SALIDO DEL MENÚ");
                break;
        }

    }


    // Contiene la información del estudiante
    public void estudianteInfo(){
        entrada.nextLine(); // impide que se mezclen las variables

        System.out.println("Ingrese el nombre");
        String nombre = entrada.nextLine();
        System.out.print("Nombre:" + nombre + "\n");

        System.out.println("\nIngrese el carné");
        String carne = entrada.next();
        System.out.print("Carné:" + carne + "\n");


        System.out.println("\nIngrese el teléfono");
        String telefono = entrada.next();
        System.out.println("Teléfono: " + telefono + "\n");

        System.out.println("Ingrese su edad");
        int edad = entrada.nextInt();
        System.out.println("Edad: " + edad + "\n");

        System.out.println("\nIngrese su sexo");
        System.out.println("F: Femenino \nM: Masculino");
        char sexo = entrada.next().charAt(0);
        boolean bandera = false;

        // al ser dos opciones es mas fácil condicionar con un if
        if(sexo == 'f' || sexo == 'F') {
            bandera = false;
            System.out.println("Femenino");
        }else if (sexo == 'm' || sexo == 'M'){
            bandera = true;
            System.out.println("Masculino");
        }


        Estudiante student = new Estudiante(nombre, carne, telefono, edad, bandera);
        // llamamos al append
        append(student);

    }


    // añade un nuevo estudiante a la lista
    public void append(Estudiante nuevoEstudiante) {

        if (head == null) {
            head = nuevoEstudiante;
        } else {
            Estudiante inspector = head;
            while (inspector.siguiente != null) {
                inspector = inspector.siguiente;
            }
            System.out.println("Insertado");
            inspector.siguiente = nuevoEstudiante;
        }
    }

    // borra un estudiante de la lista
    public void delete(String ID) {

        // si la lista esta vacía
        if (head == null) {
            System.out.println("La lista está vacía");
            return;
        }

        // cuando se quiere borrar el primer de la lista
        // si es el primer estudiante de la lista, entonces le damos el puesto al estudiante que le sigue
        if (head.getID().equalsIgnoreCase(ID)) {

            if (head.getID().equalsIgnoreCase(ID) && head.siguiente == null) {
                head = null;
                System.out.println("---SE BORRÓ EL ESTUDIANTE---");
            } else {
                Estudiante inspector = head;
                while (inspector.siguiente != null) {
                    if (inspector.siguiente.getID() == ID) {
                        inspector.siguiente = inspector.siguiente.siguiente; // apunta al nodo siguiente del que estamos borrando
                    }
                    inspector = inspector.siguiente;
                }
                head = head.siguiente;

                if (inspector == null)
                    System.out.println("NO EXISTE EL ESTUDIANTE INGRESADO");
            }
        }
    }

    // imprimie los nodos y su información
    public void imprimirLista(){
        if(head == null){
            System.out.println("Esta lista está vacía");
        }else{
            Estudiante inspector = head;
            while(inspector != null){
                System.out.println(inspector.toString());
                inspector = inspector.siguiente;
            }
        }
    }

    // imprime los carne de los estudiantes en la lista
    public void imprimirCarnes() {
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

    // imprime los datos del estudiante por carné
    public void imprimirPorCarne(String carne) {
        if (head == null) {
            System.out.println("Esta lista está vacía");
        } else {
            Estudiante inspector = head;
            while (inspector != null) {
                if(inspector.getID().equalsIgnoreCase(carne)) {
                    System.out.println(inspector.toString());
                    break;
                }else
                    System.out.println("NO SE ENCONTRO ESTE CARNÉ");
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
            while (inspector != null) {
                System.out.println(inspector.getNombre());
                inspector = inspector.siguiente;
            }
        }
    }


    // imprime los datos del estudiante por nombre
    public void imprimirPorNombre(String nombre) {
        if (head == null) {
            System.out.println("Esta lista está vacía");
        } else {
            Estudiante inspector = head;
            while (inspector != null) {
                if(inspector.getNombre().equalsIgnoreCase(nombre)) {
                    System.out.println(inspector.toString());
                    break;
                }
                inspector = inspector.siguiente;

            }
            if(inspector == null)
             System.out.println("NO SE ENCONTRO ESTE NOMBRE");

        }
    }

    public void imprimirPorPost(int position){
        if(head == null){
            System.out.println("Esta lista está vacía");
        }else{
            Estudiante inspector = head;
            int i = 1;
            while(inspector != null){
                if(i == position) {
                    System.out.println(i++ + " - " + inspector.toString());
                    break;
                }
                inspector = inspector.siguiente;
                i++;
            }
            if(inspector == null && i != position)
                System.out.println("NO SE ENCONTRÓ LA POSICIÓN " + position);
        }
    }

    public void intercambioDatoStudent(String carne, int nuevaEdad){
        if(head == null){
            System.out.println("Esta lista se encuentra vacía");
        }else {

            Estudiante inspector = head;
            while(inspector != null){
                if(inspector.getID().equalsIgnoreCase(carne)){
                    inspector.setEdad(nuevaEdad);
                    System.out.println(inspector.toString());
                    break;
                }
                inspector = inspector.siguiente;
            }

            if(inspector == null)
                System.out.println("NO SE ENCONTRÓ EL ESTUDIANTE");
        }
    }

    public void imprimirCantidad(){
            Estudiante inspector = head;
            int i = 0;
            while(inspector != null){
                inspector = inspector.siguiente;
                i++;
            }
            System.out.println("Cantidad de estudiantes en la lista: " + i);
    }
}

