package ar.edu.utn.frbb.tup;

import ar.edu.utn.frbb.tup.model.Alumno;
import ar.edu.utn.frbb.tup.model.Profesor;
import ar.edu.utn.frbb.tup.presentation.AlumnoInputProcessor;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Profesor lucho = new Profesor("Luciano", "Salotto", "Lic. en Cs. de la Computacion" );
        Profesor marcos = new Profesor("Marco", "Ustarroz", "Ing en Sistemas");
        Profesor rafa = new Profesor("Rafael", "Martinez", "Lic en Cs. de la Computacion");
        Profesor seba = new Profesor("Sebastian", "Zunini", "Lic en computación");

        //Materia programacion1 = new Materia()

        Alumno a = new Alumno();

        AlumnoInputProcessor  inputProcessor = new AlumnoInputProcessor();
        inputProcessor.processInput(a);
    }
}
