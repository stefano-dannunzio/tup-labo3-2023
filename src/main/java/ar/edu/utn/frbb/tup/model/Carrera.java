package ar.edu.utn.frbb.tup.model;

import java.util.ArrayList;
import java.util.List;

public class Carrera {

    private final String nombre;
    private int cantidadCuatrimestres;
    private int id_departamento;
    private List<Materia> materiasList;

    public Carrera(String nombre, int cantidadCuatrimestres) {
        this.nombre = nombre;
        this.cantidadCuatrimestres = cantidadCuatrimestres;
        materiasList = new ArrayList<>();
    }

    public void agregarMateria(Materia materia) {
        materiasList.add(materia);
    }
}
