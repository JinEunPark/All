package newcompiler;

public class MyCompiler implements Compiler{
    private String fileName;
    StringBuilder stringBuilder = new StringBuilder();


    public String getFileName() {
        return fileName;
    }
    public void setFileName(String fileName){
        this.fileName = fileName;
    }

    @Override
    public ObjectCode compile(SourceCode sourceCode) {
        fileName = sourceCode.getFileName();
        System.out.println("Compiling code: "+ fileName);
        stringBuilder.append(fileName);
        stringBuilder.replace(fileName.indexOf("."),fileName.length()-1,".obj");
        sourceCode.setFileName(stringBuilder.toString());
        ObjectCode objectCode  = new ObjectCode(sourceCode.getFileName());
        System.out.println("generating object code: "+ objectCode.getFileName());
        stringBuilder.setLength(0);

        return  objectCode;
    }
}
