package ar.edu.utn.frbb.tup.business.impl;

import ar.edu.utn.frbb.tup.business.MateriaService;
import ar.edu.utn.frbb.tup.business.ProfesorService;
import ar.edu.utn.frbb.tup.model.Alumno;
import ar.edu.utn.frbb.tup.model.Materia;
import ar.edu.utn.frbb.tup.model.dto.MateriaDto;
import ar.edu.utn.frbb.tup.persistence.MateriaDao;
import ar.edu.utn.frbb.tup.persistence.MateriaDaoMemoryImpl;
import ar.edu.utn.frbb.tup.persistence.exception.MateriaNotFoundException;
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
    public Materia crearMateria(MateriaDto materia) throws IllegalArgumentException{
        Materia m = new Materia();
        m.setNombre(materia.getNombre());
        m.setAnio(materia.getAnio());
        m.setCuatrimestre(materia.getCuatrimestre());
        m.setProfesor(profesorService.buscarProfesor(materia.getProfesorId()));
        m.setCodigoCarrera(materia.getCodigoCarrera());
        dao.save(m);
        if (m.getNombre().contains("#")) {
            throw new IllegalArgumentException();
        }
        return m;
    }

    @Override
    public List<Materia> getAllMaterias() {
        return null;
    }

    @Override
    public Materia getMateriaById(int idMateria) throws MateriaNotFoundException {
        return dao.findById(idMateria);
    }

    @Override
    public Materia modificarMateria(Integer idMateria, MateriaDto materia) throws MateriaNotFoundException, IllegalArgumentException {
        Materia m = dao.findById(idMateria);
        m.setNombre(materia.getNombre());
        m.setAnio(materia.getAnio());
        m.setCuatrimestre(materia.getCuatrimestre());
        m.setProfesor(profesorService.buscarProfesor(materia.getProfesorId()));
        m.setCodigoCarrera(materia.getCodigoCarrera());
        dao.modify(idMateria, m);
        if (m.getNombre().contains("#")) {
            throw new IllegalArgumentException();
        }
        return m;

    }

    @Override
    public void eliminarMateria(Integer idMateria) throws MateriaNotFoundException {
        dao.delete(idMateria);

    }

    @Override
    public List<Materia> getMateriaByNombre(String unNombre) throws MateriaNotFoundException{

        return dao.findByNombre(unNombre);
    }

    @Override
    public List<Materia> getMateriaByNombreYCodigo(String ordenNombre, String ordenCodigo) {
        return dao.sortByNombreYCodigo(ordenNombre, ordenCodigo);
    }
}
