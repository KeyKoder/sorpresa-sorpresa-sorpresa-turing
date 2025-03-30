package program;

public class HaltingProgram implements Program {

	// Solo utiliza una entrada
	@Override
	public Object execute(Object... input) {
		Integer i = 0;
		while(i != input[0]) {
			i++;
		}
		return i;
	}
}
