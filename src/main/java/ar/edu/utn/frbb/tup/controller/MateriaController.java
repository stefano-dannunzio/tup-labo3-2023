package ar.edu.utn.frbb.tup.controller;

import ar.edu.utn.frbb.tup.model.Materia;
import ar.edu.utn.frbb.tup.model.Profesor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("materia")
public class MateriaController {

    @GetMapping
    public List<Materia> getMaterias() {
        Materia m = new Materia("labo 1", 2, 1, new Profesor("Lucho", "Salotto", "Lic"));
        Materia m1 = new Materia("labo 2", 2, 1, new Profesor("Juan", "Perez", "Lic"));

        return Arrays.asList(m1, m);
    }
}
