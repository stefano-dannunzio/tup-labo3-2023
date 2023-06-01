package ar.edu.utn.frbb.tup.model;

import java.util.ArrayList;
import java.util.List;

public class Materia {

    private int materiaId;
    private String nombre;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getCuatrimestre() {
        return cuatrimestre;
    }

    public void setCuatrimestre(int cuatrimestre) {
        this.cuatrimestre = cuatrimestre;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public void setCorrelatividades(List<Materia> correlatividades) {
        this.correlatividades = correlatividades;
    }

    private int anio;
    private int cuatrimestre;
    private Profesor profesor;

    private List<Materia> correlatividades;

    public Materia(){}


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

    public int getMateriaId() {
        return materiaId;
    }

    public void setMateriaId(int materiaId) {
        this.materiaId = materiaId;
    }
}
