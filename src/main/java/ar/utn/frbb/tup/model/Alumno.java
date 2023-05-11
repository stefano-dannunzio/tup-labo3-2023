package ar.utn.frbb.tup.model;

import ar.utn.frbb.tup.model.exception.CorrelatividadesNoAprobadasException;

import java.util.ArrayList;
import java.util.List;

public class Alumno {

    private final String nombre;
    private final String apellido;
    private final long dni;

    private List<Asignatura> asignaturas;

    public Alumno(String nombre, String apellido, long dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;

        asignaturas = new ArrayList<>();

    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public long getDni() {
        return dni;
    }

    public void agregarAsignatura(Asignatura a){
        this.asignaturas.add(a);
    }

    public List<Asignatura> obtenerListaAsignaturas(){
        return this.asignaturas;
    }

    //PARA APROBAR UNA ASIGNATURA NECESITA TENER TODAS LAS CORRELATIVIDADES APROBADAS
    public boolean puedeAprobar(Asignatura a) throws CorrelatividadesNoAprobadasException {
        boolean puedeAprobar = true;
        if (a.getMateria().getCorrelatividades().isEmpty()) {
            return puedeAprobar;
        }

        for (Materia m : a.getMateria().getCorrelatividades()) {
            for (Asignatura asignatura : asignaturas) {
                if (asignatura.getNombreAsignatura().equals(m.getNombre())) {
                    if (!asignatura.getEstado().equals(EstadoAsignatura.APROBADA)) {
                        throw new CorrelatividadesNoAprobadasException("Una o mas correlatividades no estan aprobadas");
                    }
                }
            }
        }
        return puedeAprobar;

    }
}
