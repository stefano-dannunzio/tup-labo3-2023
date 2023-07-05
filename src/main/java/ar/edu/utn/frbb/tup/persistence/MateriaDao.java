package ar.edu.utn.frbb.tup.persistence;

import ar.edu.utn.frbb.tup.model.Materia;
import ar.edu.utn.frbb.tup.persistence.exception.MateriaNotFoundException;

import java.util.List;

public interface MateriaDao {
    Materia save(Materia materia);

    Materia findById(int idMateria) throws MateriaNotFoundException;

    Materia modify(Integer idMateria, Materia m) throws MateriaNotFoundException;

    void delete(Integer idMateria) throws MateriaNotFoundException;

    List<Materia> findByNombre(String unNombre) throws MateriaNotFoundException;
}
