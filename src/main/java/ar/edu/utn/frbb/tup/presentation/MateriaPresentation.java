package ar.edu.utn.frbb.tup.presentation;

import ar.edu.utn.frbb.tup.business.MateriaService;
import ar.edu.utn.frbb.tup.model.Materia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MateriaPresentation extends AbtractBasePresentation {

    private MateriaService materiaService;

    @Autowired
    public MateriaPresentation(MateriaService materiaService, @Qualifier("materiaInputProcessor") InputProcessor inputProcessor) {
        super(inputProcessor);
        this.materiaService = materiaService;
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
            if (m.getNombre() != null && m.getNombre().indexOf('3')>0) {
                continue;
            }
            filtrado.add(m);
        }
        return filtrado;
    }

}
