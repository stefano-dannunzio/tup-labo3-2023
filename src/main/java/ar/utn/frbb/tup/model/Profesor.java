package ar.utn.frbb.tup.model;

import java.util.List;

public class Profesor {
    private final String nombre;
    private final String apellido;
    private final String titulo;

    private List<Materia> materiasDictadas;

    public Profesor(String nombre, String apellido, String titulo) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.titulo = titulo;
    }
}
