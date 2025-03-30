package MaquinaTurim.Prototype;

class CountDownProgram extends Program {
    private int counter;

    public CountDownProgram() {
        this.counter = 10;
    }

    public CountDownProgram(int startValue) {
        this.counter = startValue;
    }

    public CountDownProgram(CountDownProgram source) {
        super(source);
        if (source != null) {
            this.counter = source.counter;
        }
    }

    @Override
    public void execute(Program input) {
        System.out.println("Ejecutando CountDown desde " + counter);
        while (counter > 0) {
            System.out.println("Contador: " + counter);
            counter--;
        }
        System.out.println("CountDown completado");
    }

    @Override
    public Program clone() {
        return new CountDownProgram(this);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof CountDownProgram) || !super.equals(obj)) return false;
        CountDownProgram program = (CountDownProgram) obj;
        return program.counter == counter;
    }
}