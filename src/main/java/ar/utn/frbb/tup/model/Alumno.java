package ar.utn.frbb.tup.model;

import ar.utn.frbb.tup.model.exception.AsignaturaInexistenteException;
import ar.utn.frbb.tup.model.exception.CorrelatividadException;
import ar.utn.frbb.tup.model.exception.EstadoIncorrectoException;

import java.util.List;

public class Alumno {

    private final String nombre;
    private final String apellido;
    private final long dni;

    private List<Asignatura> asignaturas;

    public Alumno(String nombre, String apellido, long dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;

        inicializarAsignaturas();
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public long getDni() {
        return dni;
    }

    private void inicializarAsignaturas() {

    }

    public void cursarMateria(Materia materia) {

    }

    public void aprobarAsignatura(Materia materia, int nota) throws EstadoIncorrectoException, CorrelatividadException, AsignaturaInexistenteException {
        Asignatura asignaturaAAprobar = getAsignaturaAAprobar(materia);

        for (Materia correlativa :
            materia.getCorrelativas()) {
            chequearCorrelatividad(correlativa);
        }
        asignaturaAAprobar.aprobarAsignatura(nota);
    }

    private void chequearCorrelatividad(Materia correlativa) throws CorrelatividadException {
        for (Asignatura a:
             asignaturas) {
            if (correlativa.getNombre().equals(a.getNombreAsignatura())) {
                if (!EstadoAsignatura.APROBADA.equals(a.getEstado())) {
                    throw new CorrelatividadException("La asignatura " + a.getNombreAsignatura() + " no está aprobada");
                }
            }
        }
    }

    private Asignatura getAsignaturaAAprobar(Materia materia) throws AsignaturaInexistenteException {

        for (Asignatura a: asignaturas) {
            if (materia.getNombre().equals(a.getNombreAsignatura())) {
                return a;
            }
        }
        throw new AsignaturaInexistenteException("No se encontró la materia");
    }
}
