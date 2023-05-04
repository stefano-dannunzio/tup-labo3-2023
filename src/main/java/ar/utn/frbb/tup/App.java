package ar.utn.frbb.tup;

import ar.utn.frbb.tup.model.Materia;
import ar.utn.frbb.tup.model.Profesor;

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


        System.out.println( "Hello World!" );
    }
}
