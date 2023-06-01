package ar.edu.utn.frbb.tup.business.impl;

import ar.edu.utn.frbb.tup.business.MateriaService;
import ar.edu.utn.frbb.tup.model.Materia;
import ar.edu.utn.frbb.tup.persistence.MateriaDao;
import ar.edu.utn.frbb.tup.persistence.MateriaDaoMemoryImpl;

public class MateriaServiceImpl implements MateriaService {
    private static final MateriaDao dao = new MateriaDaoMemoryImpl();

    @Override
    public void crearMateria(Materia materia) {
        dao.save(materia);
    }
}
