package ar.edu.utn.frbb.tup.persistence;

import ar.edu.utn.frbb.tup.model.Alumno;
import ar.edu.utn.frbb.tup.persistence.exception.DaoException;

import java.util.HashMap;
import java.util.Map;

public class AlumnoDaoMemoryImpl implements AlumnoDao {

    private static Map<Long, Alumno> repositorioAlumnos = new HashMap<>();

    @Override
    public void saveAlumno(Alumno alumno) throws DaoException {
        repositorioAlumnos.put(alumno.getDni(), alumno);
    }

    @Override
    public void findAlumno(Long dni) {

    }

}
