import java.util.Objects;

public class Persona {


    private String nombre, apellidos;
    private String telefono, correo;

    public Persona(String telefono, String correo, String nombre, String apellidos) {
        this.telefono = telefono;
        this.correo = correo;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return Objects.equals(telefono, persona.telefono);
    }

    @Override
    public int hashCode() {
        return telefono.hashCode();
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", telefono='" + telefono + '\'' +
                ", correo='" + correo + '\'' +
                '}';
    }
}


