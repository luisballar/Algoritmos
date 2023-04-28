/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labalgoritmos_20_4_2023;

/**
 *
 * @author LabB
 */
public class Estudiante {

    Estudiante next;
    private String nombre;
    private String ID;
    private String telefono;
    private int edad;
    private boolean sexo;


    public Estudiante(String nombre, String ID, String telefono, int edad, boolean sexo) {
        this.nombre = nombre;
        this.ID = ID;
        this.telefono = telefono;
        this.edad = edad;
        this.sexo = sexo;
        this.next = null;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isSexo() {
        return sexo;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", ID='" + ID + '\'' +
                ", telefono='" + telefono + '\'' +
                ", edad=" + edad +
                ", sexo=" + sexo +
                '}';
    }
}
