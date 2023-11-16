import java.util.Arrays;

public class ArraysExercises {

    public static Person[] addPerson(Person[] persons, Person person) {
        Person[] newArray = Arrays.copyOf(persons, persons.length + 1);
        newArray[persons.length] = person;
        return newArray;
    }
    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(numbers);

        Person[] persons = new Person[3];

        persons[0]  = new Person( "Joy");
        persons[1]  = new Person("Steve");
        persons[2]  = new Person("Kim");

        for (Person person : persons) {
            System.out.println(person.toString());
        }

    }

}

