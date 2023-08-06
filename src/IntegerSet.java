import java.util.ArrayList;

public class IntegerSet {
    private ArrayList<Integer> set;
    private int max_size;

    public IntegerSet(int size) {
        set = new ArrayList<>(size);
        this.max_size = size;
        for (int i = 0; i < size; i++) {
            set.add(0);
        }
    }

    public IntegerSet(IntegerSet obj) {
        this.set = new ArrayList<>(obj.set.size());
        for (Integer element : obj.set) {
            this.set.add(element);
        }
        this.max_size = obj.max_size;
    }

    public void insertElement(int k) {
        if (k >= 0 && k < max_size) {
            set.set(k, 1);
        } else {
            System.out.println("Couldn't insert element as index is out of range. It should be between 0 and " + (max_size - 1));
        }
    }

    public void removeElement(int m) {
        if (m >= 0 && m < max_size) {
            set.set(m, 0);
        } else {
            System.out.println("Couldn't remove element as index is out of range. It should be between 0 and " + (max_size - 1));
        }
    }

    public void printSet() {
        for (int i = 0; i < max_size; i++) {
            if (set.get(i).equals(1)) {
                System.out.print(i + " ");
            }          
            if (set.get(i).equals(0)) {
                System.out.print("---- ");
            }
        }
    }

    public IntegerSet unionOfSets(IntegerSet set1, IntegerSet set2) {
        if (set1.max_size != set2.max_size) {
            System.out.println("Can't create union as both sets' sizes are different!");
            return null;
        }

        IntegerSet unionSet = new IntegerSet(set1.max_size);
//        for (int i = 0; i < unionSet.max_size; i++) {
//            unionSet.set.set(i, 0);
//        }

        for (int i = 0; i < unionSet.max_size; i++) {
            if (set1.set.get(i).equals(1) || set2.set.get(i).equals(1)) {
                unionSet.set.set(i, 1);

            }
        }
        return unionSet;
    }

    public IntegerSet intersectionOfSets(IntegerSet set1, IntegerSet set2) {
        IntegerSet intersectionSet = new IntegerSet(set1.max_size);
        if (set1.max_size != set2.max_size) {
            System.out.println("Can't create intersection as both sets size is different!");
            return null;
        }

//        for (int i = 0; i < intersectionSet.max_size; i++) {
//            intersectionSet.set.set(i, 0);
//        }

        for (int i = 0; i < set1.max_size; i++) {
            if (set1.set.get(i).equals(1) && set2.set.get(i).equals(1)) {
                intersectionSet.set.set(i, 1);
            }
            if (set1.set.get(i).equals(0) || set2.set.get(i).equals(0)) {
                intersectionSet.set.set(i, 0);
            }
        }
        return intersectionSet;
    }


    public boolean findElement(int key) {
        if (key >= 0 && key < max_size) {
            if (set.get(key).equals(1)) {
                return true;
            } else {
                return false;
            }
        } else {
            System.out.println("Invalid key index! Index should be less than " + (max_size - 1));
            return false;
        }
    }
}
