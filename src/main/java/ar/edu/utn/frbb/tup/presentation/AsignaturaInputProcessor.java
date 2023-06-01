package ar.edu.utn.frbb.tup.presentation;

import ar.edu.utn.frbb.tup.model.Asignatura;

public class AsignaturaInputProcessor extends BaseInputProcessor{
    @Override
    public Object inputData() {
        Asignatura asignatura = new Asignatura();
        processInput(Asignatura.class, asignatura);
        return asignatura;
    }
}
