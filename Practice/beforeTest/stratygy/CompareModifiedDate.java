package beforeTest.stratygy;

import java.util.Date;

public class CompareModifiedDate implements Comparable{
    @Override
    public int compareTo(Object object1, Object object2){
        FileInfo file1 = (FileInfo)object1;
        FileInfo file2 = (FileInfo)object2;
        return file1.getModifiedDate().compareTo(file2.getModifiedDate());
    }
}
