package MaquinaTurim.Builder;

class Program {
    private final String name;
    private final String code;
    private final boolean terminates;

    public Program(String name, String code, boolean terminates) {
        this.name = name;
        this.code = code;
        this.terminates = terminates;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public boolean terminates() {
        return terminates;
    }

    // Método para ejecutar el programa con una entrada específica
    public void execute(String input) {
        System.out.println("Executing " + name + " with input: " + input);
        System.out.println("Code:\n" + code);

        if (name.equals("CountDown")) {
            int num = 10;
            while (num > 0) {
                System.out.println(num);
                num--;
                try {
                    Thread.sleep(100); // Para simular ejecución
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Program terminated successfully.");
        } else if (name.equals("CountUp")) {
            int num = 1;
            int limit = 20; // Para no ejecutar infinitamente en la simulación
            while (num <= limit) {
                System.out.println(num);
                num++;
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Program would run indefinitely in theory.");
        }
    }

    @Override
    public String toString() {
        return "Program: " + name + "\n" +
                "Terminates: " + (terminates ? "Yes" : "No") + "\n" +
                "Code:\n" + code;
    }
}