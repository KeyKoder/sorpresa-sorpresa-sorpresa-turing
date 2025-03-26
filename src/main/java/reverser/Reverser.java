package reverser;

import checker.HaltChecker;
import factory.ProgramFactory;
import program.Program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Reverser implements Program {

	// If the input program halts, it doesn't
	// if the input program doesn't halt, it halts
	@Override
	public Object execute(Object... input) {
		boolean halted = false;
		if(input[0] instanceof ProgramFactory pf) {
//			List<Object> args = ;
//			args.removeFirst();
			Object[] args = List.of(input).subList(1, input.length).toArray();
			Program p = pf.createProgram();
			HaltChecker checker = new HaltChecker();
			halted = checker.checkHalt(p, args);
			if(!halted) return true;
		}
		// Simulate the program blocking due to incorrect input
		// or due to the input program halting
		while(true) {}
	}
}
