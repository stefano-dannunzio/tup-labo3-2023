package ar.edu.utn.frbb.tup;

import ar.edu.utn.frbb.tup.business.impl.MateriaServiceImpl;
import ar.edu.utn.frbb.tup.presentation.AlumnoPresentation;
import ar.edu.utn.frbb.tup.presentation.MateriaInputProcessor;
import ar.edu.utn.frbb.tup.presentation.MateriaPresentation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Hello world!
 *
 */
@Configuration
@ComponentScan(basePackages = "ar.edu.utn.frbb.tup")
public class App
{

    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(App.class);

        System.out.print("\033[H\033[2J");
        System.out.flush();
        MateriaPresentation materiaPresentation = context.getBean(MateriaPresentation.class);
        materiaPresentation.crearMateria();

        System.out.print("\033[H\033[2J");
        System.out.flush();
        AlumnoPresentation presentation = new AlumnoPresentation();
        presentation.crearAlumno();

        context.close();
    }
}
