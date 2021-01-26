package qa.com;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Person alpha = new Person("harold", "23", "engineer");
        Person beta = new Person("marcus", "49", "baker");
        List<Person> people = new ArrayList<>();

        people.add(alpha);
        people.add(beta);

        for (Person i : people) {
            System.out.println((i.toString()));
        }
        for (Person i : people) {
            if (people.equals("harold")) {
                System.out.println(i.toString());
            }
        }
        Scanner sef = new Scanner(System.in);
        System.out.println("what would you like to do");
        sef.nextLine();
        System.out.println("1, create new person");

        System.out.println("2, show all people in list");

        System.out.println("3, search for a specific person");

        String choice = sef.nextLine();
        if (choice.equals("1")) {

            System.out.println("please enter a name");
            String nametag = sef.nextLine();
            System.out.println("please enter an age");
            String agetag = sef.nextLine();
            System.out.println("please enter jobtitle");
            String jobtage = sef.nextLine();
            System.out.println("your person was sucessfully added");
            Person custom = new Person(nametag, agetag, jobtage);

           people.add(custom);
            for (Person i : people) {
                System.out.println((i.toString()));


            }



        }

        for (Person i : people) {
            System.out.println((i.toString()));


        }

    }
}









