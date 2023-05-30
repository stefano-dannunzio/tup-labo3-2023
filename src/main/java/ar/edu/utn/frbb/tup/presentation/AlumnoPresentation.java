package ar.edu.utn.frbb.tup.presentation;

import ar.edu.utn.frbb.tup.business.AlumnoService;

public class AlumnoPresentation {

    private AlumnoService alumnoService;

    public void aprobarAsignatura(int materiaId, int nota, long dni) {
        validarNota(nota);
        alumnoService.aprobarAsignatura(materiaId, nota, dni);
    }

    private void validarNota(int nota) {
        if (nota < 0 && nota > 10) {
            throw new IllegalArgumentException("La nota debe estar entre 0 y 10");
        }
    }
}
