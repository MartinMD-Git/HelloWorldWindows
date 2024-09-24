import java.util.ArrayList;

public class Arrayliste {
    public static void main(String[] args) {
        String[] fruits = new String[4];
        fruits[0] = "apple";
        fruits[1] = "orange";
        fruits[2] = "mango";
        fruits[3] = "pear";
        System.out.println(fruits[0]);

        ArrayList FruitList = new ArrayList();
        FruitList.add("apple");
        FruitList.add("orange");
        FruitList.add("mango");
        FruitList.add("watermelon");
        FruitList.remove("apple");
        FruitList.clear();

        System.out.println(FruitList);
    }
}
