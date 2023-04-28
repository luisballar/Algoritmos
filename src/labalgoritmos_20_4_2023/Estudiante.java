package labalgoritmos_20_4_2023;

public class Estudiante {
    Estudiante siguiente;
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
        this.siguiente = null;
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
        return "----ESTUDIANTE----" +
                "\nNombre = " + nombre +
                "\nID = " + ID  +
                "\ntelefono = " + telefono +
                "\nedad = " + edad +
                "\nsexo = " + (sexo==false?"Femenino":"Masculino") + "\n------------";
    }
}

