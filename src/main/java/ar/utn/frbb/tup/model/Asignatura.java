package ar.utn.frbb.tup.model;

import java.util.Optional;

public class Asignatura {

    private final Materia materia;
    private EstadoAsignatura estado;
    private Integer nota;

    public Asignatura(Materia materia) {
        this.materia = materia;
        this.estado = EstadoAsignatura.NO_CURSADA;
    }

    public Optional<Integer> getNota() {
        return Optional.ofNullable(nota);
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public EstadoAsignatura getEstado() {
        return estado;
    }

    public void setEstado(EstadoAsignatura estado) {
        this.estado = estado;
    }

    public String getNombreAsignatura(){
        return this.materia.getNombre();
    }

    public void cursarAsignatura(){
        this.estado = EstadoAsignatura.CURSADA;
    }

    public void aprobarAsignatura(int nota) throws Exception{
        if (nota<0 || nota>10){
            throw new IllegalArgumentException("La nota debe estar entre 0 y 10");
        }
        if (!this.estado.equals(EstadoAsignatura.CURSADA)) {
            throw new Exception("La materia debe estar cursada");
        }

        if (nota>=4 && nota<=10) {
            this.estado = EstadoAsignatura.APROBADA;
            this.nota = nota;
        }


    }

}
