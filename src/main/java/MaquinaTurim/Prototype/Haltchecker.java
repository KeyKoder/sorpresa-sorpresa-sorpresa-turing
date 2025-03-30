package MaquinaTurim.Prototype;

public class Haltchecker {
    class HaltChecker {

        public static boolean willHalt(Program program, Program input) {

            if (program instanceof CountDownProgram) {
                return true;
            } else if (program instanceof CountUpProgram) {
                return false;
            } else if (program instanceof ReverserProgram) {

                if (input instanceof ReverserProgram) {
                    System.out.println("¡Paradoja detectada! No puedo determinar si Reverser se detendrá con él mismo como entrada");
                    return false;
                }

                return !willHalt(input, input);
            }
            return true;
        }
    }}
