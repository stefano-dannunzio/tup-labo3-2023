package ar.edu.utn.frbb.tup.persistence;

import ar.edu.utn.frbb.tup.model.Materia;

import java.util.HashMap;
import java.util.Map;

public class MateriaDaoMemoryImpl implements MateriaDao {

    private static final Map<Integer, Materia> repositorioMateria = new HashMap<>();
    @Override
    public void save(Materia materia) {
        repositorioMateria.put(materia.getMateriaId(), materia);
    }
}
