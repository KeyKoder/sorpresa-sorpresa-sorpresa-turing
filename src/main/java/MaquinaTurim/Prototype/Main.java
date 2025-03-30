package MaquinaTurim.Prototype;

public class Main {
	public static void main(String[] args) {
		ProgramRegistry registry = new ProgramRegistry();

		System.out.println("=== DEMOSTRACIÓN DEL PROBLEMA DE PARAR ===\n");

		// Demostración 1: Verificar un programa que se detiene
		System.out.println("1. Programa que se detiene (CountDown):");
		Program countDown = registry.getProgram("CountDown");
		boolean countDownHalts = Haltchecker.HaltChecker.willHalt(countDown, countDown);
		System.out.println("HaltChecker determina que CountDown " +
				(countDownHalts ? "se detiene" : "no se detiene"));
		countDown.execute(countDown);
		System.out.println();

		// Demostración 2: Verificar un programa que no se detiene
		System.out.println("2. Programa que no se detiene (CountUp):");
		Program countUp = registry.getProgram("CountUp");
		boolean countUpHalts = Haltchecker.HaltChecker.willHalt(countUp, countUp);
		System.out.println("HaltChecker determina que CountUp " +
				(countUpHalts ? "se detiene" : "no se detiene"));
		countUp.execute(countUp);
		System.out.println();

		// Demostración 3: Programa Reverser con CountDown como entrada
		System.out.println("3. Reverser con CountDown como entrada:");
		Program reverser1 = registry.getProgram("Reverser");
		Program countDownInput = registry.getProgram("CountDown");
		reverser1.execute(countDownInput);
		System.out.println();

		// Demostración 4: Programa Reverser con CountUp como entrada
		System.out.println("4. Reverser con CountUp como entrada:");
		Program reverser2 = registry.getProgram("Reverser");
		Program countUpInput = registry.getProgram("CountUp");
		reverser2.execute(countUpInput);
		System.out.println();

		// Demostración 5: La paradoja - Reverser con Reverser como entrada
		System.out.println("5. La paradoja - Reverser con sí mismo como entrada:");
		Program reverser3 = registry.getProgram("Reverser");
		Program reverserInput = registry.getProgram("Reverser");
		reverser3.execute(reverserInput);
		System.out.println();

		System.out.println("=== CONCLUSIÓN ===");
		System.out.println("Como se demuestra en el caso 5, el problema de parar es indecidible.");
		System.out.println("Es imposible crear un algoritmo que determine con certeza");
		System.out.println("si cualquier programa arbitrario se detendrá o no para cualquier entrada.");
	}
}

