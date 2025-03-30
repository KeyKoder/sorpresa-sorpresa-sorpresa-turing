package MaquinaTurim.Prototype;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

abstract class Program {
    protected String name;

    public Program() {
    }

    public Program(Program source) {
        if (source != null) {
            this.name = source.name;
        }
    }

    // Método para ejecutar el programa con una entrada específica
    public abstract void execute(Program input);

    // Método abstracto para clonar (parte del patrón Prototype)
    public abstract Program clone();

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Program)) return false;
        Program program = (Program) obj;
        return Objects.equals(program.name, name);
    }
}