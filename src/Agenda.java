import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Stream;

public class Agenda {

    public final Set<Persona> personas = new LinkedHashSet<>();

    public void imprimirColecion() {
        personas.forEach(System.out::println);
    }

    public void addPersona(Persona persona) {
        personas.add(persona);
    }

    public boolean buscarPersona(Persona persona) {
        return personas.contains(persona);
    }

    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("AGENDA\n");
        sb.append("------------------\n");
        for (Persona p : personas) {

            sb.append(p);
            sb.append("\n");
        }
        return sb.toString();
    }

    public String ordenarporApellidos() {
        Stream<Persona> stream = personas.stream().sorted(Comparator.comparing(Persona::getApellidos).reversed());

        StringBuilder sb = new StringBuilder();
        stream.forEach(persona -> {
            sb.append(persona).append(System.lineSeparator());
        });

        return sb.toString();
    }

    public Persona buscar(String telefono) {

        for (Persona persona : personas) {
            if (persona.getTelefono().equals(telefono)) {
                return persona;
            }
        }

        return null;
    }

    public void borrar(String telefono) {
        personas.removeIf(persona -> persona.getTelefono().equals(telefono));
    }
}

