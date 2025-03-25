package program;

public class NonHaltingProgram implements Program {

	@Override
	public void execute() {
		for(int i = 0; i < 10; i--) {
			// Do things
		}
	}
}
