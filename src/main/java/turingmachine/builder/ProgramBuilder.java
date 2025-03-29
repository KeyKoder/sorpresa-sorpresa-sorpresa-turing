package turingmachine.builder;

public interface ProgramBuilder {
    void setName(String name);
    void setCode(String code);
    void setTerminates(boolean terminates);
    Program getResult();
}