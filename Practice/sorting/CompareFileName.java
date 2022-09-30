package sorting;

public class CompareFileName implements Comparable {

    @Override
    public int compareTo(Object object1, Object object2) {
        FileInfo file1 = (FileInfo)object1;
        //down casting 한다음에 자식 객체의 레퍼런스 변수로 받지 않으면 자식객체의 함수를 사용할 수 없음!!
        FileInfo file2 = (FileInfo)object2;

        return file1.getName().compareTo(file2.getName());

    }


}
