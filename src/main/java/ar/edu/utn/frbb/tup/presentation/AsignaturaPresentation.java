package ar.edu.utn.frbb.tup.presentation;

import ar.edu.utn.frbb.tup.business.impl.MateriaServiceImpl;

public class AsignaturaPresentation {
    private static final AsignaturaInputProcessor asignaturaInputProcessor = new AsignaturaInputProcessor();
    private static final MateriaPresentation materiaPresentation = new MateriaPresentation(new MateriaServiceImpl(), new MateriaInputProcessor());


    public void crearAsignatura(){

    }
}
