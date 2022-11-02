package fortheTest.decoinfo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class LoadHudDisplays implements LoadDisplayInterface{

    String filename;
    LoadHudDisplays(String filename){
        this.filename = filename;
    }
    @Override
    public ArrayList<String> load() {

        ArrayList<String> arrayList = new ArrayList<>();

        try{
            BufferedReader bufferedReader = new BufferedReader( new FileReader(filename));
            String str;


            while(( str = bufferedReader.readLine()) != null){
                arrayList.add(str);
            }

        }catch(IOException e){
            e.printStackTrace();
        }
        return arrayList;
    }
}
