import turingmachine.builder.*;

public class TuringHaltingProblemDemo {
    public static void main(String[] args) {
        // Crear el director y builder
        Director director = new Director();
        ProgramBuilder builder = new ConcreteProgramBuilder();

        System.out.println("=== PROBLEMA DE PARAR DE TURING ===");
        System.out.println("Simulación del problema demostrado por Alan Turing en 1936\n");

        // Construir programa CountDown (que termina)
        director.constructCountDownProgram(builder);
        Program countDown = builder.getResult();
        System.out.println(countDown);
        System.out.println("\nEjecutando CountDown:");
        countDown.execute("N/A");

        System.out.println("\n" + "=".repeat(50) + "\n");

        // Construir programa CountUp (que no termina)
        director.constructCountUpProgram(builder);
        Program countUp = builder.getResult();
        System.out.println(countUp);
        System.out.println("\nEjecutando CountUp (limitado para demostración):");
        countUp.execute("N/A");

        System.out.println("\n" + "=".repeat(50) + "\n");

        // Demostrar HaltChecker
        System.out.println("Usando HaltChecker:");
        System.out.println("CountDown: " + HaltChecker.check(countDown, "input"));
        System.out.println("CountUp: " + HaltChecker.check(countUp, "input"));

        System.out.println("\n" + "=".repeat(50) + "\n");

        // Demostrar Reverser
        System.out.println("=== DEMOSTRACIÓN DE REVERSER ===");

        // Reverser con CountDown
        Reverser reverserWithCountDown = new Reverser(countDown);
        reverserWithCountDown.execute();

        System.out.println("\n" + "-".repeat(30) + "\n");

        // Reverser con CountUp
        Reverser reverserWithCountUp = new Reverser(countUp);
        reverserWithCountUp.execute();

        System.out.println("\n" + "=".repeat(50) + "\n");

        // La paradoja de Reverser
        System.out.println("=== LA PARADOJA DEL PROBLEMA DE PARAR ===");
        System.out.println("¿Qué pasaría si ejecutamos Reverser consigo mismo?");
        System.out.println("Si Reverser se detiene cuando HaltChecker dice 'nunca'");
        System.out.println("y entra en bucle infinito cuando HaltChecker dice 'para'...");
        System.out.println("\nSi HaltChecker dice que Reverser para -> Reverser entra en bucle infinito -> Contradicción");
        System.out.println("Si HaltChecker dice que Reverser no para -> Reverser termina inmediatamente -> Contradicción");
        System.out.println("\nEsta contradicción prueba que un HaltChecker perfecto no puede existir.");
        System.out.println("Por lo tanto, el problema de parar es indecidible.");
    }
}