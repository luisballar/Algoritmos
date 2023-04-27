package labalgoritmos_20_4_2023;

public class Estudiante {
    private String nombre;
    private String ID;
    private String telefono;
    private char sexo;
    private int edad;
    Estudiante siguiente;
    Estudiante anterior;
    Estudiante head;

    public Estudiante(String nombre, String ID, String telefono, char sexo, int edad) {
        this.nombre = nombre;
        this.ID = ID;
        this.telefono = telefono;
        this.sexo = sexo;
        this.edad = edad;
        this.siguiente = null;
        this.head = null;
    }

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

    public void delete(String ID) {

        // si la lista esta vacía
        if (head == null) {
            System.out.println("La lista está vacía");
            return;
        }


        // si es el primer estudiante de la lista, entonces le damos el puesto al estudiante que le sigue
        if(head.ID == ID) {
        head = head.siguiente;
        }

        Estudiante inspector = head;
        while(inspector.siguiente != null){
            if(inspector.siguiente.ID == ID){
                inspector.siguiente = inspector.siguiente.siguiente; // apunta al nodo siguiente del que estamos borrando
            }
            inspector = inspector.siguiente;
        }

    }

}

