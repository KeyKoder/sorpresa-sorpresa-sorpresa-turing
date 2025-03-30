import checker.HaltChecker;
import factory.HaltingProgramFactory;
import factory.NonHaltingProgramFactory;
import factory.ProgramFactory;
import program.Program;
import reverser.Reverser;

public class Main {
	public static void main(String[] args) {
		HaltChecker haltChecker = new HaltChecker();
		ProgramFactory hpf = new HaltingProgramFactory();
		System.out.println("Halting Program");
		System.out.println("Halted: " + haltChecker.checkHalt(hpf.createProgram(), 100));
		System.out.println();

		ProgramFactory nhpf = new NonHaltingProgramFactory();
		System.out.println("Non Halting Program");
		System.out.println("Halted: " + haltChecker.checkHalt(nhpf.createProgram(), 100));
		System.out.println();

		Program rev = new Reverser();
		System.out.println("Reverser Halting");
		System.out.println("Halted: " + haltChecker.checkHalt(rev, hpf, 100));
		System.out.println();

		System.out.println("Reverser Non Halting");
		System.out.println("Halted: " + haltChecker.checkHalt(rev, nhpf, 100));
		System.out.println();
	}
}
