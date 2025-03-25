package factory;

import program.NonHaltingProgram;
import program.Program;

public class NonHaltingProgramFactory implements ProgramFactory {

	@Override
	public Program createProgram() {
		return new NonHaltingProgram();
	}
}
