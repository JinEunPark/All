package fortheTest.sorting;

public class CompareModifiedDate implements Comparable{
    @Override
    public int compareTo(Object object1, Object object2) {

        FileInfo file1 = (FileInfo)object1;
        //down casting 한다음에 자식 객체의 레퍼런스 변수로 받지 않으면 자식객체의 함수를 사용할 수 없음!!
        FileInfo file2 = (FileInfo)object2;

        return file1.getModifiedDate().compareTo(file2.getModifiedDate());



    }
//    It returns the value 0 if the argument Date is equal to this Date.
//    It returns a value less than 0 if this Date is before the Date argument.
//    It returns a value greater than 0 if this Date is after the Date argument.


}
