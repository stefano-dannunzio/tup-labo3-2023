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
    public void testAprobarAasignatura() throws Exception{
        Asignatura asignatura = new Asignatura(materia);
        assertEquals(EstadoAsignatura.NO_CURSADA,asignatura.getEstado());
        asignatura.cursarAsignatura();
        asignatura.aprobarAsignatura(8);
        assertEquals(EstadoAsignatura.APROBADA,asignatura.getEstado());

    }

    @Test(expected = Exception.class)
    public void testAprobarAsignaturaMateriaNoCursada() throws Exception{
        Asignatura asignatura = new Asignatura(materia);
        asignatura.aprobarAsignatura(8);
    }

    @Test (expected = Exception.class)
    public void testAprobarAasignaturaYaAprobada() throws Exception{
        Asignatura asignatura = new Asignatura(materia);
        asignatura.cursarAsignatura();
        asignatura.aprobarAsignatura(8);
        assertEquals(EstadoAsignatura.APROBADA,asignatura.getEstado());
        asignatura.aprobarAsignatura(9);

    }

    @Test(expected = IllegalArgumentException.class)
    public void aprobarAsignaturaNotaMenorCero() throws Exception {
        Asignatura asignatura = new Asignatura(materia);
        asignatura.cursarAsignatura();
        asignatura.aprobarAsignatura(-3);
    }

    @Test(expected = IllegalArgumentException.class)
    public void aprobarAsignaturaNotaMayorDiez() throws Exception {
        Asignatura asignatura = new Asignatura(materia);
        asignatura.cursarAsignatura();
        asignatura.aprobarAsignatura(13);
    }

    @Test
    public void aprobarAsignaturaNotaDesaprobado() throws Exception {
        Asignatura asignatura = new Asignatura(materia);
        asignatura.cursarAsignatura();
        asignatura.aprobarAsignatura(3);
        assertEquals(EstadoAsignatura.CURSADA, asignatura.getEstado());
    }
}