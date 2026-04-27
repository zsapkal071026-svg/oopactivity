import java.util.*;

public class Pr32 {

    public static <T> boolean searchElement(LinkedList<T> list, T element) {
        return list.contains(element);
    }

    public static void main(String[] args) {
        LinkedList<Integer> intList = new LinkedList<>();
        intList.add(10);
        intList.add(20);
        intList.add(30);

        System.out.println("Search 20 in Integer List: " + searchElement(intList, 20));
        System.out.println("Search 40 in Integer List: " + searchElement(intList, 40));

        LinkedList<String> strList = new LinkedList<>();
        strList.add("Ram");
        strList.add("Shyam");
        strList.add("Mohan");

        System.out.println("Search Shyam in String List: " + searchElement(strList, "Shyam"));
        System.out.println("Search Riya in String List: " + searchElement(strList, "Riya"));
    }
}