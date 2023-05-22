package ar.utn.frbb.tup.persistence;

import ar.utn.frbb.tup.App;
import ar.utn.frbb.tup.model.Alumno;


import java.util.List;

public class AlumnoDAOImplementation implements AlumnoDAO {
    List<Alumno> lista = App.alumnos;

    @Override
    public Alumno load(int dni) {
    for (Alumno a : lista) {
            if (a.getDni() == dni) {
                return a;
            }
        }
        return null;


    }

    @Override
    public void store(Alumno a) {
        lista.add(a);

    }
}
