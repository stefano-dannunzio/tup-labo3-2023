package ar.utn.frbb.tup.persistence;

import ar.utn.frbb.tup.model.Alumno;

public interface AlumnoDAO {
    public Alumno load(int dni);
    public void store(Alumno a);



}
