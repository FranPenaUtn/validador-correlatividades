package domain;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Alumno {

    private String nombre;
    private String apellido;
    private Set<Materia> materiasAprobadas;

    public Alumno() {
        this.materiasAprobadas = new HashSet<Materia>();
    }

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

    public Set<Materia> getMateriasAprobadas() {
        return materiasAprobadas;
    }

    public void setMateriasAprobadas(Materia ... materiasAprobadas) {
        Collections.addAll(this.materiasAprobadas, materiasAprobadas);
    }

    public Boolean puedeCursar(Materia materia) {
        return this.materiasAprobadas.containsAll(materia.getMateriasNecesarias());
    }
}
