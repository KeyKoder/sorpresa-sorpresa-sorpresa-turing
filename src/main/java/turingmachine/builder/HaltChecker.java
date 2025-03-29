package turingmachine.builder;

public class HaltChecker {
    public static String check(Program program, String input) {
        // En un caso real, esta función sería imposible de implementar correctamente
        // para todos los programas posibles. Aquí simplemente usamos el conocimiento
        // predefinido sobre si el programa termina.
        System.out.println("Checking if " + program.getName() + " halts with input: " + input);

        if (program.terminates()) {
            return "para";
        } else {
            return "nunca";
        }
    }
}