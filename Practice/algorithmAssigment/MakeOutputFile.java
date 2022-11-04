package algorithmAssigment;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MakeOutputFile{

    public void makeOutputFile (String prefix, String resultArray, File file) throws IOException {
        if(!file.exists()){
            file.createNewFile();
        }else{
            file.delete();
            file.createNewFile();
        }
        BufferedWriter writer = new BufferedWriter(new FileWriter(file,true));
        writer.write(prefix+": "+resultArray);
        writer.flush();
        writer.close();

    }


}
