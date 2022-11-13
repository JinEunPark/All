package newcompiler;

import java.util.List;

public class MyLinker implements Linker {
    private String fileName;
    StringBuilder stringbuilder = new StringBuilder();
    @Override
    public Executable link(String exeFileName, List<ObjectCode> objFiles) {
        System.out.println("linking\n");
        for (ObjectCode objectCode : objFiles) {
            System.out.println(objectCode.getFileName());
            stringbuilder.append(objectCode.getFileName() + "\n");
        }
        Executable executable = new Executable(exeFileName,stringbuilder.toString());
        stringbuilder.setLength(0);
        return executable;
    }


    @Override
    public Executable link(String exeFileName, ObjectCode[] objFiles) {

        System.out.println("linking\n");
        for (int i = 0; i < objFiles.length; i++) {
            System.out.println(objFiles[i].getFileName());
            stringbuilder.append(objFiles[i].getFileName() + "\n");
        }
        Executable executable = new Executable(exeFileName,stringbuilder.toString());
        stringbuilder.setLength(0);
        return executable;
    }
}
