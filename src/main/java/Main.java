import checker.HaltChecker;
import factory.HaltingProgramFactory;
import factory.NonHaltingProgramFactory;
import factory.ProgramFactory;
import program.Program;

public class Main {
	public static void main(String[] args) {
		HaltChecker haltChecker = new HaltChecker();
		ProgramFactory hpf = new HaltingProgramFactory();
		System.out.println(haltChecker.checkHalt(hpf.createProgram()));

		ProgramFactory nhpf = new NonHaltingProgramFactory();
		System.out.println(haltChecker.checkHalt(nhpf.createProgram()));
	}
}
