package ar.edu.utn.frbb.tup.presentation;

import ar.edu.utn.frbb.tup.model.Alumno;

import java.util.Map;
import java.util.Scanner;

public class AlumnoInputProcessor extends BaseInputProcessor{

    @Override
    public Object inputData() {
        Alumno alumnoInstance = new Alumno();
        processInput(Alumno.class, alumnoInstance);
        return alumnoInstance;
    }


}
