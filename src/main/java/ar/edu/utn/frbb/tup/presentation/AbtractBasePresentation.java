package ar.edu.utn.frbb.tup.presentation;

public abstract class AbtractBasePresentation {
    private static InputProcessor inputProcessor;

    public AbtractBasePresentation(InputProcessor inputProcessor) {
        this.inputProcessor = inputProcessor;
    }

    public static InputProcessor getInputProcessor() {
        return inputProcessor;
    }
}
