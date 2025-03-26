package program;

public class NonHaltingProgram implements Program {

	// Solo utiliza una entrada
	@Override
	public Object execute(Object... input) {
		Integer i = 0;
		while(i != input[0]) {
//			System.out.println(i);
		}
		return i;
	}
}
