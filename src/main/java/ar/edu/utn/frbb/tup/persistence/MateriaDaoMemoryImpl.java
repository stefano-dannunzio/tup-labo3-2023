package ar.edu.utn.frbb.tup.persistence;

import ar.edu.utn.frbb.tup.model.Materia;
import ar.edu.utn.frbb.tup.persistence.exception.MateriaNotFoundException;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class MateriaDaoMemoryImpl implements MateriaDao {

    private static final Map<Integer, Materia> repositorioMateria = new HashMap<>();
    private static int contadorId = 0;
    @Override
    public Materia save(Materia materia) {
        int nuevoID = generarnuevoID();
        materia.setMateriaId(nuevoID);
        repositorioMateria.put(materia.getMateriaId(), materia);
        return materia;
    }

    @Override
    public Materia findById(int idMateria) throws MateriaNotFoundException {
        for (Materia m:
             repositorioMateria.values()) {
            if (idMateria == m.getMateriaId()) {
                return m;
            }
        }
        throw new MateriaNotFoundException("No se encontró la materia con id " + idMateria);
    }

    @Override
    public Materia modify(Integer idMateria, Materia m) throws MateriaNotFoundException{
        //CHEQUEA QUE PRIMERO EXISTA Y LUEGO MODIFICA LA MATERIA
        repositorioMateria.put(findById(idMateria).getMateriaId(), m);
        return m;
    }

    @Override
    public void delete(Integer idMateria) throws MateriaNotFoundException{
        //CHEQUEA QUE PRIMERO EXISTA Y LUEGO ELIMINA LA MATERIA
        repositorioMateria.remove(findById(idMateria).getMateriaId());

    }

    @Override
    public List<Materia> findByNombre(String unNombre) throws MateriaNotFoundException {
        List<Materia> listaMaterias = new ArrayList<>();
        for (Materia m:
                repositorioMateria.values()) {
            if (m.getNombre().toLowerCase().contains(unNombre.toLowerCase())) {
                listaMaterias.add(m);
            }
        }
        if (listaMaterias.isEmpty()) {
            throw new MateriaNotFoundException("No se encontró la materia con nombre " + unNombre);
        }
        else {
            return listaMaterias;
        }
    }

    @Override
    public List<Materia> sortByNombreYCodigo(String ordenNombre, String ordenCodigo) {
        List<Materia> listaMaterias = new ArrayList<>();
        listaMaterias.addAll(repositorioMateria.values());
        if (ordenNombre.equalsIgnoreCase("asc")) {
            listaMaterias.sort(Comparator.comparing(Materia::getNombre));
        } else {
            listaMaterias.sort(Comparator.comparing(Materia::getNombre).reversed());
        }

        if (ordenCodigo.equalsIgnoreCase("asc")) {
            listaMaterias.sort(Comparator.comparing(Materia::getMateriaId));
        } else {
            listaMaterias.sort(Comparator.comparing(Materia::getMateriaId).reversed());
        }

        return listaMaterias;
    }

    private synchronized int generarnuevoID() { return ++contadorId; }
}
