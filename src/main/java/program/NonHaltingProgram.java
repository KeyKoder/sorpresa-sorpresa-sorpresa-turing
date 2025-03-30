package program;

public class NonHaltingProgram implements Program {

	// Solo utiliza una entrada
	@Override
	public Object execute(Object... input) {
		Integer i = 0;
		while(i != input[0]) {
			// No hacer nada, o contar hacia abajo, sería lo mismo por ahora
			// Exceptuando el caso de que si contamos hacia abajo, eventualmente el programa terminaría
			// por que llegaría al tamaño minimo de un entero en java (-2147483648 o Integer.MIN_VALUE) y haría overflow, contando desde el
			// tamaño máximo de un entero (2147483647 o Integer.MAX_VALUE) hacia abajo hasta llegar al número deseado
		}
		return i;
	}
}
