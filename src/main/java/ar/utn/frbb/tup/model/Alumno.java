package ar.utn.frbb.tup.model;

import java.util.List;

public class Alumno {

    private final String nombre;
    private final String apellido;
    private final long dni;

    private List<Asignatura> materias;

    public Alumno(String nombre, String apellido, long dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;

        inicializarAsignaturas();
    }

    private void inicializarAsignaturas() {

    }

    public void cursarMateria(Materia materia) {

    }
}
