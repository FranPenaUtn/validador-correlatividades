package domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Materia {

    private String nombre;
    private Set<Materia> materiasNecesarias;

    public Materia() {
        this.materiasNecesarias = new HashSet<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<Materia> getMateriasNecesarias() {
        return this.materiasNecesarias;
    }

    public void setMateriasNecesarias(Materia ... materias) {
        Collections.addAll(this.materiasNecesarias, materias);
    }
}
