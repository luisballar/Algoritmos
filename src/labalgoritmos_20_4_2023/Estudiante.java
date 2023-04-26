package labalgoritmos_20_4_2023;

public class Estudiante {

    private String nombre;
    private String ID;
    private String telefono;
    private char sexo;
    private int edad;

    public Estudiante(String nombre, String ID, String telefono, char sexo, int edad) {
        this.nombre = nombre;
        this.ID = ID;
        this.telefono = telefono;
        this.sexo = sexo;
        this.edad = edad;
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

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
}
