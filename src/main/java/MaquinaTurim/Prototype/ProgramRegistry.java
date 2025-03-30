package MaquinaTurim.Prototype;

import java.util.HashMap;
import java.util.Map;

public class ProgramRegistry {
    private Map<String, Program> programs = new HashMap<>();

    public ProgramRegistry() {
        CountDownProgram countDown = new CountDownProgram();
        countDown.setName("CountDown");

        CountUpProgram countUp = new CountUpProgram();
        countUp.setName("CountUp");

        ReverserProgram reverser = new ReverserProgram();
        reverser.setName("Reverser");

        // Almacenar en el registro
        programs.put("CountDown", countDown);
        programs.put("CountUp", countUp);
        programs.put("Reverser", reverser);
    }

    public Program getProgram(String key) {
        return programs.get(key).clone();
    }

    public void addProgram(String key, Program program) {
        programs.put(key, program);
    }
}