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
        materiaPresentation = new MateriaPresentation(inputProcessor, materiaService);
    }

    @Test
    public void testCrearMateria() {
        Materia m = new Materia("labo 3", 2, 1, new Profesor("Lucho", "Salotto", "Lic"));
        when(inputProcessor.inputData()).thenReturn(m);
        materiaPresentation.crearMateria();
        verify(materiaService, times(1)).crearMateria(any(Materia.class));
    }

}