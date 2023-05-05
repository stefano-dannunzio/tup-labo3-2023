package ar.utn.frbb.tup.model;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;



public class AsignaturaTest {

    private static Materia materia;
    private static Profesor profesor;

    @BeforeClass
    public static void setUp(){
        profesor = new Profesor("Luciano", "Salotto", "Lic.");
        materia = new Materia("Laboratorio 3", 2, 1, profesor);
    }

    @Test
    public void testNewAsignatura() {
        Asignatura asignatura = new Asignatura(materia);
        assertEquals(EstadoAsignatura.NO_CURSADA, asignatura.getEstado());
        assertFalse(asignatura.getNota().isPresent());
        assertEquals("Laboratorio 3", asignatura.getNombreAsignatura());
    }

    @Test
    public void setNota() {
    }
}