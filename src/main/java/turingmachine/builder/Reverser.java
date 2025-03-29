package turingmachine.builder;

public class Reverser {
    private final Program program;

    public Reverser(Program program) {
        this.program = program;
    }

    public void execute() {
        System.out.println("\nExecuting Reverser with program: " + program.getName());
        String result = HaltChecker.check(program, program.getName());

        System.out.println("HaltChecker result: " + result);

        if (result.equals("para")) {
            System.out.println("Entering infinite loop...");
            infiniteLoop();
        } else {
            System.out.println("Terminating immediately.");
        }
    }

    private void infiniteLoop() {
        // Simulamos un bucle infinito (limitado para la demostración)
        for (int i = 1; i <= 5; i++) {
            System.out.println("Still looping... iteration " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("(Infinite loop simulation ended after 5 iterations)");
    }
}