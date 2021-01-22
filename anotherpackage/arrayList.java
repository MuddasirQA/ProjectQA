package anotherpackage;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Collections;

public class arrayList {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Jack");
        names.add("Tyson");
        names.add("Fabio");
        names.add("Milky");

        System.out.println(names);
        for(int i=0; i<names.size(); i++){
            System.out.println(names.get(i));
        }
        for(String i: names){
            System.out.println((i));
        }
        System.out.println(names.get((0)));
        names.set(3,"Habib");
        System.out.println(names.get((3)));
        names.remove(1);
        Collections.sort(names);

        for(String i: names){
            System.out.println((i));
        }

        Collections.reverse(names);
        System.out.println(names);



    }
}
