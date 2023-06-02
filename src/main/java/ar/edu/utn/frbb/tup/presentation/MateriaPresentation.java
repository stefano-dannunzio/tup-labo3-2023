package ar.edu.utn.frbb.tup.presentation;

import ar.edu.utn.frbb.tup.business.MateriaService;
import ar.edu.utn.frbb.tup.model.Materia;

public class MateriaPresentation extends AbtractBasePresentation {
    private static MateriaService materiaService;

    public MateriaPresentation(InputProcessor inputProcessor, MateriaService service) {
        super(inputProcessor);
        this.materiaService = service;
    }

    public void crearMateria() {
        materiaService.crearMateria( (Materia) getInputProcessor().inputData());
    }

}
