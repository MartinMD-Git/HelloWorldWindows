import java.util.ArrayList;

public class Person {
    private String name;
    private String height;


    public Person(String name, String height){
        this.name = name;
        this.height = height;
    }

    public String getName() {
        return name;
    }
    public String getHeight(){
        return height;
    }


    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("Martin", "190"));
        people.add(new Person("Jonas", "184"));
        people.add(new Person("Daniel", "178"));
        people.add(new Person("Anne", "165"));

        for (Person person : people) {
            double heightInCm = Double.parseDouble(person.getHeight());

            if(heightInCm > 170) {
                System.out.println(person.getName() + " er " + heightInCm + " cm. (høj)");
            }
        }

    }
}
