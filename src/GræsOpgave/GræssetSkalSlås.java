package GræsOpgave;

import java.util.Scanner;

public class GræssetSkalSlås {

    private double højdeNu;
    private double maksHøjde;
    private final double voksning = 0.8;

    private Scanner in = new Scanner(System.in);

    public double dageTilGræssetSkalSlås() {
        System.out.print("Hvor højt er græsset nu? ");
        højdeNu = in.nextDouble();
        System.out.print("Hvor højt skal græsset være? ");
        maksHøjde = in.nextDouble();

        return (maksHøjde - højdeNu) / voksning;
    }

    public static void main(String[] args) {
        GræssetSkalSlås main = new GræssetSkalSlås();
        //main.dageTilGræssetSkalSlås();
        System.out.println("Du skal slå græs om " + main.dageTilGræssetSkalSlås() + " dage");

    }

}
