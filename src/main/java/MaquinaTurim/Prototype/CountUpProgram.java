package MaquinaTurim.Prototype;

class CountUpProgram extends Program {
    private int counter;
    private final int maxIterations; // Para la simulación, limitamos las iteraciones

    public CountUpProgram() {
        this.counter = 1;
        this.maxIterations = 1000; // Valor arbitrario para simulación
    }

    public CountUpProgram(CountUpProgram source) {
        super(source);
        if (source != null) {
            this.counter = source.counter;
            this.maxIterations = source.maxIterations;
        } else {
            this.maxIterations = 1000;
        }
    }

    @Override
    public void execute(Program input) {
        System.out.println("Ejecutando CountUp desde " + counter);
        int iterations = 0;

        while (counter != 0) { // Condición que nunca se cumplirá
            System.out.println("Contador: " + counter);
            counter++;
            iterations++;

            if (iterations >= maxIterations) {
                System.out.println("Simulación detenida después de " + maxIterations + " iteraciones");
                System.out.println("Este programa nunca se detendría en un entorno real");
                break;
            }
        }
    }

    @Override
    public Program clone() {
        return new CountUpProgram(this);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof CountUpProgram) || !super.equals(obj)) return false;
        CountUpProgram program = (CountUpProgram) obj;
        return program.counter == counter && program.maxIterations == maxIterations;
    }
}