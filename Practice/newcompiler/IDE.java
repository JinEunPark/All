package newcompiler;

import java.util.ArrayList;
import java.util.List;

public class IDE implements Builder {

    private String projectName;
    Preprocessor preprocessor = new MyPreprocessor();
    Linker linker = new MyLinker();
    Compiler compiler = new MyCompiler();
    ArrayList<SourceCode> sourceCodeArrayList = new ArrayList<>();
    ArrayList<ObjectCode> objectCodeArrayList = new ArrayList<>();

    public IDE(String projectName) {
        this.projectName = projectName;
    }

    @Override
    public void createProject(String projectName) {
        this.projectName = projectName;
    }

    @Override
    public Executable build(List<SourceCode> sourceCodeList) {

        for (SourceCode sourceCode : sourceCodeList) {
            sourceCodeArrayList.add(preprocessor.preprocess(sourceCode));
        }
        for(SourceCode sourceCode: sourceCodeArrayList){
            objectCodeArrayList.add(compiler.compile(sourceCode));
        }
        Executable executable = linker.link(projectName,objectCodeArrayList);
        return executable;

    }

    @Override
    public Executable build(SourceCode[] sourceCodes) {
        for(int i = 0; i<sourceCodes.length; i++){
            sourceCodeArrayList.add(preprocessor.preprocess(sourceCodes[i]));
        }
        for(SourceCode sourceCode: sourceCodeArrayList){
            objectCodeArrayList.add(compiler.compile(sourceCode));
        }
        Executable executable = linker.link(projectName,objectCodeArrayList);
        return executable;
    }
}
