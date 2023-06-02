package ar.edu.utn.frbb.tup;

import ar.edu.utn.frbb.tup.business.impl.MateriaServiceImpl;
import ar.edu.utn.frbb.tup.presentation.AlumnoPresentation;
import ar.edu.utn.frbb.tup.presentation.MateriaInputProcessor;
import ar.edu.utn.frbb.tup.presentation.MateriaPresentation;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        System.out.print("\033[H\033[2J");
        System.out.flush();
        MateriaPresentation materiaPresentation = new MateriaPresentation(new MateriaInputProcessor(), new MateriaServiceImpl());
        materiaPresentation.crearMateria();

        System.out.print("\033[H\033[2J");
        System.out.flush();
        AlumnoPresentation presentation = new AlumnoPresentation();
        presentation.crearAlumno();


    }
}
