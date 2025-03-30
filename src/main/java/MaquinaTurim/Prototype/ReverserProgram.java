package MaquinaTurim.Prototype;

class ReverserProgram extends Program {

    public ReverserProgram() {
    }

    public ReverserProgram(ReverserProgram source) {
        super(source);
    }

    @Override
    public void execute(Program input) {
        System.out.println("Ejecutando Reverser con " + input.getName() + " como entrada");
        boolean willHalt = Haltchecker.HaltChecker.willHalt(input, input);

        if (willHalt) {
            System.out.println("HaltChecker determinó que " + input.getName() + " se detendría, por lo que Reverser entra en bucle infinito");
            int i = 0;
            while (i < 10) { // Limitamos a 10 iteraciones para la simulación
                System.out.println("Iteración " + (i + 1) + " del bucle infinito (simulado)");
                i++;
            }
            System.out.println("... (bucle infinito simulado)");
        } else {
            System.out.println("HaltChecker determinó que " + input.getName() + " no se detendría, por lo que Reverser termina inmediatamente");
        }
    }

    @Override
    public Program clone() {
        return new ReverserProgram(this);
    }
}
