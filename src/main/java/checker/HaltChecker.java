package checker;

import factory.ProgramFactory;
import program.HaltingProgram;
import program.Program;

public class HaltChecker {
	public static final int EXECUTE_TIME_LIMIT_MILLIS = 20000; // 20 sec
	public boolean checkHalt(Program program, Object... programInput) {
		Thread programRunner = new Thread() {
			public void run() {
				System.out.println("ret " + program.getClass().getName() + " -> " + program.execute(programInput));
			}
		};

		programRunner.start();

		try {
			programRunner.join(EXECUTE_TIME_LIMIT_MILLIS);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
		System.out.println("alive " + program.getClass().getName() + " -> " + programRunner.isAlive());
		if (programRunner.isAlive()) {
			programRunner.interrupt();
			return false;
		}
		return true;
	}
}
