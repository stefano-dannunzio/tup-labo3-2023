package ar.utn.frbb.tup.model;

import java.util.List;

public class Materia {

    private final String nombre;
    private final int anio;
    private final int cuatrimestre;
    private final Profesor profesor;

    private List<Materia> correlatividades;

    public Materia(String nombre, int anio, int cuatrimestre, Profesor profesor) {
        this.anio = anio;
        this.cuatrimestre = cuatrimestre;
        this.nombre = nombre;
        this.profesor = profesor;
    }

    public void agregarCorrelatividad(Materia m){

    }

    public String getNombre() {
        return nombre;
    }

    public List<Materia> getCorrelativas() {
        return correlatividades;
    }
}
