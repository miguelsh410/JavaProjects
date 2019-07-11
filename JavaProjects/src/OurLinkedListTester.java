import java.io.OutputStream;

public class OurLinkedListTester
{

    public static void main(String[] args)
    {
        final OurLinkedList ourList = new OurLinkedList(); // empty list
        ourList.add(5);     // modifies ourList by adding 5 at the end.
        ourList.add(9);     // adds 9 at the end, so 5 links to 9.
        ourList.add(3);
        ourList.add(10);
        ourList.add(5);	    // List is now 5 -> 9 -> 3 -> 10 -> 5.

        ourList.add(2, 4);  // inserts 4 at position 2, so 9 links to 4, which links to 3.

        ourList.add(8, 6);   // inserts 6 at position 8 (i.e. the end of the list).

        ourList.add(0, 1);  // inserts 1 at position 0, so 1 links to 5, 5 links to 9.

        System.out.println(ourList); // Should be 1 -> 5 -> 9 -> 4 -> 3 -> 10 -> 5 -> 6.

        ourList.remove(7);
        System.out.println(ourList); // Should be 1 -> 5 -> 9 -> 4 -> 3 -> 10 -> 5.

        ourList.remove(7); //There is no position 7.
        System.out.println(ourList); // Should be 1 -> 5 -> 9 -> 4 -> 3 -> 10.

        ourList.remove(12); //There is no position 12.
        System.out.println(ourList); // Should be 1 -> 5 -> 9 -> 4 -> 3.

        ourList.remove(0);
        System.out.println(ourList); // Should be 5 -> 9 -> 4 -> 3.

        ourList.remove(-156); //There is no position -156
        System.out.println(ourList); // Should be 9 -> 4 -> 3.

        ourList.remove(1);
        System.out.println(ourList); // Should be 9 -> 3.

        ourList.remove(0); // At this point only the item with value of 3 remains.
        ourList.remove(0);
        System.out.println(ourList + "Empty"); // Should be empty.

        System.out.println();

        final OurLinkedList emptyList = new OurLinkedList();

        // I added Empty to every print statement because otherwise It would print an empty string
        emptyList.remove(1200);
        System.out.println(emptyList + "Empty"); // Should remain empty.

        emptyList.remove(-500);
        System.out.println(emptyList + "Empty"); // Should remain empty.

        emptyList.remove(0);
        System.out.println(emptyList + "Empty"); // Should remain empty.

        emptyList.remove(1);
        System.out.println(emptyList + "Empty"); // Should remain empty.

        System.out.println();

        final OurLinkedList oneElement = new OurLinkedList();
        // I added Empty to some print statements because otherwise it would print an empty string

        oneElement.add(98);
        System.out.println(oneElement); // It has one element.

        oneElement.remove(-123);
        System.out.println(oneElement + "Empty"); // Should be empty.

        oneElement.add(98);
        System.out.println(oneElement); // It has one element again.

        oneElement.remove(900);
        System.out.println(oneElement + "Empty"); // Should be empty.

        oneElement.add(98);
        System.out.println(oneElement); // It has one element again.

        oneElement.remove(0);
        System.out.println(oneElement + "Empty"); // Should be empty.

        oneElement.add(98);
        System.out.println(oneElement); // It has one element again.

        oneElement.remove(1);
        System.out.println(oneElement + "Empty"); // Should be empty.
    }
}



