public class Main {
    public static void main(String[] args) {
        IntegerSet set1 = new IntegerSet(10);
        IntegerSet set2 = new IntegerSet(10);
        set1.insertElement(2);
        set1.insertElement(3);
        set1.insertElement(6);
        set1.insertElement(8);
        set2.insertElement(8);
        set2.insertElement(9);
        set2.insertElement(0);
        set2.insertElement(2);
        System.out.print("Set 1: ");
        set1.printSet();
        System.out.print("\n");
        System.out.print("Set 2: ");
        set2.printSet();
        System.out.print("\n");
        System.out.print("Union of both sets: ");
        IntegerSet unionSet = new IntegerSet(10);
        unionSet.unionOfSets(set1, set2).printSet();
        System.out.print("\n");
        System.out.print("Intersection of both sets: ");
//        IntegerSet intersectionSet = new IntegerSet(10);
        new IntegerSet(10).intersectionOfSets(set1, set2).printSet();
        System.out.print("\nCopy Constructor: ");
        new IntegerSet(set1).printSet();    //Anonymous Object
        System.out.print("\nFinding Element: ");
        System.out.println(set1.findElement(4));
    }
}