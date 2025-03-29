package MaquinaTurim.Builder;

class ConcreteProgramBuilder implements ProgramBuilder {
    private String name;
    private String code;
    private boolean terminates;

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public void setTerminates(boolean terminates) {
        this.terminates = terminates;
    }

    @Override
    public Program getResult() {
        return new Program(name, code, terminates);
    }
}