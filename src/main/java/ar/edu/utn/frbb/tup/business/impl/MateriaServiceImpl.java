package ar.edu.utn.frbb.tup.business.impl;

import ar.edu.utn.frbb.tup.business.MateriaService;
import ar.edu.utn.frbb.tup.business.ProfesorService;
import ar.edu.utn.frbb.tup.model.Alumno;
import ar.edu.utn.frbb.tup.model.Materia;
import ar.edu.utn.frbb.tup.model.dto.MateriaDto;
import ar.edu.utn.frbb.tup.persistence.MateriaDao;
import ar.edu.utn.frbb.tup.persistence.MateriaDaoMemoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class MateriaServiceImpl implements MateriaService {
    @Autowired
    private MateriaDao dao;

    @Autowired
    private ProfesorService profesorService;

    @Override
    public Materia crearMateria(MateriaDto materia) {
        Materia m = new Materia();
        m.setNombre(materia.getNombre());
        m.setAnio(materia.getAnio());
        m.setCuatrimestre(materia.getCuatrimestre());
        m.setProfesor(profesorService.buscarProfesor(materia.getProfesorId()));
        dao.save(m);
        return m;
    }

    @Override
    public List<Materia> getAllMaterias() {
        return null;
    }
}
