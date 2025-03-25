package factory;

import program.HaltingProgram;
import program.Program;

public class HaltingProgramFactory implements ProgramFactory {

	@Override
	public Program createProgram() {
		return new HaltingProgram();
	}
}
