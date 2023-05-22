package ar.edu.utn.frbb.tup.model;

import java.util.ArrayList;
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

        correlatividades = new ArrayList<>();
    }

    public void agregarCorrelatividad(Materia m){
        this.correlatividades.add(m);

    }

    public List<Materia> getCorrelatividades(){
        return this.correlatividades;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Materia> getCorrelativas() {
        return correlatividades;
    }
}
