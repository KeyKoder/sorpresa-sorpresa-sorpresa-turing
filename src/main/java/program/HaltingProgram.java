package program;

public class HaltingProgram implements Program {

	@Override
	public void execute(int input) {
		for(int i = 0; i < input; i++) {
			System.out.println(i);
		}
	}
}
