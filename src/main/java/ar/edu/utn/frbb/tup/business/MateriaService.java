package ar.edu.utn.frbb.tup.business;

import ar.edu.utn.frbb.tup.model.Materia;

import java.util.List;

public interface MateriaService {
    void crearMateria(Materia inputData);

    List<Materia> getAllMaterias();
}
