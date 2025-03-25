package checker;

import factory.ProgramFactory;
import program.HaltingProgram;
import program.Program;

public class HaltChecker {
	public boolean checkHalt(Program program) {
		// TODO: Ask for advice on how to actually implement this
		return program instanceof HaltingProgram;
	}
}
