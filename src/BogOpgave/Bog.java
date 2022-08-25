package BogOpgave;

public class Bog {

    private int ISBNNummer;
    private String titel;
    private int udgivelsesår;

    public Bog(int ISBNNummer, String titel, int udgivelsesår) {
        this.ISBNNummer = ISBNNummer;
        this.titel = titel;
        this.udgivelsesår = udgivelsesår;
    }

    public int getISBNNummer() {
        return ISBNNummer;
    }

    public void setISBNNummer(int ISBNNummer) {
        this.ISBNNummer = ISBNNummer;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public int getUdgivelsesår() {
        return udgivelsesår;
    }

    public void setUdgivelsesår(int udgivelsesår) {
        this.udgivelsesår = udgivelsesår;
    }

    @Override
    public String toString() {
        return "Bog{" +
                "ISBNNummer=" + ISBNNummer +
                ", titel='" + titel + '\'' +
                ", udgivelsesår=" + udgivelsesår +
                '}';
    }
}
