package beforeTest.stratygy;

public class Sorter {

    Comparable comparable;

    public Sorter(Comparable comparable) {
        this.comparable = comparable;
    }


    public void setComparable(Comparable comparable) {
        this.comparable = comparable;
    }

    public void bubbleSort(Object[] objects) {

        for (int i = 0; i < objects.length-1; i++) {
            for (int j = 0; j < objects.length-1; j++) {
                if (comparable.compareTo(objects[j], objects[j + 1]) > 0) {
                    Object tmp = objects[j];
                    objects[j] = objects[j + 1];
                    objects[j + 1] = tmp;
                }
            }
        }

    }
}
