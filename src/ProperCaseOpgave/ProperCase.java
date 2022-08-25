package ProperCaseOpgave;

import java.util.Locale;
import java.util.Scanner;

public class ProperCase {

    public void go(String sentence) {
        Scanner in = new Scanner(sentence).useDelimiter(" ");
        while (in.hasNext()) {
            String opdeling = in.next();
            for (char c : opdeling.toCharArray()) {
                if (Character.isLetter(c) && Character.isUpperCase(c))
                    System.out.print(c);
            }
            System.out.println("\n");
            if (opdeling.length() <= 3) {
                System.out.println(opdeling.toLowerCase(Locale.ROOT));
            }
        }
    }

    public static void main(String[] args) {
        new ProperCase().go("Test HEJ Ok");
    }
}
