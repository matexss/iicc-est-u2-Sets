package models;
import java.util.Objects;

public class Contacto implements Comparable<Contacto> {  // Implementamos Comparable
    private String nombre;
    private String apellido;
    private String telefono;

    // Constructor
    public Contacto(String nombre, String apellido, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
    }

    // Métodos getter y setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Contacto[nombre=" + nombre + ", apellido=" + apellido + ", telefono=" + telefono + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Contacto contacto = (Contacto) obj;
        return nombre.equals(contacto.nombre) && apellido.equals(contacto.apellido) && telefono.equals(contacto.telefono);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellido, telefono);
    }

    @Override
    public int compareTo(Contacto other) {
        int compareNombre = this.nombre.compareTo(other.nombre);
        if (compareNombre != 0) {
            return compareNombre;
        }

        return this.apellido.compareTo(other.apellido);
    }
}
