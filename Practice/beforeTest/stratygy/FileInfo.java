package beforeTest.stratygy;

import java.util.Date;

public class FileInfo {
    String name;
    String type;
    int size;
    Date modifiedDate;

    public FileInfo(String name, String type, int size, Date date){
        this.name = name;
        this.type = type;
        this.size = size;
        this.modifiedDate = date;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();//stringbuilder를 사용해서 파일의 정보를 반환하는 result
        //String을 만들었습니다.
        stringBuilder.append("Name: ");
        stringBuilder.append(this.name);
        stringBuilder.append("\n");
        stringBuilder.append("Type: ");
        stringBuilder.append(this.type);
        stringBuilder.append("\n");
        stringBuilder.append("Size: ");
        stringBuilder.append(this.size);
        stringBuilder.append("\n");
        stringBuilder.append("ModifiedDate: ");
        stringBuilder.append(this.modifiedDate);
        stringBuilder.append("\n");
        String result = stringBuilder.toString();
        return result;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

}
