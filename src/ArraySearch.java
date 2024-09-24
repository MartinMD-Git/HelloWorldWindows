import java.util.ArrayList;
import java.util.Arrays;

public class ArraySearch {
    public static void main(String[] args) {
        ArrayList<Integer> tabel2 = new ArrayList<Integer>(Arrays.asList(2, 5, 11, 12, 19, 41, 33, 44, 55, 66, 77, 88, 99, 100));
        int searchNumber = 33;

        boolean fundet = false;
        for (Integer num : tabel2) {
            if (num == searchNumber) {
                fundet = true;
                break;

            }
        }
        if (!fundet) {
            System.out.println("Nummeret er ikke fundet i listen");
        } else {
            System.out.println("Nummeret er fundet i listen på plads " + tabel2.indexOf(searchNumber));


        }
    }
}
