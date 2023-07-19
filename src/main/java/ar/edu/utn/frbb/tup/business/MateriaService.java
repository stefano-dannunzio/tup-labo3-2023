package ar.edu.utn.frbb.tup.business;

import ar.edu.utn.frbb.tup.model.Materia;
import ar.edu.utn.frbb.tup.model.dto.MateriaDto;
import ar.edu.utn.frbb.tup.persistence.exception.MateriaNotFoundException;

import java.util.List;

public interface MateriaService {
    Materia crearMateria(MateriaDto inputData) throws IllegalArgumentException;

    List<Materia> getAllMaterias();

    Materia getMateriaById(int idMateria) throws MateriaNotFoundException;

    Materia modificarMateria(Integer idMateria, MateriaDto modData) throws MateriaNotFoundException, IllegalArgumentException;

    void eliminarMateria(Integer idMateria) throws MateriaNotFoundException;

    List<Materia> getMateriaByNombre(String unNombre) throws MateriaNotFoundException;

    List<Materia> getMateriaByNombreYCodigo(String ordenNombre, String ordenCodigo);
}
