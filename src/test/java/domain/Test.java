package domain;

import org.junit.jupiter.api.Assertions;

import java.util.Set;

class Test {

    @org.junit.jupiter.api.Test
    public void test1(){
        Materia am1 = new Materia();
        am1.setNombre("AM1");
        am1.setMateriasNecesarias();

        Materia fisica1 = new Materia();
        fisica1.setNombre("Fisica 1");
        fisica1.setMateriasNecesarias();

        Materia algebra = new Materia();
        algebra.setNombre("Algebra");
        algebra.setMateriasNecesarias();

        Materia am2 = new Materia();
        am2.setNombre("AM2");
        am2.setMateriasNecesarias(am1, algebra);

        Materia fisica2 = new Materia();
        fisica2.setNombre("Fisica 2");
        fisica2.setMateriasNecesarias(fisica1);

        Alumno fran = new Alumno();
        fran.setNombre("Franco");
        fran.setApellido("Pena");
        fran.setMateriasAprobadas(am1, fisica1, algebra);

        Inscripcion inscripcion = new Inscripcion();
        inscripcion.setAlumno(fran);
        inscripcion.setMaterias(am2, fisica2);

        Assertions.assertEquals(inscripcion.aprobada(), true);
    }

    @org.junit.jupiter.api.Test
    public void test2(){
        Materia am1 = new Materia();
        am1.setNombre("AM1");

        Materia fisica1 = new Materia();
        fisica1.setNombre("Fisica 1");

        Materia algebra = new Materia();
        algebra.setNombre("Algebra");

        Materia am2 = new Materia();
        am2.setNombre("AM2");
        am2.setMateriasNecesarias(am1, algebra);

        Materia fisica2 = new Materia();
        fisica2.setNombre("Fisica 2");
        fisica2.setMateriasNecesarias(fisica1);

        Alumno fran = new Alumno();
        fran.setNombre("Franco");
        fran.setApellido("Pena");
        fran.setMateriasAprobadas(am1, fisica1);

        Inscripcion inscripcion = new Inscripcion();
        inscripcion.setAlumno(fran);
        inscripcion.setMaterias(am2);

        Assertions.assertEquals(inscripcion.aprobada(), false);
    }
}