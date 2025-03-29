package turingmachine.builder;

public class Director {
    public void constructCountDownProgram(ProgramBuilder builder) {
        builder.setName("CountDown");
        builder.setCode(
                "num = 10\n" +
                        "while (num > 0) {\n" +
                        "    System.out.println(num);\n" +
                        "    num = num - 1;\n" +
                        "}\n"
        );
        builder.setTerminates(true);
    }

    public void constructCountUpProgram(ProgramBuilder builder) {
        builder.setName("CountUp");
        builder.setCode(
                "num = 1\n" +
                        "while (num != 0) {\n" +
                        "    System.out.println(num);\n" +
                        "    num = num + 1;\n" +
                        "}\n"
        );
        builder.setTerminates(false);
    }
}
