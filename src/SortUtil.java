import java.lang.reflect.Array;
import java.util.Arrays;

public class SortUtil {

    public static <T> Precedable<T>[] sort(Precedable<T>[] arr) {
        boolean keepSorting;

        for (int i = 0; i < arr.length - 1; i++) {
            keepSorting = false;

            for (int j = 0; j < arr.length - 1; j++) {
                int precedes = arr[j].precedeTo((T) arr[j + 1]);
                if (precedes > 0) {
                    Precedable<T> temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    keepSorting = true;
                }
            }

            if (!keepSorting) break;
        }

        return arr;
    }

    public static void main(String[] args) {
        SortUtil sortTool = new SortUtil();

        System.out.println("The sorting tool when working with the class Person places the younger people at the beginning of the array, " +
                "and the older at the end (it takes the DNI of each person to make the comparisons). " +
                "When working with the class Cellphone, the comparisons are done taking into account the names of the owners");
        System.out.println("");

        Person person1 = new Person("Melisa Onofri", 41137348);
        Person person2 = new Person("Gabriela Lemos", 20568455);
        Person person3 = new Person("Lorenzo Repetto", 38558756);
        Person person4 = new Person("Filomena Mura", 5869423);

        Precedable<Person> notSortedArr[] = new Precedable[4];

        notSortedArr[0] = person1;
        notSortedArr[1] = person2;
        notSortedArr[2] = person3;
        notSortedArr[3] = person4;

        System.out.println("Sorting people...");
        System.out.println("");

        System.out.println("The array before sorting is the following: ");
        System.out.println(Arrays.toString(notSortedArr));

        Precedable<Person> sortedArr[] = sortTool.sort(notSortedArr);
        System.out.println("");

        System.out.println("The array after sorting is the following: ");
        System.out.println(Arrays.toString(sortedArr));
        System.out.println("");

        Cellphone cell1 = new Cellphone(156423598, "Melisa");
        Cellphone cell2 = new Cellphone(156982346, "Lorenzo");
        Cellphone cell3 = new Cellphone(158749634, "Angela");
        Cellphone cell4 = new Cellphone(158964723, "Camila");

        Precedable<Cellphone> notSortedArrCell[] = new Precedable[4];

        notSortedArrCell[0] = cell1;
        notSortedArrCell[1] = cell2;
        notSortedArrCell[2] = cell3;
        notSortedArrCell[3] = cell4;

        System.out.println("Sorting cellphones...");
        System.out.println("");

        System.out.println("The array before sorting is the following: ");
        System.out.println(Arrays.toString(notSortedArrCell));

        Precedable<Cellphone> sortedArrCell[] = sortTool.sort(notSortedArrCell);
        System.out.println("");

        System.out.println("The array after sorting is the following: ");
        System.out.println(Arrays.toString(sortedArrCell));
    }
}
