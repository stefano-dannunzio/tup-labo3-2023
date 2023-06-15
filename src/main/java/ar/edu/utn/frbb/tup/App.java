package ar.edu.utn.frbb.tup;

import ar.edu.utn.frbb.tup.business.impl.MateriaServiceImpl;
import ar.edu.utn.frbb.tup.presentation.AlumnoPresentation;
import ar.edu.utn.frbb.tup.presentation.MateriaInputProcessor;
import ar.edu.utn.frbb.tup.presentation.MateriaPresentation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App
{

    public static void main( String[] args )
    {
        SpringApplication.run(App.class);
    }
}
