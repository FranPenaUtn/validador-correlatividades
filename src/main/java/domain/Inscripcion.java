package domain;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Inscripcion {

    private Set<Materia> materias;
    private Alumno alumno;

    public Inscripcion() {
        this.materias = new HashSet<>();
    }

    public Set<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(Materia ... materias) {
        Collections.addAll(this.materias, materias);
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public Boolean aprobada() {
        return this.materias.stream().allMatch(materia -> alumno.puedeCursar(materia));
    }
}
