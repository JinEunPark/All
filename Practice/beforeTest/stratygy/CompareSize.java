package beforeTest.stratygy;

public class CompareSize implements Comparable {
    @Override
    public int compareTo(Object object1, Object object2) {
        FileInfo file1= (FileInfo)object1;
        FileInfo file2 = (FileInfo)object2;
        return file1.getSize() - file2.getSize();
    }
}
