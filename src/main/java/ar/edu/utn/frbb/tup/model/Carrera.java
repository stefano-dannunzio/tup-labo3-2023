package ar.edu.utn.frbb.tup.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Carrera {

    private final String nombre;
    private int codigo;
    private int cantidadCuatrimestres;
    private int id_departamento;
    private List<Materia> materiasList;

    public Carrera(String nombre, int cantidadCuatrimestres) {
        this.nombre = nombre;
        this.cantidadCuatrimestres = cantidadCuatrimestres;
        materiasList = new ArrayList<>();
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public int getCantidadCuatrimestres() {
        return this.cantidadCuatrimestres;
    }

    public void setCantidadCuatrimestres(int cantidad) {
        this.cantidadCuatrimestres = cantidad;
    }

    public int getIdDepartamento() {
        return this.id_departamento;
    }

    public void setIdDepartamento(int id) {
        this.id_departamento = id;
    }

    public void agregarMateria(Materia materia) {
        materiasList.add(materia);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Carrera carrera = (Carrera) o;
        return codigo == carrera.codigo && cantidadCuatrimestres == carrera.cantidadCuatrimestres && id_departamento == carrera.id_departamento && Objects.equals(nombre, carrera.nombre) && Objects.equals(materiasList, carrera.materiasList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, codigo, cantidadCuatrimestres, id_departamento, materiasList);
    }
}
