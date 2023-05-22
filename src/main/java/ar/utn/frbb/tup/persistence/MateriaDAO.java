package ar.utn.frbb.tup.persistence;

import ar.utn.frbb.tup.model.Materia;

public interface MateriaDAO {
    public Materia load(String nombre);
    public void store(Materia m);
}
