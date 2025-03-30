package checker;

import factory.ProgramFactory;
import program.HaltingProgram;
import program.Program;

public class HaltChecker {
	// Como no es posible hacer una maquina/código que adivine si un programa termina o no
	// Vamos a simularlo haciendo que espere un tiempo determinado, y si el programa no ha terminado
	// tras ese tiempo, se considerará que el programa no termina
	public static final int EXECUTE_TIME_LIMIT_MILLIS = 20000; // 20 sec
	public boolean checkHalt(Program program, Object... programInput) {
		Thread programRunner = new Thread() {
			public void run() {
				System.out.println("Program " + program.getClass().getName() + " returned! Value: " + program.execute(programInput));
			}
		};

		programRunner.start();

		try {
			programRunner.join(EXECUTE_TIME_LIMIT_MILLIS);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
		System.out.println("Is program " + program.getClass().getName() + " still alive? -> " + programRunner.isAlive());
		if (programRunner.isAlive()) {
			programRunner.interrupt();
			return false;
		}
		return true;
	}
}
