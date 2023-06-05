package ar.edu.utn.frbb.tup.presentation;

import ar.edu.utn.frbb.tup.model.Materia;
import org.springframework.stereotype.Component;

@Component("materiaInputProcessor")
public class MateriaInputProcessor extends BaseInputProcessor{
    @Override
    public Object inputData() {
        Materia m = new Materia();
        processInput(Materia.class, m);
        return m;
    }
}
