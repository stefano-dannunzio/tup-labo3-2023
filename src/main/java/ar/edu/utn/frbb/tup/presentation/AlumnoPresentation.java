package ar.edu.utn.frbb.tup.presentation;

import ar.edu.utn.frbb.tup.business.AlumnoService;
import ar.edu.utn.frbb.tup.business.impl.AlumnoServiceImpl;
import ar.edu.utn.frbb.tup.model.Alumno;
import ar.edu.utn.frbb.tup.model.exception.CorrelatividadesNoAprobadasException;
import ar.edu.utn.frbb.tup.model.exception.EstadoIncorrectoException;

public class AlumnoPresentation {

    private static final AlumnoInputProcessor alumnoInputProcessor = new AlumnoInputProcessor();
    private static final AlumnoService alumnoService = new AlumnoServiceImpl();


    public void crearAlumno(){
        Alumno alumno = new Alumno();
        alumnoInputProcessor.processInput(Alumno.class, alumno);
        alumnoService.crearAlumno(alumno);
    }

    public void aprobarAsignatura(int materiaId, int nota, long dni) throws CorrelatividadesNoAprobadasException, EstadoIncorrectoException {
        validarNota(nota);
        alumnoService.aprobarAsignatura(materiaId, nota, dni);
    }

    private void validarNota(int nota) {
        if (nota < 0 && nota > 10) {
            throw new IllegalArgumentException("La nota debe estar entre 0 y 10");
        }
    }
}
