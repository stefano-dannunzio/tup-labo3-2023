package ar.edu.utn.frbb.tup.persistence;

import ar.edu.utn.frbb.tup.model.Materia;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

@Service
public class MateriaDaoMemoryImpl implements MateriaDao {

    private static final Map<Integer, Materia> repositorioMateria = new HashMap<>();
    @Override
    public Materia save(Materia materia) {
        Random random = new Random();
        materia.setMateriaId(random.nextInt());
        repositorioMateria.put(materia.getMateriaId(), materia);
        return materia;
    }
}
