package labalgoritmos_20_4_2023;

import javax.print.attribute.standard.NumberOfDocuments;
import java.sql.SQLOutput;

public class CreadorLista {

    Object Estudiante;
    Nodo siguienteNodo;

    //constructor
    public void Nodo (Object Estudiante, Nodo siguienteNodo) {
        this.Estudiante = Estudiante;
        this.siguienteNodo = Nodo n;
    }


public void enlazarNodos(Nodo n, Nodo siguienteNodo){
        while(siguienteNodo != null){
            siguienteNodo = n;
            System.out.println(Estudiante);
        }
}



/*
public String toString(){
    String impresionLista = null;
    ListaEnlazadaNodo auxiliar = head;
    while(auxiliar.getNext() != null){
        impresionLista += auxiliar.getData();
        if(auxiliar.getNext() != null)
        impresionLista += ", \n ";
    }
    impresionLista += auxiliar.getData();
    return impresionLista;
}
*/


}
