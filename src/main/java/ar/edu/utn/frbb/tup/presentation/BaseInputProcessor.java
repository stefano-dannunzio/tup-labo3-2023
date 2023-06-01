package ar.edu.utn.frbb.tup.presentation;

import java.util.Map;
import java.util.Scanner;

public abstract class BaseInputProcessor {
    private Scanner scanner = new Scanner(System.in);

    public abstract Object inputData();

    public void processInput(Class inputObjectClass, Object instance) {
        Map<String, String> fields = AttributeInspector.getAttributeInputStrategy(inputObjectClass);


        for (Map.Entry<String, String> entry:
                fields.entrySet()) {
            String tipoDeDatoALeer = entry.getValue();
            String nombreDeProperty = entry.getKey();
            InputStrategy inputStrategy = BaseInputStrategy.getStrategy(tipoDeDatoALeer);
            System.out.print("Ingrese valor para " + nombreDeProperty + ": ");
            Object consoleInput = inputStrategy.acceptInput(scanner);
            AttributeInspector.invokeSetter(inputObjectClass.cast(instance), entry.getKey(), consoleInput);
        }
    }
}
