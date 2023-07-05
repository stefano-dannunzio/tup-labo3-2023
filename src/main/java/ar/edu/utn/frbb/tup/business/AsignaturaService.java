package ar.edu.utn.frbb.tup.business;

import ar.edu.utn.frbb.tup.model.Asignatura;

public interface AsignaturaService {
    Asignatura getAsignatura(long materiaId, long dni);

    void actualizarAsignatura(Asignatura a);
}
