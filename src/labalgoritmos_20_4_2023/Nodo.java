package labalgoritmos_20_4_2023;

import org.w3c.dom.Node;

import javax.print.attribute.standard.NumberOfDocuments;
import java.sql.SQLOutput;

public class Nodo {
        Object Estudiante;
        Nodo next;
        //constructor con cabeza general
        public Nodo(Object Estudiante) {
            this.Estudiante = Estudiante;
            this.next = null;
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



