package ar.utn.frbb.tup.persistence;

import ar.utn.frbb.tup.App;
import ar.utn.frbb.tup.model.Materia;

import java.util.List;

public class MateriaDAOImplementation implements MateriaDAO {
    List<Materia> lista = App.materias;
    @Override
    public Materia load(String nombre) {
        for (Materia m : lista) {
            if (m.getNombre().equals(nombre)) {
                return m;
            }
        }
        return null;

    }

    @Override
    public void store(Materia m) {
        lista.add(m);

    }
}
