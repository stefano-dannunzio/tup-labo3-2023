package ar.utn.frbb.tup.persistence;

import ar.utn.frbb.tup.model.Asignatura;

public interface AsignaturaDAO {
    public Asignatura load(String nombre);
    public void store(Asignatura a);
}
