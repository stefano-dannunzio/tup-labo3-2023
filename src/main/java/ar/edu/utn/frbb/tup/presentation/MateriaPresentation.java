package ar.edu.utn.frbb.tup.presentation;

import ar.edu.utn.frbb.tup.business.MateriaService;
import ar.edu.utn.frbb.tup.model.Materia;

import java.util.ArrayList;
import java.util.List;

public class MateriaPresentation extends AbtractBasePresentation {
    private static MateriaService materiaService;

    public MateriaPresentation(InputProcessor inputProcessor, MateriaService service) {
        super(inputProcessor);
        this.materiaService = service;
    }

    public void crearMateria() {
        Materia materia = (Materia) getInputProcessor().inputData();
        materiaService.crearMateria(materia);
    }

    public List<Materia> listarMaterias() {
        List<Materia> mats = materiaService.getAllMaterias();
        List<Materia> filtrado = new ArrayList<>();
        for (Materia m:
             mats) {
            if (m.getNombre().indexOf('3')>0) {
                continue;
            }
            filtrado.add(m);
        }
        return filtrado;
    }

}
