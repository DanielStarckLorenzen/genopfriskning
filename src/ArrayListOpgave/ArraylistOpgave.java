package ArrayListOpgave;

import java.util.ArrayList;

public class ArraylistOpgave {

    public boolean doesArraylistContainString(ArrayList arrayList, String s) {
        if (arrayList.contains(s)) {
            System.out.println("The String has been found!");
            return true;
        }
        else {
            arrayList.add(s);
            return false;
        }
    }
}
