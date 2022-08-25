package BogOpgave;

import java.util.ArrayList;

public class Bibliotek {

    private ArrayList<Bog> bøger = new ArrayList<>();

    public void addBooks() {
        bøger.add(new Bog(18273, "Harry Potter", 2003));
        bøger.add(new Bog(12745, "Post Office", 1971));
        bøger.add(new Bog(98823, "The Old Book", 1306));
    }

    public boolean checkIfSame(Bog bog1, Bog bog2) {
        for (int i = 0; i < bøger.size(); i++) {
            bog1 = bøger.get(i);
            bog2 = bøger.get(i+1);
            if (bog1.getISBNNummer() == bog2.getISBNNummer()) {
                return true;
            }
        }
        return false;
    }

}
