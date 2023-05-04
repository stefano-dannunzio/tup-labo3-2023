package ar.utn.frbb.tup.model;

public class Asignatura {

    private final Materia materia;
    private final EstadoAsignatura estado;
    private int nota;

    public Asignatura(Materia materia, EstadoAsignatura estado) {
        this.materia = materia;
        this.estado = estado;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
}
