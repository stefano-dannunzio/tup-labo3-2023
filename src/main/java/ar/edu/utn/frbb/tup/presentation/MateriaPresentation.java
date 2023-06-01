package ar.edu.utn.frbb.tup.presentation;

import ar.edu.utn.frbb.tup.business.MateriaService;
import ar.edu.utn.frbb.tup.business.impl.MateriaServiceImpl;
import ar.edu.utn.frbb.tup.model.Materia;

public class MateriaPresentation {
    private static final MateriaInputProcessor inputProcessor = new MateriaInputProcessor();
    private static final MateriaService materiaService = new MateriaServiceImpl();

    public void crearMateria() {
        materiaService.crearMateria( (Materia)inputProcessor.inputData());
    }

}
