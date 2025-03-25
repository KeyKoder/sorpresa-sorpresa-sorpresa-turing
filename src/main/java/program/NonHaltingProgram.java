package program;

public class NonHaltingProgram implements Program {

	@Override
	public void execute(int input) {
		for(int i = 0; i < input; i--) {
			// Do things
		}
	}
}
