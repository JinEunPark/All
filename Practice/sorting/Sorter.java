package sorting;

public class Sorter {

    Comparable compare;

    public Sorter(Comparable comparable) {
        this.compare = comparable;//의존성 주입
    }

    public void setComparable(Comparable comparable) {
        this.compare = comparable;
    }//의존성 정렬알고리즘을 동적으로 변경하기 위해서 사용함.

    public void bubbleSort(Object[] objects) {


        for (int i = 0; i < objects.length - 1; i++) {
            for (int j = 0; j < objects.length - i - 1; j++) {

                if (compare.compareTo(objects[j], objects[j + 1]) > 0) { // swap
                    Object temp = objects[j];
                    objects[j] = objects[j + 1];
                    objects[j + 1] = temp;
                }
            }
        }

    }

}
//comparable인터페이스를 FileInfo가 구현을 해야하는것인지?
