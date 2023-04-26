package labalgoritmos_20_4_2023;

public class listaEnlazada{

    Nodo head;

    public listaEnlazada() {
        this.head = null;
    }

    //método para agregar pruebas
    public void agregarPruebas(Object Estudiante){
        Nodo nuevoNodo = new Nodo(Estudiante);
        if(this.head == null){
            this.head = nuevoNodo;
        }else{
            Nodo auxiliar = this.head;
            while(auxiliar.next != null){
                auxiliar = auxiliar.next;
            }
            auxiliar.next = nuevoNodo;
        }
    }

    //método para mostrar todos los datos de cada estudiante
    public void recorrerLista(){
        Nodo auxiliar = this.head;
        while(auxiliar != null) {
            System.out.println(auxiliar.Estudiante);
            auxiliar = auxiliar.next;
        }
    }


}
