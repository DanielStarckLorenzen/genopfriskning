package Kvadrat;

public class Kvadrat {

    public void go(int heltal) {
        for (int i = 0; i < heltal; i++) {
            for (int j = 0; j < heltal; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        new Kvadrat().go(6);
    }

}
