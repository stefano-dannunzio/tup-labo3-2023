package ar.edu.utn.frbb.tup.presentation;

import ar.edu.utn.frbb.tup.business.MateriaService;
import ar.edu.utn.frbb.tup.model.Materia;
import ar.edu.utn.frbb.tup.model.Profesor;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class MateriaPresentationTest {

    @Mock
    private  MateriaService materiaService;

    @Mock
    private  InputProcessor inputProcessor;

    private static MateriaPresentation materiaPresentation;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        materiaPresentation = new MateriaPresentation(materiaService, inputProcessor);
    }

    @Test
    public void testCrearMateria() {
        Materia m = new Materia("labo 3", 2, 1, new Profesor("Lucho", "Salotto", "Lic"));
        when(inputProcessor.inputData()).thenReturn(m);
        materiaPresentation.crearMateria();
        verify(materiaService, times(1)).crearMateria(any(Materia.class));
    }

    @Test
    public void testListarMaterias_filtraOK() {
        Materia m = new Materia("labo 3", 2, 1, new Profesor("Lucho", "Salotto", "Lic"));
        Materia m1 = new Materia("labo 2", 2, 1, new Profesor("Juan", "Perez", "Lic"));
        when(materiaService.getAllMaterias()).thenReturn(Arrays.asList(m,m1));
        List<Materia> mats = materiaPresentation.listarMaterias();
        assertEquals(1, mats.size());
    }

    @Test
    public void testListarMaterias_noFiltra() {
        Materia m = new Materia("labo 1", 2, 1, new Profesor("Lucho", "Salotto", "Lic"));
        Materia m1 = new Materia("labo 2", 2, 1, new Profesor("Juan", "Perez", "Lic"));
        when(materiaService.getAllMaterias()).thenReturn(Arrays.asList(m,m1));
        List<Materia> mats = materiaPresentation.listarMaterias();
        assertEquals(2, mats.size());
    }

    @Test
    public void testListMaterias_nombreNull() {
        Materia m = new Materia(null, 2, 1, new Profesor("Lucho", "Salotto", "Lic"));
        Materia m1 = new Materia("labo 2", 2, 1, new Profesor("Juan", "Perez", "Lic"));
        when(materiaService.getAllMaterias()).thenReturn(Arrays.asList(m,m1));
        List<Materia> mats = materiaPresentation.listarMaterias();
        assertEquals(2, mats.size());
    }

}