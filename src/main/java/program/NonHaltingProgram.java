package program;

public class NonHaltingProgram implements Program {

	@Override
	public void execute(Object input) {
		Integer i = 0;
		while(i != input) {
			System.out.println(i);
		}
	}
}
